package com.example.demo44.student;

import jakarta.validation.constraints.NotEmpty;

public record StudentDto(@NotEmpty(message = "ismi girmemişsin eşşeq") String firstname, @NotEmpty String lastname, String email, Integer schoolId) {

}
