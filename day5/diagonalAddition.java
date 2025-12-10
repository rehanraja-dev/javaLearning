import java.util.Scanner;

class diagonalAddition{
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the degree of a matrix: ");
        int n = sc.nextInt();
        int mat[][] = new int[n][n];
        int dAddition1 = 0; 
        
        System.out.println("Enter the element of the matrix: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){

                if(i == j){
                    dAddition1 = dAddition1 + mat[i][j];
                }
                if (i + j == n - 1 ){
                    dAddition1 = dAddition1 + mat[i][j];
                }
                
            }
        }
        sc.close();
        System.out.print("Addition of Diagonal Element is: "+dAddition1);
    }
}