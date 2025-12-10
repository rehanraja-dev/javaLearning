import java.util.Scanner;


class menuDriven{

    
    
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        int choice;
        while(true){
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Multiplication");
            System.out.println("3. Subtraction");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    matrixAddition();
                    break;
                
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
        // sc.close();
    }

    static void matrixAddition(){
        int mat[][] = new int [2][2];
        int mat1[][] = new int [2][2];
        int mat2[][] = new int [2][2];
        Scanner sc = new Scanner(System.in);
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

        System.out.println("---Addition---");

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(mat2[i][j]+" ");
            }
            System.out.println();
        }
    // sc.close();
}
}

