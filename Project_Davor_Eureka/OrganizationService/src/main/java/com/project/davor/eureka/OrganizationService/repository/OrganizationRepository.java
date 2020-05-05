package com.project.davor.eureka.OrganizationService.repository;

import com.project.davor.eureka.OrganizationService.domain.Organization;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrganizationRepository {

    private List<Organization> organizations = new ArrayList<>();

    public Organization add(Organization organization) {
        organization.setId(Long.valueOf(organizations.size() + 1));
        organizations.add(organization);
        return  organization;
    }

    public Organization findById(Long id) {
        Optional<Organization> organizationOptional = organizations.stream().filter(x -> x.getId() == id).findFirst();
        if (organizationOptional.isPresent()) {
            return organizationOptional.get();
        } else {
            return null;
        }
    }

    public List<Organization> findAll() {
        return organizations;
    }
}
