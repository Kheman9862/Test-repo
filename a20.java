// Reverse a Sentence Using Recursion

public class a20{
    public static void main(String args[]){
        String sentence = "Go Work";
        String rev = reverse(sentence);
        System.out.println("The reversed sentence is: " + rev); 
    }

    public static String reverse(String sen){
        if(sen.isEmpty()){
            return sen;
        }

        return reverse(sen.substring(1)) + sen.charAt(0); 
    }
}

