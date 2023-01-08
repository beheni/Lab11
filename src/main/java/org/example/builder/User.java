package org.example.builder;

import lombok.Builder;

enum Gender {
    MALE, FEMALE
}
@Builder
public class User {
    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;

}