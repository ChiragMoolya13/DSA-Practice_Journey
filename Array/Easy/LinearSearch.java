import java.util.Scanner;

public class LinearSearch{
    public static int Search(int[] arr, int n){
        int answer = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==n){
                answer = i;
                System.out.println("Your answer is: " + answer);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Search(arr, 6);
    }
}