package com.epam.andrew;

import java.util.*;

public class HashtableExample {
    public static void main(String[] args){
        Hashtable<String,String> ht = new Hashtable<String, String>();
        ht.put("1" , "Open");
        ht.put("2", "Two");
        ht.put("3", "Three");
        Collection c = ht.values();
        Iterator itr = c.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        c.remove("One");
        Enumeration e = ht.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
