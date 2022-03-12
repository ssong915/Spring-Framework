package com.sparta.week02.controller;

import com.sparta.week02.Service.CourseService;
import com.sparta.week02.domain.Course;
import com.sparta.week02.domain.CourseRepository;
import com.sparta.week02.domain.CourseRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class CourseController {

    private final CourseRepository courseRepository;

    @GetMapping("/api/courses")
    public List<Course> getCourses() {
        return courseRepository.findAll();
    }private final CourseService courseService;

    // PostMapping을 통해서, 같은 주소라도 GetMapping 방식이 다름을 구분할 수 있다.
    @PostMapping("/api/courses")
    public Course createCourse(@RequestBody CourseRequestDto requestDto) {
        // requestDto: 데이터를 물고다니는 넘
        // @RequestBody: Controller에서 요청을 받는 녀석이라는 것을 알려준다, 넘어오는 넘을 잘 받기 위해서!

        // 저장하는 것은 Dto가 아니라 Course이니, Dto의 정보를 course에 담아야 합니다.
        // Course에서 위와 같은 생성자를 만들어 주자.
        Course course = new Course(requestDto);

        // JPA를 이용하여 DB에 저장하고, 그 결과를 반환합니다.
        return courseRepository.save(course);
    }

    @PutMapping("/api/courses/{id}")
    public Long updateCourse(@PathVariable Long id, @RequestBody CourseRequestDto requestDto) {
        // 변경하고싶은 id, 변경할 내용을 받아온다.
        // @PathVariable: {id}로 받아온 넘임을 명시
        // @RequestBody: Controller에서 요청을 받는 녀석이라는 것을 알려준다, 넘어오는 넘을 잘 받기 위해서!
        return courseService.update(id, requestDto);
    }

    @DeleteMapping("/api/courses/{id}")
    public Long deleteCourse(@PathVariable Long id){
        courseRepository.deleteById(id);
        return id;
    }
}
