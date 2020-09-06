// Java Program to Display Fibonacci Series
// The Fibonacci series is a series where the next term is the sum of pervious two terms. The first two terms of the Fibonacci sequence is 0 followed by 1.

public class a13{
    public static void main(String args[]){
        int t0=0,t1=1;
        for(int i=0;i<10;i++){
            System.out.print(t0+ " , " );
            int sum = t0+t1;
            t0=t1;
            t1=sum;

        }
    }
}