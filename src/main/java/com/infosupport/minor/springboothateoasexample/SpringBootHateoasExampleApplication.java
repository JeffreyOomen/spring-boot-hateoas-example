package com.infosupport.minor.springboothateoasexample;

import com.infosupport.minor.springboothateoasexample.domain.Customer;
import com.infosupport.minor.springboothateoasexample.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootHateoasExampleApplication implements CommandLineRunner {

	@Autowired
	private CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHateoasExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Customer c1 = new Customer("Jeffrey", "Oomen");
		this.customerRepository.save(c1);
	}
}
