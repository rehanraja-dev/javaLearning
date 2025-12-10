import java.util.*;
class checkSorted_arr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)
        System.out.print("Enter array length: ")
        int n = sc.nextInt()
        int arr[] = new int [n]
        boolean isSorted = checkSorted(arr);
        if (isSorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
    public static boolean checkSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}