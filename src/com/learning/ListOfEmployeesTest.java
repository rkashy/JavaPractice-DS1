package com.learning;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class ListOfEmployeesTest {
    ArrayList<EmployeeDetail> tempList = new ArrayList<EmployeeDetail>();
    ListOfEmployees empListOfObjects = new ListOfEmployees();

//    int randomEmpNumber() {
//        int max = 50000;
//        int min = 10000;
//        int range = max - min + 1;
//        int randNum = (int) (Math.random() * range) + min;
//
//        return (randNum);
//    }

    String empObject(int i) {
        String s = "emp";
        return s.concat(Integer.toString(i));
    }

    String randomEmpName() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return (generatedString);
    }

    void setupValues() {
        for (int i = 1; i <= 100; i++) {
            String tempName = randomEmpName();
            String tempLoc = "Gurgaon";
            String temObj = empObject(i);
            EmployeeDetail tempObj = new EmployeeDetail(i, tempName, tempLoc);
            empListOfObjects.addEmpToList(tempObj);
        }
        tempList.addAll(empListOfObjects.getListOfEmp());
    }

    @org.junit.Test
    public void findEmployee() {

        //Fail
//        assertEquals(1,empListOfObjects.findEmployee("AAAAAAAA"));
//        assertEquals(4,empListOfObjects.findEmployee("vvvvvcccc"));

    }

    @org.junit.Test
    public void addEmpToList() {
        setupValues();                          //Add test values to the list
        for(int i=0; i<tempList.size();i++) {     //Check for value of location for each entry
            assertEquals("Gurgaon", tempList.get(i).getEmpLocation());
            assertEquals(i+1,tempList.get(i).getEmpNumber());
        }
    }

    @org.junit.Test
    public void removeEmpFromList() {

    }

    @org.junit.Test
    public void displayEmpList() {                 //Display test entries in the list
        setupValues();

        for(int i=1; i<=10 ;i++)
            System.out.println(tempList.get(i).getEmpName());
    }

    @org.junit.Test
    public void getEmpName() {
        setupValues();

        //Fail
        assertEquals("estilhvafv",tempList.get(1).getEmpName());

    }

    @org.junit.Test
    public void getNumberOfEmployees() {
    }
}