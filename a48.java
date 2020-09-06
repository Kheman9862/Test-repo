// Java Program to Convert Map (HashMap) to List

import java.util.*;

public class a48{
    public static void main(String args[]){
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"My");
        map.put(2,"Name");
        map.put(3,"Is");
        map.put(4,"Kheman");
        map.put(5,"Garg");


        List<Integer> key = new ArrayList<Integer>(map.keySet());
        List<String> values = new ArrayList<String>(map.values());
        System.out.println(map);
        System.out.println(key);
        System.out.println(values);
    }
}