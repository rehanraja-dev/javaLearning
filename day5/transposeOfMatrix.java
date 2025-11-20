import java.util.Scanner;

class transposeOfMatrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter order of matrix: ");
        int n = sc.nextInt();
        int [][] mat1 = new int[n][n];
        int [][] transposedMat = new int[n][n];
        System.out.println("Enter matrix element: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                mat1[i][j] = sc.nextInt();      
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                transposedMat[j][i] = mat1[i][j];
            }
        }
        System.out.println("---Transposed matrix---");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(transposedMat[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}