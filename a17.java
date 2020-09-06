// Display Prime Numbers Between two Intervals

public class a17{
    public static void main(String args[]){
        int low = 10, high=20;
        while(low<high){
            boolean flag = false;
            for(int i =2; i<= low/2;++i){
                if(low%i==0){
                    flag = true;
                    break;
                }
            }
            if (!flag && low != 0 && low != 1)
            System.out.print(low + " ");
            ++low;
        }
    }
}