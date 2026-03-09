public class LongestSubarraywithSumK {
    public static int lSaWSK(int[] arr, int k){
        int len = 0;
        for(int i = 0; i<arr.length;i++){
            int sum = 0;
            for(int j = i; j<arr.length;j++){
                sum = sum + arr[j];
                if(sum == k){
                    len = Math.max(len, j-i+1);
                }
            }
        }
        return len;
    }
    public static void main(String args[]){
        int[] arr = {1,2,3,1,1,1,4,2,3};
        int ans = lSaWSK(arr, 3);
        System.out.print(ans);

    }
}
