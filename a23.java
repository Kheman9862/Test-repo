// Java Program to Find Largest Element of an Array

public class a23{
    public static void main(String args[]){
        int [] arr = {5,6,1,3,90,1,7,15,60,4};
        int largest = arr[0];
        for(int num:arr){
            if(largest<num){
                largest=num;
            }
        }
        System.out.println(largest);
    }
}

