
import java.util.ArrayList;
import java.util.List;

public class BasicMaths {

    public static void LastDigit(int n){
        while(n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n/=10;
        }
    }
    public static void countDigit(int n){
        int count = 0;
        while(n>0){
            n/=10;
            count++;
        }
        System.out.print(count);
    }
    public static int reverseNumber(int n){
        int sum = 0;
        while(n>0){
            int lastDigit = n%10;
            sum = sum * 10 + lastDigit;
            n/=10;
        }
        return sum;
    }
    public static void palindrome(int n){
        int copy = n;
        int rev = reverseNumber(copy);
        if(n==rev){
            System.out.print("Palindrom");
        }
        else{
            System.out.print("Not Palindrom");
        }
    }
    public static void armstrongNumber(int n){
        int sum = 0;
        int copy = n;
        while(copy>0){
            int lastDigit = copy%10;
            sum = sum + (lastDigit*lastDigit*lastDigit);
            copy/=10;
        }
        if(n==sum){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
    public static void printAllDivisors(int n){
        for(int i = 1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    } 
    public static List<Integer> printAllDivisors2(int n){
        List<Integer> res = new ArrayList<>();

        for(int i = 1;i*i<=n;i++){
            if(n%i==0){
                res.add(i);
                if(i!=n/i){
                    res.add(n/i);
                }
            }
        }
        return res;
    }
    public static void primeNumber(int n){
        int count = 0;
        for(int i = 1;i*i<n;i++){
            if(n%i==0){
                count++;
                if(n%i!=i){
                    count++;
                }
            }
        }
        if(count == 2){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }
    }
    public static void GcdHcf(int n1, int n2){
        for(int i=Math.min(n1,n2);i>=1;i--){
            if(n1%i==0 && n2%i==0){
                System.out.println(i);
                break;
            }
        }
    }
    public static void OptiGcdHcf(int a, int b){
        while(a > 0 && b > 0){
            if(a>b) a = a % b;
            else b = b % a;
        }
        if(a==0) System.out.println(b);
        else System.out.println(a);
    }

    public static void main(String[] args) {
        // LastDigit(7789);
        // countDigit(87654);
        // System.out.println(reverseNumber(7654321));
        // palindrome(123323);
        // armstrongNumber(153);
        // printAllDivisors(36);
        /*int n = 36;
        List<Integer> result = printAllDivisors2(n);

        System.out.println("Divisors of " + n + ": ");
        for(int val : result){
            System.out.print(val + " ");
        }
        System.out.println();*/
        // primeNumber(12);
        // GcdHcf(9, 12);
        OptiGcdHcf(9, 12);
    }
}
