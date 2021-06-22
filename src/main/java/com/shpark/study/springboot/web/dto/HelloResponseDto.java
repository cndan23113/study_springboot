package com.shpark.study.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloResponseDto {
//test 주석 2
    private final String name;
    private final int amount;
}
