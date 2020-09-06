// Java Program to Check Whether an Alphabet is Vowel or Consonant
import java.util.Scanner;
public class a8{
    public static void main(String args[]){
        Scanner c = new Scanner(System.in);
        System.out.print("Please enter a character : ");
        char ch = c.next().charAt(0);

        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println("This is a Vowel");
            break;
            default:
            System.out.println("This is Consonent");
        }

    }
}