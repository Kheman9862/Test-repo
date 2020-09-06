// Java Program to Sort Elements in Lexicographical Order (Dictionary Order)

public class a29{
    public static void main(String args[]){
        String[] words = {"Ruby","C","Java","Python","Z"};

        for(int i =0;i<words.length-1;++i){
            for(int j=i+1;j<words.length;++j){
                // System.out.println(words[i].compareTo(words[j])+" i " +i+" and " +j+ " are ");
                if(words[i].compareTo(words[j])>0){
                    String temp = words[i];
                    words[i]= words[j];
                    words[j] = temp;
                }
            }
        }

        // Display

        for(int i = 0; i < 5; i++) {
            System.out.println(words[i]);
        }

    }
}

