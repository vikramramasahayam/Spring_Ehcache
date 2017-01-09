package com.vik.repo.employee;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import com.vik.employee.Employee;

@Repository("employeeRepo")
public class EmployeeRepoImpl implements EmployeeRepo {

    @Cacheable(value = "studentCache", key = "#name")
    public Employee getEmployee(final String name) {
        System.out.println(" ----- Calling getEmployee ----");
        return new Employee(1, "Charlie Champion");
    }

}
