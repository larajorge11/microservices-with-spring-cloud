package com.project.davor.eureka.DepartmentService.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class Employee {

    private Long id;
    private String name;
    private int age;
    private String position;

}
