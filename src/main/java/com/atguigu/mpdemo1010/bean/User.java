package com.atguigu.mpdemo1010.bean;

import lombok.Data;

import java.beans.Transient;

@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
