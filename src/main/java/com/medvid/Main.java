package com.medvid;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {
        multipleOfThree();
        changeElementOfList();
        findIdenticalItems();
        SortOfMyCompare();

    }

    public static void multipleOfThree(){
        ArrayList<Integer> listWithNumbers = new ArrayList<>();
        listWithNumbers.add(3);
        listWithNumbers.add(9);
        listWithNumbers.add(11);
        listWithNumbers.add(18);
        listWithNumbers.add(20);
        listWithNumbers.add(22);

        System.out.println("Before delete: " +listWithNumbers);
        listWithNumbers.removeIf(n -> (n % 3 == 0));
        System.out.println("After delete:" +listWithNumbers);
    }

    public static void changeElementOfList(){
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Orange");
        fruitList.add("Melon");

        if(fruitList.contains("Orange")){
            fruitList.set(fruitList.indexOf("Orange"), "Grapefruit");
        } else {
            System.out.println("Sorry, No such element in array");
        }

        System.out.println(fruitList);
    }

    public static void findIdenticalItems(){
        ArrayList<Integer> listWithElements = new ArrayList<>();
        ArrayList<Integer> listWithElements2 = new ArrayList<>();

        listWithElements.add(3);
        listWithElements.add(9);
        listWithElements.add(11);
        listWithElements.add(18);
        listWithElements.add(20);
        listWithElements.add(22);

        listWithElements2.add(13);
        listWithElements2.add(9);
        listWithElements2.add(111);
        listWithElements2.add(18);
        listWithElements2.add(201);
        listWithElements2.add(223);

        System.out.println("First Array: " + listWithElements);
        System.out.println("Second Array: " + listWithElements2);

        listWithElements2.retainAll(listWithElements);
        System.out.println("Matching elements: " + listWithElements2);
    }

    public static void SortOfMyCompare(){
        Set<Integer> treeList = new TreeSet<>(new MyComparator());
        treeList.add(13);
        treeList.add(1);
        treeList.add(3);
        treeList.add(111);

        System.out.println("Tree list: " + treeList);

    }
}
