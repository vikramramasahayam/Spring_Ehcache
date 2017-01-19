package com.vik.repo.employee;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.junit.Assert;
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
    public void testGetEmployee() throws InterruptedException {
        repo.getEmployee("hello1");
        repo.getEmployee("hello2");
        repo.getEmployee("hello2");
        repo.getEmployee("hello3");
        repo.getEmployee("hello4");
        repo.getEmployee("hello5");
        repo.getEmployee("hello6");
        repo.getEmployee("hello7");
        Assert.assertThat(repo.getCount(), Matchers.is(7));
        TimeUnit.SECONDS.sleep(300);
        repo.getEmployee("hello1");
        repo.getEmployee("hello3");
        Assert.assertThat(repo.getCount(), Matchers.is(9));
    }

}
