package org.example.Ex42.base;

import java.util.ArrayList;

public class PrintResults {
    public void print(ArrayList<ArrayList<String>> dataList) {
        System.out.printf("%-12s%-12s%-12s%n", "Last", "First ", "Salary");
        System.out.println("------------------------------");
        for (int i = 0; i < dataList.size(); i++) {
            ArrayList<String> rowDataList = new ArrayList<String>();
            rowDataList= dataList.get(i);
            System.out.printf("%-12s%-12s%-12s%n",rowDataList.get(0),rowDataList.get(1),rowDataList.get(2));

        }
    }
}
