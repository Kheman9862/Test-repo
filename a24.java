// Java Program to Calculate Standard Deviation


public class a24{
    public static void main(String args[]){
        double[] numArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        double SD = calculateSD(numArray);

        System.out.format("Standard Deviation = %.6f", SD);        
    }
    public static double calculateSD(double [] numArray){
        double sum =0.0,stddev=0.0;

        for(double num:numArray){
            sum +=num;
        }
        mean = sum/numArray.length;

        for(double num:numArray){
            stddev+=Math.pow(num-mean,2);
        }
        return Math.sqrt(stddev/length);
    }
}


