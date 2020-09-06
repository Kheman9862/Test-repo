// Java Program to Convert the ArrayList to an array and vice versa part-1

// Convert Array to ArrayList

import java.util.Arrays;
import java.util.ArrayList;


public class a46{

    public static void main(String args[]){
    String [] array = {"Java", "Python", "C"};
System.out.println(Arrays.toString(array));

ArrayList<String> arr = new ArrayList<>(Arrays.asList(array));
System.out.println(arr);


    }
}

