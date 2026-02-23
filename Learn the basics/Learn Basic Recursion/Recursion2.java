public class Recursion2 {
    // Finding Sum of the number
    public static void SumOfN(int i,int n){
        if(i<1){
            System.out.println(n);
            return;
        }
        SumOfN(i-1,n+i);
    }
    // finding sum of the number in optimized way
    public static int optiSumOfN(int n){
        if(n == 0){
            return 0;
        }
        return n + optiSumOfN(n-1);
    }
    // finding factorial of the number
    public static void FactofN(int i, int n){
        if(i<1){
            System.out.println(n);
            return;
        }
        FactofN(i-1, n*i);
    }
    // finding factorial of the number in optimized way
    public static int optiFactOfN(int n){
        if(n == 1){
            return 1;
        }
        return n * optiFactOfN(n-1);
    }
    public static void main(String args[]){
        // int n = optiSumOfN(4);
        // System.out.println(n);
        // int n = 3;
        // SumOfN(n, 0 );
        int n = optiFactOfN(5);
        System.out.println(n);
        // int n = 4;
        // FactofN(n, 1);
    }
}
