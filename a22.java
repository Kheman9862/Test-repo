// Java Program to Calculate Average Using Arrays

public class a22{
    public static void main(String args[]){
        double [] arr = {45.3, 67.5, -45.6, 20.34, 33.0, 45.6};
        double sum = 0.0;

        for(double num: arr){
            sum +=num;
        }
        double average = sum/arr.length;
        System.out.format("The average is: %.2f" ,average);
    }
}

