package com.epam.andrew;

import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;

public class ListGreforianCalendarExample {

    public static void main(String[] args) {
	List<String> list1 = Arrays.asList("yellow", "red", "green", "blue");
	List<String> list2 = Arrays.asList("while", "black");
        Collections.copy(list1,list2);
        System.out.println(list1);
        List<GregorianCalendar> list3 = Collections.nCopies(5,
                new GregorianCalendar(2005,0,1));

    }
}
