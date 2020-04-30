package com.project.davor.eureka.DepartmentService.controller;

import com.project.davor.eureka.DepartmentService.client.EmployeeClient;
import com.project.davor.eureka.DepartmentService.domain.Department;
import com.project.davor.eureka.DepartmentService.repository.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    private final DepartmentRepository departmentRepository;
    private final EmployeeClient employeeClient;

    @Autowired
    public DepartmentController(DepartmentRepository departmentRepository, EmployeeClient employeeClient) {
        this.departmentRepository = departmentRepository;
        this.employeeClient = employeeClient;
    }

    @PostMapping("/")
    public Department add(@RequestBody Department department) {
        LOGGER.info("Department add: {}", department);
        return departmentRepository.add(department);
    }

    @GetMapping("/{id}")
    public Department findById(@PathVariable("id") Long id) {
        LOGGER.info("Department find: id={}", id);
        return departmentRepository.findById(id);
    }

    @GetMapping("/")
    public List<Department> findAll() {
        LOGGER.info("Department find");
        return departmentRepository.findAll();
    }

    @GetMapping("/organization/{organizationId}")
    public List<Department> findByOrganization(@PathVariable("organizationId") Long organizationId) {
        LOGGER.info("Department find: organizationId={}", organizationId);
        return departmentRepository.findByOrganization(organizationId);
    }

    @GetMapping("/organization/{organizationId}/with-employees")
    public List<Department> findByOrganizationWithEmployees(@PathVariable("organizationId") Long organizationId) {
        LOGGER.info("Department find: organizationId={}", organizationId);
        List<Department> departments = departmentRepository.findByOrganization(organizationId);
        departments.stream().forEach(x -> x.setEmployees(employeeClient.findByDepartment(x.getId())));
        return departments;
    }

}
