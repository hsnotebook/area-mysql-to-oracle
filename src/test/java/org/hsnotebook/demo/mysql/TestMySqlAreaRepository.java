package org.hsnotebook.demo.mysql;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMySqlAreaRepository {
	
	@Autowired
	private MySqlAreaRepository mysqlAreaRepository;
	
	@Test
	public void context() {
		Assert.assertNotNull(mysqlAreaRepository);
	}

	@Test
	public void testFindOne() {
		MySqlArea area = mysqlAreaRepository.findOne("1");
		Assert.assertEquals("Area name is wrong", "中国", area.getName());
	}
	
	@Test
	public void testCount() {
		Assert.assertEquals("Total count should be 3509", 3509L, mysqlAreaRepository.count());
	}

}
