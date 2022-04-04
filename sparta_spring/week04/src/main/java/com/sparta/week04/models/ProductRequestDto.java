package com.sparta.week04.models;

import lombok.Getter;

@Getter
public class ProductRequestDto {
    // title, link, image, lprice만 들고다니면 된다.
    private String title;
    private String link;
    private String image;
    private int lprice;
}
