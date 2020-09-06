// Java Program to Multiply to Matrix Using Multi-dimensional Arrays

public class a26{
    public static void main(String args[]){
        int rows=2,columns=3;
        int a[][] = {{2,8,6},{4,5,9}};
        int b[][] = {{2,8,6},{4,5,9}};

        int product[][] = new int[rows][columns];

        // Multiplying
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                 product[i][j] =  a[i][j] *  b[i][j];
            }
        }

        // Display

        for(int [] row:product){
            for(int column:row){
                System.out.print(column+ " ");
            }
            System.out.println();

        }


    }
}

