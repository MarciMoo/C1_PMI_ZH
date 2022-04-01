import java.util.ArrayList;
public class Matrix {
    public static ArrayList<Integer> rowsWithZero(int[][] matrix)
    {
        ArrayList<Integer> matrixnull = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++){
                if(matrix[i][j]==0){
                matrixnull.add(i);
                }
            }
        }
        return matrixnull;
    }
    public static int sumOfEvenNumbers(int[][] matrix)
    {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++){
                if(matrix[i][j]%2==0){
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }
}
