package com.idat.laterraza;

import com.idat.laterraza.domain.config.FileStorageProperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties({FileStorageProperties.class})
@SpringBootApplication
public class LaterrazaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaterrazaApplication.class, args);
	}

}
