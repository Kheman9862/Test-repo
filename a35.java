// Java Program to Concatenate Two Arrays
import java.util.Arrays;
public class a35{
    public static void main(String args[]){
        int a[]= {1,2,3};
        int b[]= {4,5,6};
        int alen = a.length;
        int blen = b.length;
        int [] result = new int[alen+blen];

        System.arraycopy(a,0,result,0,alen);
        System.arraycopy(b,0,result,alen,blen);

        System.out.println(Arrays.toString(result));
    }
}

// The arraycopy(array1, 0, result, 0, aLen) function, in simple terms, tells the program to copy array1 starting from index 0 to result from index 0 to aLen.

// Likewise, for arraycopy(array2, 0, result, aLen, bLen) tells the program to copy array2 starting from index 0 to result from index aLen to bLen.