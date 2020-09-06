//  Print array using different methods
import java.util.Arrays;
public class a33{

    public static void meth1(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public static void meth2(int[] a){
        System.out.println(Arrays.toString(a));
    }
    
    // public static void meth3(int[][] a){
    //     System.out.println(Arrays.toString(a));
    // } Output for this will be something like this which is basically the nested address of the arrays: [[I@15db9742, [I@6d06d69c, [I@7852e922]

    // Therefore we will use this

    public static void meth3(int[][] a){
        System.out.println(Arrays.deepToString(a));
    }
    


    public static void main(String args[]){
        int [] a = {2,3,4,6,8};
        int [][] b = {{3,4},{4,8},{9,54}};
        meth1(a);
        meth2(a);
        meth3(b);
    }
}