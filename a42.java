// Java Program to Join Two Lists

import java.util.ArrayList;
import java.util.List;

public class a42 {
    public static void main(String args[]){
        List<String> a= new ArrayList<String>();
        List<String> b= new ArrayList<String>();
        a.add("a");
        b.add("b");
        List<String> joined= new ArrayList<String>();
        joined.addAll(a);
        joined.addAll(b);

        System.out.println(a);
        System.out.println(b);
        System.out.println(joined);
    }
}

