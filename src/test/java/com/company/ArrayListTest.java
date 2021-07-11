package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {
    @Test
    void addGetTest(){
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);

        int get = arrayList.get(0);

        assertEquals(get,1);
    }

    @Test
    void addIndexTest(){
        List<Integer> arrayList1 = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> arrayList2 = new ArrayList<>(Arrays.asList(1,1,2,3));

        arrayList1.add(1,1);

        assertEquals(arrayList1,arrayList2);
    }

    @Test
    void removeTest(){
        List<Integer> arrayList1 = new ArrayList<>();
        List<Integer> arrayList2 = new ArrayList<>();

        arrayList1.add(1);
        arrayList1.remove(0);
        assertEquals(arrayList1,arrayList2);
    }
    @Test
    void containsTest(){
        List<Integer> arrayList1 = new ArrayList<>(Arrays.asList(1,2,3,3,4,6));
        boolean check = false;

        check = arrayList1.contains(4);
        assertTrue(check);
    }

}
