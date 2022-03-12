package com.sparta.week02.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class CourseRequestDto { // 데이터를 물고 다니는 녀석!
    private final String title;
    private final String tutor;

}
