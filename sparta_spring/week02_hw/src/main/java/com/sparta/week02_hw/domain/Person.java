package com.sparta.week02_hw.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Person {

    @Id // ID 값, Primary Key로 사용하겠다는 뜻입니다.
    @GeneratedValue(strategy = GenerationType.AUTO) // 자동 증가 명령입니다.
    private Long id;

    @Column(nullable = false) // 컬럼 값이고 반드시 값이 존재해야 함을 나타냅니다.
    private String name;

    @Column(nullable = false)
    private String address;

    public Person(PersonRequestDto requestDto){
        this.name = requestDto.getName();
        this.address = requestDto.getAddress();
    }

    public Person(String name,String address){
        this.name = name;
        this.address = address;
    }

    public void update(PersonRequestDto requestDto){
        this.name = requestDto.getName();
        this.address = requestDto.getAddress();
    }
}
