package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Ex 1
        List<String> list = new ArrayList<String>();

        list.add("Yellow");
        list.add("blue");
        list.add("Red");
        list.add("Green");

        System.out.println(list);
/*
        Ex 2

        for(String color : list){
           System.out.println(color);
        }

        Ex 3

        list.add(0,"Gray");

        Ex 4
*/

        list.get(1);

//        Ex 5

//        list.set(1, "White");

//        Ex 6
//        list.remove(2);

//        Ex 7
//        list.contains("Yellow");


//        Ex 8

//        System.out.println(list.stream().sorted());



//    Ex 9


//        List<String> it = new ArrayList<>();

//        Collections.copy(it, list);

//        Ex 10

//        Collections.shuffle(it);

//        Ex 11
//        Collections.reverse(it);

//        Ex 12
        list.add("Purple");
        list.add("Cyan");
        list.add("Orange");

        List<String> sub = list.subList(0,3);
//        System.out.println(sub);

//        Ex 14

//        Collections.swap(list,0,2);

//        Ex 15

        ArrayList<String> array = new ArrayList<>();
//
        array.addAll(list);
        array.addAll(sub);
//        System.out.println(array);

//        Ex 17
        array.clear();

        Ex 18

    }



}




