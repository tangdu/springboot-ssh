package com.tdu.autoconfiguration;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(
	basePackages={
		"com.tdu.service",
		"com.tdu.web"
	}
)
@EnableJpaRepositories(
	basePackages={
		"com.tdu.repository"
	}
)
@EntityScan(
	basePackages={
		"com.tdu.entity"
	}
)
public class ComponentScanAutoConfiguration {

}
