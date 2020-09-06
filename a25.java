// Java Program to Add Two Matrix Using Multi-dimensional Arrays

public class a25{
    public static void main(String args[]){
        int rows=2, columns=3;
        int [][] a = {{2,3,4},{5,6,7}};
        int [][] b = {{2,3,4},{5,6,7}};

        int [][] sum =new int [rows][columns];
        for(int i = 0;i<rows;i++){
            for(int j=0;j<columns;j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        // Displaying the results
        for(int [] row: sum){
            for (int column: row){
                System.out.print(column+ " ");
            }
            System.out.println();
        }

    }
}

