package com.sparta.week01.prac;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Prac {
    public static void main(String[] args) {
        Tutor tutor = new Tutor();
        String name = "Tom";
        int bio = 25;
        tutor.setBio(bio);
        tutor.setName(name);
        System.out.println(tutor.getBio());
        System.out.println(tutor.getName());

    }

}
