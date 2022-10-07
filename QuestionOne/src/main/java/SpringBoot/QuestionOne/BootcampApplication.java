package SpringBoot.QuestionOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import data.Data;

@SpringBootApplication
@RestController
public class BootcampApplication {
	

	public static void main(String[] args) {
		Data.loadData();
		SpringApplication.run(BootcampApplication.class, args);
	}


}
