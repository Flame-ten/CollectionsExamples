package com.epam.andrew;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListCollectionFillExample {

    public static void main(String[] args) {
	List<String> list = Arrays.asList("red", "green", "blue");
        Collections.fill(list, "black");
        System.out.println(list);
    }
}
