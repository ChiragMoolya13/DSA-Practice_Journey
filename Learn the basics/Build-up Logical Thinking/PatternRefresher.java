public class PatternRefresher{

    public static void pattern1(int n){
        for(int i = 0;i<n;i++){
            for(int j =0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void pattern2(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){
        for(int i =0;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        for(int i =0;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern6(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern7(int n){
        for(int i = 0; i<n;i++){
            //space
            for(int j = 0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //starts
            for(int k = 0;k<2*i+1;k++){
                System.out.print("*");
            }
            //space
            for(int j = 0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n){
            for(int i =0;i<n;i++){
            //space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            //starts
            for(int j=0; j < 2*n-(2*i +1); j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern9(int n){
        //top
        for(int i = 0; i<n;i++){
            //space
            for(int j = 0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //starts
            for(int k = 0;k<2*i+1;k++){
                System.out.print("*");
            }
            //space
            for(int j = 0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        //bottom
        for(int i =0;i<n;i++){
            //space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            //starts
            for(int j=0; j < 2*n-(2*i +1); j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern10(int n){
        for(int i = 1; i<=2*n-1;i++){
            int stars = i;
            if(i>n) stars = 2*n-i;
            for(int j = 1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern11(int n){
        int start = 1;
        for(int i = 0;i<n;i++){
            if(i%2==0) start = 1;
            else start = 0;
            for(int j = 0;j<=i;j++){
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public static void pattern12(int n){
        int space = 2 * (n-1);
        for(int i =1;i<=n;i++){
            //num1
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //space
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //num2
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            space -=2;
        } 
    }

    public static void pattern13(int n){

    }

    public static void main(String args[]){
        //pattern1(5);
        //pattern2(5);
        //pattern3(5);
        //pattern4(5);
        //pattern5(5);
        //pattern6(5);
        //pattern7(5);
        //pattern8(5);
        //pattern9(5);
        //pattern10(5);
        //pattern11(5);
        //pattern12(5);
        pattern13(5);
    }
}