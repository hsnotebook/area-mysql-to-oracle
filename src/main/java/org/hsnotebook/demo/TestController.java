package org.hsnotebook.demo;

import org.hsnotebook.demo.mysql.MySqlArea;
import org.hsnotebook.demo.mysql.MySqlAreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Autowired
	private MySqlAreaRepository mysqlAreaRepository;

	@RequestMapping(path = "/mysql-areas")
	public Page<MySqlArea> findByPage() {
		return mysqlAreaRepository.findByOrderByParentIdAscSortAsc(new PageRequest(0, 20));
	}
	
	@RequestMapping(path = "/mysql-areas/{id}")
	public MySqlArea findOne(@PathVariable String id) {
		return mysqlAreaRepository.findOne(id);
	}

}
