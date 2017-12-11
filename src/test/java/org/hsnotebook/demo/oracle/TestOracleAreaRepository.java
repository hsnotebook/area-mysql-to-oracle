package org.hsnotebook.demo.oracle;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestOracleAreaRepository {
	
	@Autowired
	private OracleAreaRepository oracleAreaRepository;
	
	@Test
	public void context() {
		Assert.assertNotNull(oracleAreaRepository);
	}

	@Test
	public void testFindOne() {
		OracleArea area = oracleAreaRepository.findOne(1);
		Assert.assertNull(area);
	}

}
