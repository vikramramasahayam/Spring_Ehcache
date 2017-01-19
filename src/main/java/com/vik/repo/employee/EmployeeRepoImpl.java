package com.vik.repo.employee;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import com.vik.employee.Employee;

@Repository("employeeRepo")
public class EmployeeRepoImpl implements EmployeeRepo {

    private AtomicInteger count = new AtomicInteger(0);

    @Cacheable(value = "studentCache", key = "#name")
    public Employee getEmployee(final String name) {
        System.out.println(" ----- Calling getEmployee ----" + count.incrementAndGet());
        return new Employee(1, "Charlie Champion");
    }

    public int getCount() {
        return count.get();
    }

}
