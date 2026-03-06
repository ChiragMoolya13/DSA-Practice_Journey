public class SingleNumber {
    // Brute force approch
    public static int singleNum(int[] arr){
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == num){
                    count++;
                }
            }
            if(count == 1){
                ans = num;
            }
        }
        return ans;
    }
    // Optimized approch using XOR operator
    public static int xor(int[] arr){
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }
    public static void main(String args[]){
        int[] arr = {1,1,2,2,3,4,4}; 
        System.out.println(singleNum(arr));
    }
}
