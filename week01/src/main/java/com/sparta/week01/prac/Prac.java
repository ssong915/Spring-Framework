package com.sparta.week01.prac;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Prac {
    public static void main(String[] args) {
        float c = 3.7f; // 소수는 뒤에 f 를 붙여주어야 함
        Long d = 10000000001L; // 100억 이후는 Long
        
        int myAge = 22;
        boolean isAdult = myAge > 22;

        /* 리스트 */
        // 리스트 선언
        List<String> myList = new ArrayList<>();
        String course1 = "웹개발종합반";
        String course2 = "앱개발종합반";
        // 리스트에 추가
        myList.add(course1);
        myList.add(course2);
        // 리스트 출력
        System.out.println(myList);
        System.out.println(myList.get(1));
        myList.remove(1);

}
}
