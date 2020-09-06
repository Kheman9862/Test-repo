//Java Program to Check if An Array Contains a Given Value

public class a37{
    public static void main(String args[]){
        int [] num = {2,5,6,87,4};
        int toFind = 5;
        boolean found = false;

        for (int n: num){
            if(n==toFind){
                found=true;
                break;
            }
        }
        if(found)
            System.out.println(toFind + " is found.");
        else
            System.out.println(toFind + " is not found.");
    }
}