// Check if an array contains a given value for non-primitive types 
import java.util.Arrays;
public class a39{
    public static void main(String args[]){
        String[] strings = {"One", "Two", "Three", "Four", "Five"};
        String toFind = "Four";

        boolean res = Arrays.stream(strings).anyMatch(t->t.equals(toFind));

        if(res)
        System.out.println(toFind + " is found.");
        else
            System.out.println(toFind + " is not found.");
    }
}

