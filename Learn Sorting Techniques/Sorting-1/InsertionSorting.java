import java.util.Scanner;

public class InsertionSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter "+i+"th array: ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int j = i;
            int didSwap = 0;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
                didSwap = 1;
            }
            if(didSwap==0){
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
/*
Time complexity for bubble sort is 
Best Case: o(n) if the given number is already sorted the second loop wont run
Average Case: 0(n^2) if the given array is some what sorter but not fully sorted
Worst Case:0(n^2) the given array is completely unsorted.
*/