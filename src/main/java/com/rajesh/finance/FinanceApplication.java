package com.rajesh.finance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Application class 
 * @author Rajesh Kumar
 * @version 1.0, June 30,2016
 * @since 1.0
 *
 */
@SpringBootApplication
public class FinanceApplication {
	/**
	 * main method will run FinanceApplication using Spring Boot Application.
	 * 
	 * @param String Array
	 * @return void
	 */
	public static void main(String[] args) {
		SpringApplication.run(FinanceApplication.class, args);
	}
}
