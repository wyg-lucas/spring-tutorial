package com.lucas.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * @date: 2021/4/20
 * @author: wangyg
 */


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class People {

    private String name;

    // 如果显示的定义了Autowired的required的属性为false则说明这个对象可以为null，否则不能为null
    @Autowired(required = false)
    private Dog dog;

    @Autowired
    @Qualifier(value = "cat11")
    private Cat cat;


}
