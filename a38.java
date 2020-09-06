// Check if an array contains given value using Stream

import java.util.stream.IntStream;

public class a38{
    public static void main(String args[]){
        int[] num = {1,2,3,4,5};
        int find = 3;
        boolean found = IntStream.of(num).anyMatch(n->n== find);
        if(found)
        System.out.println(find + " is found.");
    else
        System.out.println(find + " is not found.");
    }
}


