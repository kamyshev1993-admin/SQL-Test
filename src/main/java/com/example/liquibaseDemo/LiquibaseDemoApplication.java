package com.example.liquibaseDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class LiquibaseDemoApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(LiquibaseDemoApplication.class, args);
	}

	@Override
	public void run(String...args) throws InterruptedException {
		Thread.sleep(5000);
		String sql = "SELECT * FROM CLIENT";
		System.out.println(jdbcTemplate.queryForList(sql));
	}

}
