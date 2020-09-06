// Count Number of Digits in an Integer using for loop

public class a14{
    public static void main(String args[]){
        int n = 1234,count=0;
        for(;n!=0;n/=10,++count){}
        System.out.println(count);
    }
}