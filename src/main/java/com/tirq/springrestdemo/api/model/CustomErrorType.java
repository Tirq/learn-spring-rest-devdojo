package com.tirq.springrestdemo.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class CustomErrorType {

    @Getter
    private final String errorMessage;

}
