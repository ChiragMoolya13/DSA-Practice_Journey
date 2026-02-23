import java.util.Scanner;

public class Recursion {
    public static void name(int i, int n){
        if(i > n){
            return;
        }
        System.out.println(i + "th " + "Chirag");
        name(i+1,n);
    }
    public static void printLinearly(int i, int n){
        if(i > n){
            return;
        }
        System.out.print(i + " ");
        printLinearly(i+1, n);
    }
    public static void printbackwards(int i, int n){
        if(i<1){
            return;
        }
        System.out.print(i+ " ");
        printbackwards(i-1, n);
    }
    public static void backtracking(int i,int n){
        if(i<1){
            return;
        }
        backtracking(i-1,n);
        System.out.print(i+ " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // name(1,n);
        // int i = 1;
        // printLinearly(i,n);
        // printbackwards(n, n);
        backtracking(n,n);
    }    
}
