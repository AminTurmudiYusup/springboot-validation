package com.example.validation.dto;

import lombok.Data;
import net.bytebuddy.implementation.bind.annotation.Empty;

import javax.validation.constraints.*;

@Data
public class Registration {
    @NotEmpty(message = "First can't Null!")
    private String firstName;
    @NotEmpty(message = "Last Name can't Null!")
    private String lastName;
    @Min(value=18, message = "age must higher or equals 18")
    private int age;
    @NotEmpty(message = "Email can't Null!")
    private String email;
    @NotEmpty(message = "Phone Number can't Null!")
    private String phone;
    @NotEmpty(message = "Job Name can't Null!")
    private String jobName;
}
