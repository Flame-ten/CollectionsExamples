package com.epam.andrew;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionMaxMinExample {

    public static void main(String[] args) {
        Collection<String> collections = Arrays.asList("red", "green", "blue");
        System.out.println(Collections.max(collections));
        System.out.println(Collections.min(collections));
    }
}
