public class MuliRecursion {
    public static int fibonachi(int n){
        if(n<=1){
            return n;
        }
        int first = fibonachi(n-1);
        int second = fibonachi(n-2);
        return first + second;
    }
    public static void main(String args[]){
        int result = fibonachi(4);
        System.out.println(result);
    }
}
