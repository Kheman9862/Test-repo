// Java Program to Concatenate Two Arrays without arraycopy
import java.util.Arrays;

public class a36{
    public static void main(String args[]){
        int a[] = {1,2,3};
        int b[]={4,5,6};

        int len = a.length+b.length;
        int result [] = new int[len];

        int pos = 0;
        for(int i:a){
           result[pos]=i;
            pos++;
        }
        for(int i:b){
            result[pos]=i;
             pos++;
         }
        
        System.out.println(Arrays.toString(result));

    }
}
