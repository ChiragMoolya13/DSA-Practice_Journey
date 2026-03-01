import java.util.Scanner;

public class SecondLargetElement{
    public static int secondLargest(int[] arr, int n){
        int largest = arr[0];
        int secondLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i]<largest &&  arr[i]>secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        int n = -1;
        System.out.println(secondLargest(arr, n));

    }
}