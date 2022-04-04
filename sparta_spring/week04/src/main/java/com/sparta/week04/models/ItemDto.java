package com.sparta.week04.models;

import lombok.Getter;
import org.json.JSONObject;

@Getter
public class ItemDto {
    // title, link, image, lprice 가 필요하다
    private String title;
    private String link;
    private String image;
    private int lprice;

    public ItemDto(JSONObject itemJson) {
        this.title = itemJson.getString("title");
        this.link = itemJson.getString("link");
        this.image = itemJson.getString("image");
        this.lprice = itemJson.getInt("lprice");
    }
}