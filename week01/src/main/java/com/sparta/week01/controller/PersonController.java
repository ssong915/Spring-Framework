package com.sparta.week01.controller;

import com.sparta.week01.prac.Course;
import com.sparta.week01.prac.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/myinfo")
    public Person getPerson() {
        Person person = new Person();
        person.setAge(25);
        person.setJob("student");
        person.setName("songkyung");
        return person;
    }
}
