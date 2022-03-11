package com.sparta.week02;

import com.sparta.week02.domain.Course;
import com.sparta.week02.domain.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;

@EnableJpaAuditing //생성일자, 수정일자가 자동으로 업데이트 되기 위해 필요함.
@SpringBootApplication
public class Week02Application {

	public static void main(String[] args) {
		SpringApplication.run(Week02Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(CourseRepository repository) {
		return (args) -> {
			// 테이블 생성
			Course course1 = new Course("웹개발의 봄","남병관");
			// 테이블에 저장
			repository.save(course1);
			// 테이블 조회
			List<Course> courseList =  repository.findAll();
			for(int i =0;i<courseList.size();i++){
				Course c = courseList.get(i);
				System.out.println(c.getTitle());
				System.out.println(c.getTutor());
			}
			// id 로 찾고 싶을 때: repository.findById();

		};
	}
}
