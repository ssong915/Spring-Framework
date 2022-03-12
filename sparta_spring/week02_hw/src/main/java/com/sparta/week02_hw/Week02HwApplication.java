package com.sparta.week02_hw;

import com.sparta.week02_hw.domain.Person;
import com.sparta.week02_hw.domain.PersonRepository;
import com.sparta.week02_hw.service.PersonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Week02HwApplication {

	public static void main(String[] args) {
		SpringApplication.run(Week02HwApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(PersonRepository personRepository, PersonService personService) {
		return (args) -> {
			personRepository.save(new Person("뽀로로", "서울"));

			System.out.println("데이터 인쇄");
			List<Person> personList = personRepository.findAll();
			for (int i = 0; i < personList.size(); i++) {
				Person person = personList.get(i);
				System.out.println(person.getId());
				System.out.println(person.getName());
				System.out.println(person.getAddress());
			}
		};
	}
}
