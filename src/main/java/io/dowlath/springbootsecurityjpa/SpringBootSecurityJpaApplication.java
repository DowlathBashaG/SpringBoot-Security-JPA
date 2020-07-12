package io.dowlath.springbootsecurityjpa;

import io.dowlath.springbootsecurityjpa.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringBootSecurityJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityJpaApplication.class, args);
	}

}
