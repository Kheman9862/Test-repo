// Java Program to Find the Frequency of Character in a String

public class a28{
    public static void main(String args[]){
        String name = "Khaemaana";
        char word = 'a';
        int count=0;
        for(int i= 0;i<name.length();i++){
            if(word==name.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}

