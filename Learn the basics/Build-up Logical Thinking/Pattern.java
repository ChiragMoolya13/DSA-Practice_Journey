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
        int start;
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
    public static void print12(int n){
        int space = 2*(n-1);
        for(int i = 1; i<=n;i++){
            //numbers
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            //space
            for(int j =1;j<=space;j++){
                System.out.print(" ");
            }
            //numbers
            for(int j = i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
    }
    public static void print13(int n){
        int num = 1;
        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=i;j++){
                System.out.print(num + " ");
                num += 1;
            }
            System.out.println();
        }
    }
    public static void print14(int n){
        for(int i = 0; i<=n;i++){
            for(char ch = 'A'; ch <= 'A'+i; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    public static void print15(int n){
        for(int i = 0; i<=n;i++){
            for(char ch = 'A'; ch <= 'A'+(n-i-1); ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    public static void print16(int n){
        for(int i = 0; i<=n;i++){
            char ch = (char) ('A' + i);
            for(int j = 0;j<=i;j++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    public static void print17(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0;j<n-i-1;j++){
                System.out.print(" ");
            }
            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            for(int j = 1;j<=2*i+1;j++){
                System.out.print(ch);
                if(j <= breakpoint) ch++;
                else ch--;
            }
            for(int j = 0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    public static void print18(int n){
        for(int i = 0; i<n;i++){
            for(char ch = (char) ('E' - i); ch <= 'E';ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    public static void print19(int n){
        int space = 0;
        for(int i =0;i<n;i++){
            //Stars
            for(int j = 1 ;j<=n-i;j++){
                System.out.print("*");
            }
            //Spaces
            for(int j = 0; j<space;j++){
                System.out.print(" ");
            }
            //Stars
            for(int j = 1 ;j<=n-i;j++){
                System.out.print("*");
            }
            space += 2;
            System.out.println();
        }
        for(int i =0;i<=n;i++){
            //Stars2
            for(int j = 1 ;j<=i;j++){
                System.out.print("*");
            }
            //Spaces2
            for(int j = 0; j<space;j++){
                System.out.print(" ");
            }
            //Stars2
            for(int j = 1 ;j<=i;j++){
                System.out.print("*");
            }
            space -= 2;
            System.out.println();
        }
    }
    public static void print20(int n){
        int spaces = 2*n-2;
        for(int i = 1; i<=2*n-1;i++){
            int stars = i;
            if(i>n) stars = 2*n-i;
            //stars
            for(int j = 1;j<=stars;j++){
                System.out.print("*");
            }
            //spaces
            for(int j = 1;j<=spaces;j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<n) spaces -= 2;
            else spaces += 2; 
        }
    }
    public static void print21(int n){
        for(int i = 0; i<n;i++){
            for(int j = 0;j<n;j++){
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void print22(int n){
        for(int i =0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top = i;
                int left = j;
                int right = (2*n-2)-j;
                int down = (2*n-2)-i;
                int minDist = Math.min(Math.min(top,down),Math.min(left,right));
                System.out.print((n-minDist)+ " ");
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
        // print11(5);
        // print12(5);
        // print13(5);
        // print14(5);
        // print15(5);
        // print16(5);
        // print17(5);
        // print18(5);
        // print19(5);
        // print20(5);
        // print21(5);
        // print22(5);
    }
}