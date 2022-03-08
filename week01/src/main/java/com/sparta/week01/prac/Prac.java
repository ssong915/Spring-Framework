package com.sparta.week01.prac;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Prac {
    public static int countFruit(String given) {
        List<String> fruits = new ArrayList<>();
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("딸기");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("감");

        int count = 0;
        for (int i = 0; i < fruits.size(); i++) {
            String fruit = fruits.get(i);
            if (given == fruit) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countFruit("메론"));

    }
}
