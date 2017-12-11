package org.hsnotebook.demo.service;

import java.util.List;

import org.hsnotebook.demo.mysql.MySqlArea;
import org.hsnotebook.demo.mysql.MySqlAreaRepository;
import org.hsnotebook.demo.oracle.OracleArea;
import org.hsnotebook.demo.oracle.OracleAreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class ConvertService {
	
	@Autowired
	private MySqlAreaRepository mysqlAreaRepository;

	@Autowired
	private OracleAreaRepository oracleAreaRepository;
	
	public void convert() {
		int pageNum = 0;
		int pageSize = 40;
		boolean isLast = false;
		int convertNum = 1;
		
		System.out.println("start convert...........");
		while (!isLast) {
			Page<MySqlArea> pageInfo = mysqlAreaRepository.findByOrderByParentIdAscSortAsc(new PageRequest(pageNum, pageSize));
			isLast = pageInfo.isLast();
			List<MySqlArea> mysqlAreas = pageInfo.getContent();
			for (MySqlArea mysqlArea: mysqlAreas) {
				System.out.println("convert " + mysqlArea.getName() + " " + convertNum);
				convertNum++;
				OracleArea oracleArea = new OracleArea();
				oracleArea.setCode(Integer.valueOf(mysqlArea.getCode()));
				oracleArea.setName(mysqlArea.getName());
				if (mysqlArea.getId().equals("1")) {
					oracleArea.setParentCode(0);
				} else if (mysqlArea.getParentId().equals("0")) {
					oracleArea.setParentCode(100000);
				} else {
					oracleArea.setParentCode(Integer.valueOf(mysqlArea.getParentId()));
				}
				oracleArea.setLatitude(mysqlArea.getLatitude());
				oracleArea.setLongitude(mysqlArea.getLongitude());
				oracleArea.setSort(mysqlArea.getSort());
				oracleArea.setMapLevel(mysqlArea.getMapLevel());
				oracleAreaRepository.save(oracleArea);
			}
			pageNum++;
			
		}
		System.out.println("convert completed...........");
		

		
	}
}
