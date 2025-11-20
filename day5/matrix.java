import java.util.Scanner;
class matrix{
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);

        int mat[][] = new int [2][2];
        int mat1[][] = new int [2][2];
        int mat2[][] = new int [2][2];
        int mat3[][] = new int [2][2];

        System.out.println("Enter matrix1 element: ");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter matrix2 element: ");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                mat1[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                mat2[i][j] = mat[i][j] + mat1[i][j];
            }
        }

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                mat[i][j] = mat[i][j] * mat1[i][j];
            }
        }

        System.out.println("---Addition---");

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.println(mat2[i][j]);
            }
        }

        System.out.println("---Multiplication---");

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.println(mat3[i][j]);
            }
        }
        
        sc.close();
    }
}