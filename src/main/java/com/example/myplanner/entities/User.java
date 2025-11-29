package com.example.myplanner.entities;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String age1;
    private String adresse;
}
