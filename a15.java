// Reverse a number using a for loop in Java

public class a15{
    public static void main(String args[]){
        int num = 15648;
        int rev=0;
        for(;num!=0;num/=10){
            int digit = num%10;
            rev = rev * 10  + digit;
        }
        System.out.println(rev);
    }
}