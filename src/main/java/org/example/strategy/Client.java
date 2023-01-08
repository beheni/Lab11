package org.example.strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    private String name;
    private int id = iid++;
    private static int iid = 0;
    private int age;
    private String sex;
    private String email;
}
