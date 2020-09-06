// Java Program to Convert the ArrayList to an array and vice versa part-1

// Convert the Arraylist into Array

import java.util.ArrayList;

public class a45{

    public static void main(String args[]){
    ArrayList<String> languages = new ArrayList<>();

    languages.add("java");
    languages.add("python");
    languages.add("c++");
    languages.add("c");

    System.out.println(languages);

    String [] arr = new String[languages.size()];

    languages.toArray(arr);
    for(String i:arr){
        System.out.println(i);

    }
}}

