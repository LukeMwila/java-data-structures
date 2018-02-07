package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

	    /**
         *  ARRAYS
         * */

        int [] arrInts = {2, 4, 5, 8};
        String [] arrStrings = {"Jonah", "Michael", "James", "John", "Francis", "Daniel"};

        for (int integer : arrInts) {
            System.out.println(integer);
        }

        for(String name: arrStrings){
            System.out.println("Name: " + name);
        }

        // Adding to arrays
        int[] newArray = new int[5];
        String[] newStringArray = new String [5];

        newArray[0] = 32;
        newArray[1] = 55;
        newArray[2] = 171;
        newArray[3] = 27;
        newArray[4] = 72;

        // Sort
        Arrays.sort(newArray);

        for(int number : newArray){
            System.out.println("Item #: " + number);
        }

        newStringArray[0] = "James";
        newStringArray[1] = "Rdoriguez";
        newStringArray[2] = "Camilla";
        newStringArray[3] = "Franco";
        newStringArray[4] = "Fred";

        for(String name : newStringArray){
            System.out.println("Name before sorting: " + name);
        }

        // Sort
        Arrays.sort(newStringArray);

        for(String name : newStringArray){
            System.out.println("Name after sorting: " + name);
        }

        /**
         *  ARRAY LISTS
         * */

        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cheetah");
        animals.add("Bear");

        // Remove an item from the array

        if(animals.contains("Tiger")){
            animals.remove("Tiger");
        }

        if(animals.isEmpty()){
            System.out.println("The array list is empty");
        }else{
            for(String animal : animals){
                System.out.println(animal);
            }
        }

        /**
         * HASH MAP
         * */

        HashMap users = new HashMap<>();
        HashMap<String, Integer> newUser = new HashMap<>();

        newUser.put("Sue", 34);

        System.out.println(newUser.get("Sue"));

        users.put("Kealy", 34);
        users.put("Bonni", 25);

        if(users.containsKey("Kealy")){
            System.out.println("Yay!");
        }else{
            System.out.println("Nay!");
        }

        System.out.println(users.get("Kealy"));
        System.out.println(users.get("Bonni"));

        System.out.println("Values : " + users.values());
        System.out.println("Entire values : " + users.entrySet());

        Iterator it = users.entrySet().iterator();
        while(it.hasNext()){
           Map.Entry pair = (Map.Entry) it.next();
           System.out.println(pair.getKey() + " - " + pair.getValue());
        }

    }
}
