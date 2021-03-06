package com.project.davor.eureka.DepartmentService;

import com.project.davor.eureka.DepartmentService.domain.Department;
import com.project.davor.eureka.DepartmentService.repository.DepartmentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableSwagger2
public class DepartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

	@Bean
	public Docket swaggerApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.project.davor.eureka.EmployeeService.controller"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(new ApiInfoBuilder().version("1.0").title("Employee API").description("Documentation Employee API v1.0").build());
	}

	@Bean
	DepartmentRepository repository() {
		DepartmentRepository repository = new DepartmentRepository();
		repository.add(Department.builder().organizationId(1L).name("Development").build());
		repository.add(Department.builder().organizationId(1L).name("Operations").build());
		repository.add(Department.builder().organizationId(2L).name("Development").build());
		repository.add(Department.builder().organizationId(2L).name("Operations").build());

		return repository;
	}

}
