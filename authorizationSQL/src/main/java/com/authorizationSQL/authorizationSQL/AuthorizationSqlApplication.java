package com.authorizationSQL.authorizationSQL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


	@EnableJpaRepositories(basePackages = "com.authorizationSQL.authorizationSQL.repository")
	@SpringBootApplication
	public class AuthorizationSqlApplication {


		public static void main(String[] args) {
			SpringApplication.run(AuthorizationSqlApplication.class, args);
		}
}
