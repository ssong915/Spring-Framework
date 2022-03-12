package com.sparta.week02_hw.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class PersonRequestDto { // 데이터를 물고 다니는 녀석!
    private final String name;
    private final String address;

}