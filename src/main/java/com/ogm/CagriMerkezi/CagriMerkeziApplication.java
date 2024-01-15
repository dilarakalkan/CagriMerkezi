package com.ogm.CagriMerkezi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.ogm.CagriMerkezi")
@EnableJpaRepositories("com.ogm.CagriMerkezi")
public class CagriMerkeziApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(CagriMerkeziApplication.class, args);
	}

}

