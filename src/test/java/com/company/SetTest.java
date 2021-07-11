package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class SetTest {
    @Test
    void addTest(){
        Set<Integer> set = new TreeSet<>();
        boolean check = false;

        set.add(1);
        check = set.contains(1);

        assertTrue(check);
    }

    @Test
    void addAllTest(){
        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();
        set2.add(1);set2.add(2);set2.add(3);

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));

        set1.addAll(list);

        assertEquals(set1,set2);

    }

    @Test
    void containerSetTest(){
        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>(Arrays.asList(1));

        set1.add(1);
        set1.add(1);

        assertEquals(set1,set2);
    }

    @Test
    void firstTest(){
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(1,2,3,4));

        int firstElem = set.first();

        assertEquals(firstElem,1);
    }

    @Test
    void cloneTest(){
        TreeSet<Integer> set1 = new TreeSet<>(Arrays.asList(1,2,3,4));
        TreeSet<Integer> set2 = new TreeSet<>(Arrays.asList(1,2,3,4));

        set1 = (TreeSet<Integer>) set2.clone();

        assertEquals(set1,set2);
    }

}
