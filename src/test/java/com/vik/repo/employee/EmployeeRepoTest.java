package com.vik.repo.employee;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:spring/application-context.xml"
})
public class EmployeeRepoTest {

    @Autowired
    public EmployeeRepo repo;

    @Test
    public void testGetEmployee() {
        repo.getEmployee("hello1");
        repo.getEmployee("hello2");
        repo.getEmployee("hello2");
        repo.getEmployee("hello3");
        System.out.println(repo);
    }

}
