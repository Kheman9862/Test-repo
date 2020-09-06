// Java Program to Check Whether a Number is Palindrome or Not

public class a16{
    public static void main(String args[]){
    int num = 1568998651;
    int temp = num;
    int rev=0;
    
    for (;num!=0;num/=10){
        int digit = num%10;
        rev = rev*10+digit;
    }        
if(temp==rev){
    System.out.println("It is palidrome");
}
else{
    System.out.println("Not a palidrome");

}
    }
}