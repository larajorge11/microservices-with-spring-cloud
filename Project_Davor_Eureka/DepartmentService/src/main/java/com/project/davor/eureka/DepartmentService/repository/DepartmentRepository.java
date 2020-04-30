package com.project.davor.eureka.DepartmentService.repository;

import com.project.davor.eureka.DepartmentService.domain.Department;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DepartmentRepository {

    private List<Department> departments = new ArrayList<>();

    public Department add(Department department) {
        department.setId(Long.valueOf(departments.size() + 1 ));
        departments.add(department);
        return department;
    }

    public Department findById(Long id) {
        Optional<Department> optionalDepartment = departments.stream().filter(x -> x.getId() == id).findFirst();
        return optionalDepartment.isPresent() ? optionalDepartment.get() : null;
    }

    public List<Department> findByOrganization(Long organizationId) {
        return departments.stream().filter(x -> x.getOrganizationId() == organizationId).collect(Collectors.toList());
    }

    public List<Department> findAll() {
        return departments;
    }
}
