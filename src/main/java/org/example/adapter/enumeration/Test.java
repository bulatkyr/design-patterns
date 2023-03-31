package org.example.adapter.enumeration;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("1111");
        list.add("2222");

        Enumeration<Object> enumeration = new IteratorEnumerationAdapter(list.iterator());

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

    }
}
