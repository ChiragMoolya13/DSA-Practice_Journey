public class Pattern{

    public static void print1(int n){
        for(int i = 0; i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void print2(int n){
        for(int i = 0; i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void print3(int n){
        for(int i = 0; i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void print4(int n){
        for(int i = 0; i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void print5(int n){
        for(int i = 0; i<=n;i++){
            for(int j = n;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void print6(int n){
        for(int i = 0; i<=n;i++){
            for(int j = 1;j<n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void print7(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j = 0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j = 0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void print8(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0;j<i;j++){
                System.out.print(" ");
            }
            for(int j = 0;j<(2*n-(2*i+1));j++){
                System.out.print("*");
            }
            for(int j = 0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void print9(int n){
        print7(n);
        print8(n);
    }
    public static void print10(int n){
        for(int i = 1; i<(2*n-1); i++){
            int stars = i;
            if(i>n) stars = 2*n - i;
            for(int j = 1; j<stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void print11(int n){
        int start = 1;
        for(int i = 0;i<n;i++){
            if(i%2==0) start = 1;
            else start = 0;
            for(int j = 0; j<=i;j++){
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // print1(5);
        // print2(5);
        // print3(5);
        // print4(5);
        // print5(5);
        // print6(5);
        // print7(6);
        // print8(6);
        // print9(6);
        // print10(5);
        print11(5);
    }
}