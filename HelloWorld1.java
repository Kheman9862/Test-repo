import java.util.Scanner;

public class HelloWorld1{

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number");

        int number = reader.nextInt();

        if(number==5){
            System.out.println("Welcome to Java");
        }
        else{
            System.out.println("Try Number 5");
        }
    }
}