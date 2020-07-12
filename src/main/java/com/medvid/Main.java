package com.medvid;

import com.medvid.comparator.MyComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {
        System.out.println("Before delete: " + creteListNumbers());
        System.out.println("After delete: " + multipleOfThree(creteListNumbers()));

        System.out.println(changeElementOfList(crateFruitsList()));

        System.out.println("First Array: " + createElementLists1());
        System.out.println("Second Array: " + createElementList2());
        System.out.println("identical elements: " + findIdenticalItems(createElementLists1(),createElementList2()));


        System.out.println("Tree set list " + createTreSetList());

    }

    public static ArrayList<Integer> creteListNumbers(){
        ArrayList<Integer> listWithNumbers = new ArrayList<>();
        listWithNumbers.add(3);
        listWithNumbers.add(9);
        listWithNumbers.add(11);
        listWithNumbers.add(18);
        listWithNumbers.add(20);
        listWithNumbers.add(22);
        return listWithNumbers;
    }

    public static List<String> crateFruitsList(){
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Orange");
        fruitList.add("Melon");
        return fruitList;
    }

    public static ArrayList<Integer> createElementLists1(){
        ArrayList<Integer> listWithElements = new ArrayList<>();
        listWithElements.add(3);
        listWithElements.add(9);
        listWithElements.add(11);
        listWithElements.add(18);
        listWithElements.add(20);
        listWithElements.add(22);
        return listWithElements;
    }

    public static ArrayList<Integer> createElementList2(){
        ArrayList<Integer> listWithElements2 = new ArrayList<>();
        listWithElements2.add(13);
        listWithElements2.add(9);
        listWithElements2.add(111);
        listWithElements2.add(18);
        listWithElements2.add(201);
        listWithElements2.add(223);
        return listWithElements2;
    }

    public static Set<Integer> createTreSetList(){
        Set<Integer> treeList = new TreeSet<>(new MyComparator());
        treeList.add(13);
        treeList.add(1);
        treeList.add(3);
        treeList.add(111);

        return treeList;
    }

    public static ArrayList<Integer> multipleOfThree(ArrayList<Integer> listWithNumbers){

        listWithNumbers.removeIf(n -> (n % 3 == 0));
        return listWithNumbers;
    }

    public static List<String> changeElementOfList(List<String> fruitList){

        if(fruitList.contains("Orange")){
            fruitList.set(fruitList.indexOf("Orange"), "Grapefruit");
        } else {
            System.out.println("Sorry, No such element in array");
        }
        return fruitList;
    }

    public static ArrayList<Integer> findIdenticalItems(ArrayList<Integer> listWithElements , ArrayList<Integer> listWithElements2){
        listWithElements2.retainAll(listWithElements);
        return listWithElements2;
    }
}
