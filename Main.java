import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        String inpuString = sc.nextLine();

        // extracting elements
        String []stringArray = inpuString.split("#");
        int [][]matrix = new int[stringArray.length][stringArray.length];

        for(int i = 0; i < stringArray.length; i++) {
            matrix[i] = Arrays.stream(stringArray[i].split(",")).mapToInt(Integer::parseInt).toArray();
        }

        // printing max diagonal sum of matrix
        System.out.println(MatrixDiagonalSum.findMaxDiagonalSum(matrix));

        // closing resource
        sc.close();
    }
}
