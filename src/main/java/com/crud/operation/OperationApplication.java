package com.crud.operation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

import javax.sql.DataSource;

@SpringBootApplication
public class OperationApplication {

	public static void main(String[] args) {

		SpringApplication.run(OperationApplication.class, args);
	}

}
