package com.example.flipr.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document
public class Employee {

    @Id
    Integer id;
    String name;
    String email;
    String contactNo;
    String department;
    Date joiningDate;
    String password;

}
