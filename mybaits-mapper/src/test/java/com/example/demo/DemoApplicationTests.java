package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest("com.example.demo.config.DataSourceConfig")
public class DemoApplicationTests {

	@Autowired
	DataSource dataSource;
	@Test
	public void contextLoads() {
		System.out.println(dataSource);
	}

}
