//  Check whether a number is even or odd using ternary operator
import java.util.Scanner;

public class a7{
    public static void main(String args[]){
Scanner x = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = x.nextInt();

String evenOdd = (num%2==0) ? "Even" : "Odd";
System.out.print("This is " +evenOdd+ " number");

    }
}