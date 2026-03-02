import java.util.Scanner;

public class RemoveDuplicate{
    public static int remove(int[] arr, int n){
        if(arr.length == 0) return 0;
        int i = 0;
        for(int j = 1; j<arr.length; j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(remove(arr,5));
    }
}