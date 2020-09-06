// Java Program to Generate Multiplication Table
public class a12{
    public static void main(String args[]){
        int table = 5;
        int val=1;

        for(int i=1;i<11;i++){
            val = table * i;
            System.out.println(table+ " * " +i+ " = " +val);
        }
    }
}