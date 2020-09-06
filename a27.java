// Transpose Matrix

public class a27{
public static void display(int [][] matrix){
    for(int row[]:matrix){
        for(int column:row){
            System.out.print(column+ " ");
        }
        System.out.println();
    }
    System.out.println();


}
    public static void main(String args[]){
        int row=2,column=3;
        int a[][] = {{2,3,4},{5,6,7}};

        display(a);
        int transpose[][]=new int[column][row];
        for(int i=0;i<row;i++){
        for(int j=0;j<column;j++){
        transpose[j][i]=a[i][j];
        }
        }
        display(transpose);
    }
}

