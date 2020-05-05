package com.project.davor.eureka.OrganizationService.domain;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class Organization {

    @Setter
    private Long id;
    private String name;
    private String address;
    @Setter
    private List<Department> departments;
    @Setter
    private List<Employee> employees;
}
