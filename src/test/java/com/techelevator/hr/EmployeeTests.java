package com.techelevator.hr;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class EmployeeTests {

    @Test
    public void getFullNameReturnsCorrectFormat() {
        Employee employee = new Employee("Test", "Testerson");
        String fullName = employee.getFullName();

        assertEquals("The employee full name is not in the correct format.", "Testerson, Test", fullName);
    }

    @Test
    public void raiseSalaryTest_Positive() {
        Employee employee = new Employee("Test", "Testerson");
        employee.setSalary(100);
        employee.raiseSalary(5);

        assertEquals("The employee raise of 5% was not computed correctly.", employee.getSalary(), 100 * 1.05, 0.0);
    }

    @Test
    public void raiseSalaryTest_Negative() {
        Employee employee = new Employee("Test", "Testerson");
        employee.setSalary(100);
        employee.raiseSalary(-10); //"raise" by negative 10%

        assertEquals("Salary should remain the same when raise percentage is negative.", 100, employee.getSalary(), 0.0);
    }

    @Test
    public void grooming_100_walking_50_sitting_25_yields_150() {
        Employee sut = new Employee("Test", "Testerson");
        Map<String, Double> testListOfServices = new HashMap<String, Double>();
        testListOfServices.put("Grooming", 100.00);
        testListOfServices.put("Walking", 50.00);
        testListOfServices.put("Sitting", 25.00);

        double result = sut.getBalanceDue(testListOfServices);
        Assert.assertEquals(result, 150.00, 0.001);
    }
}
