import java.util.*;
public class TwoDarray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][4];
        System.out.println("Enter the matrix values: ");
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix Values are: ");
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // For finding the rows and column in the matrix
        System.out.println("Rows are: " + matrix.length);
        System.out.println("Column are: " + matrix[0].length);
    }
}
