package com.soloWeb.springbootStudy.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter                     // 모든 필드 getter 추가
@RequiredArgsConstructor    // final 필드의 생성자 추가
public class HelloResponseDto {

    private final String name;
    private final int amount;
}
