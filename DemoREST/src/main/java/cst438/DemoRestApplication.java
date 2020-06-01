package cst438;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRestApplication.class, args);
	}
	
	@Bean
	Random getRandom() {
		return new Random();
	}

}
