// Take string from users and remove the white space
import java.util.Scanner;
public class a32{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");

        String input = sc.nextLine();
        
        
        String output = input.replaceAll("\\s","");
        System.out.println(output);


    }
}