package com.techelevator.crm;

import org.junit.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerTests {
    private Customer sut;

    @Before
    public void setUp() {
        sut = new Customer("John", "Doe", "867-5309");
    }

    @Test
    public void grooming_100_walking_50_sitting_25_yields_175() {
        Map<String, Double> testListOfServices = new HashMap<String, Double>();
        testListOfServices.put("Grooming", 100.00);
        testListOfServices.put("Walking", 50.00);
        testListOfServices.put("Sitting", 25.00);

        double result = sut.getBalanceDue(testListOfServices);
        Assert.assertEquals(result, 175.00, 0.001);
    }

    @Test
    public void empty_list_yields_0() {
        Map<String, Double> testListOfServices = new HashMap<String, Double>();
        double result = sut.getBalanceDue(testListOfServices);
        Assert.assertEquals(result, 0.00, 0.001);
    }

}
