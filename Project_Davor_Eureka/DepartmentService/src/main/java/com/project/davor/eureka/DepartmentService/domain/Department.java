package com.project.davor.eureka.DepartmentService.domain;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class Department {

    @Setter
    private Long id;
    private Long organizationId;
    private String name;
    @Setter
    private List<Employee> employees;
}
