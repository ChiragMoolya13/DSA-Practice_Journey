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
        int s = 1;
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(s+" ");
                s++;

            }
            System.out.println();
        }
    }
    public static void pattern14(int n){
        for(int i = 0;i<n;i++){
            for(char ch ='A';ch<='A'+i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void pattern15(int n){
        for(int i = 0;i<n;i++){
            for(char ch ='A';ch<='A'+(n-i-1);ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void pattern16(int n){
        for(int i = 0;i<n;i++){
            char ch = (char) ('A' + i);
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void pattern17(int n){
        for(int i = 0; i<n;i++){
            //space
            for(int j = 0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //starts
            char ch = 'A';
            int breakPoint = (2*i+1)/2;
            for(int k = 1;k<=2*i+1;k++){
                System.out.print(ch);
                if(k<=breakPoint) ch++;
                else ch--;
            }
            //space
            for(int j = 0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern18(int n){
        for(int i = 0;i<n;i++){
            char elm = (char)('E'- i);
            for(char ch = elm;ch<='E';ch++){
                System.out.print(ch +" ");
            }
            System.out.println();
        }
    }

    public static void pattern19(int n){
        //top
        int space = 0;
        for(int i=0;i<n;i++){
            //starts
            for(int j = 1;j<=n-i;j++){
                System.out.print("*");
            }
            //space
            for(int j = 0;j<space;j++){
                System.out.print(" ");
            }
            //starts
            for(int j = 1;j<=n-i;j++){
                System.out.print("*");
            }
            space += 2;
            System.out.println();
        }
        //bottom
        int space2 = space-2;
        for(int i=1;i<=n;i++){
            //starts
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            //space
            for(int j = 0;j<space2;j++){
                System.out.print(" ");
            }
            //starts
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            space2 -= 2;
            System.out.println();
        }
    }
    public static void pattern20(int n){
        int spaces = 2*n-2;
        for(int i = 1;i<=2*n-1;i++){
            int stars = i;
            if(i>n) stars = 2*n-i;
            //starts
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            //space
            for(int j = 1;j<=spaces;j++){
                System.out.print(" ");
            }
            //starts
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<n) spaces -= 2;
            else spaces += 2;
            
        }
    }

    public static void pattern21(int n){
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                if(i == 0 || j == 0 || i == n-1 || j == n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern22(int n) {
        for(int i=0;i<2*n-1;i++){
            for(int j =0;j<2*n-1;j++){
                int top = i;
                int left = j;
                int right = (2*n-2)-j;
                int down = (2*n-2)-i;
                System.out.print(n-Math.min(Math.min(top, down),Math.min(left,right)));
            }
            System.out.println();
        }
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
        //pattern13(5);
        //pattern14(5);
        //pattern15(5);
        //pattern16(5);
        //pattern17(5);
        //pattern18(5);
        //pattern19(5);
        //pattern20(10);
        //pattern21(10);
        //pattern22(5);

    }
}