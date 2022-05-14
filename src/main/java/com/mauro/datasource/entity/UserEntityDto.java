package com.mauro.datasource.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserEntityDto implements Serializable {
    private final String name;
    private final String surname;
    private final String address;
    private final String city;
}
