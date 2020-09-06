// Java Program to Check Whether a Number is Even or Odd

import java.util.Scanner;

public class a6{
    public static void main(String args[]){
        Scanner x = new Scanner(System.in);

        int number = x.nextInt();
        System.out.println("Please Enter a number");
        
        if(number%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
}