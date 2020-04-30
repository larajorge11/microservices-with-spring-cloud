package com.project.davor.eureka.OrganizationService.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class Organization {

    private Long id;
    private String name;
    private String address;
    private List<Department> departments;
    private List<Employee> employees;
}
