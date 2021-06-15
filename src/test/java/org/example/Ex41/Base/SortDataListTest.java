package org.example.Ex41.Base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SortDataListTest {

    @Test
    void is_sort_returns_the_correct_values() {
        // test Array list of data.
        ArrayList<String> testDataList = new ArrayList<String>();
        ArrayList<String> expectedDataList = new ArrayList<String>();

        testDataList.add("World");
        testDataList.add("Hello");


        expectedDataList.add("Hello");
        expectedDataList.add("World");

        // object of the class to test.
        SortDataList sortDataList = new SortDataList();
        testDataList = sortDataList.sort(testDataList);

        // call the method sort of the object

        //
        for (int i = 0; i < testDataList.size(); i++) {

            assertEquals(expectedDataList.get(i),testDataList.get(i));
        }



    }
    @Test
    void is_sort_returns_the_correct_values_set_2() {
        // test Array list of data.
        ArrayList<String> testDataList = new ArrayList<String>();
        ArrayList<String> expectedDataList = new ArrayList<String>();

        testDataList.add("wave");
        testDataList.add("asad");
        testDataList.add("car");
        testDataList.add("Asad");


        expectedDataList.add("Asad");
        expectedDataList.add("asad");
        expectedDataList.add("car");
        expectedDataList.add("wave");

        // object of the class to test.
        SortDataList sortDataList = new SortDataList();
        testDataList = sortDataList.sort(testDataList);

        // call the method sort of the object

        //
        for (int i = 0; i < testDataList.size(); i++) {

            assertEquals(expectedDataList.get(i), testDataList.get(i));
        }
    }
}