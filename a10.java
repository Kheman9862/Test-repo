// Java Program to Check a Leap Year
import java.util.Scanner;

public class a10{
    public static void main(String args[]){
Scanner x = new Scanner(System.in);
System.out.print("Enter the year: ");
boolean leap = false;
int year = x.nextInt();
if(year%4==0){

    if(year%100==0){
    
        if(year%400==0){
            leap=true;
        }
        else{
            leap=false;
        }
    }
    else{
        leap=true;
    }

}
else{
    leap=false;
} 

if(leap){
    System.out.println("This is a leap year");
}
else{
    System.out.println("This is not a leap year");

}

    }
}
