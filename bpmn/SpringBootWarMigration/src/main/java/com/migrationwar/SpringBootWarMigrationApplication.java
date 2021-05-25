package com.migrationwar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication

public class SpringBootWarMigrationApplication {

	public final static Logger LOGGER = Logger.getLogger(SpringBootWarMigrationApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWarMigrationApplication.class, args);
	}

}
