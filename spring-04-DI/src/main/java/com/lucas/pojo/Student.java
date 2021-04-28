package com.lucas.pojo;

import lombok.*;

import javax.print.DocFlavor;
import java.util.*;

/**
 * @date: 2021/4/19
 * @author: wangyg
 */


@Getter
@Setter
@ToString
@NoArgsConstructor
public class Student {
    // 通过bean : value 赋值
    private String name;
    private int age;
    // 通过bean : ref 赋值
    private Address address;
    private String[] books;
    private List<String> hobbys;
    private Map<String, String> card;
    private Set<String> games;
    private String wife;
    private Properties info;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


}
