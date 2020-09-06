// Java Program to Check Whether a Number can be Expressed as Sum of Two Prime Numbers

public class a18{
    static boolean checkPrime(int num){
        boolean isPrime = true;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String args[]){
        int x = 34;
        boolean flag = false;

        for(int j=2;j<=x/2;j++){
            if(checkPrime(j)){
                if(checkPrime(x-j)){
                    System.out.printf("%d = %d + %d\n", x, j, x - j);
                    flag = true;

                }
            }
        }
        if(!flag){
            System.out.println(x + " cannot be expressed as the sum of two prime numbers.");
        }
    }
}

