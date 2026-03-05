public class MissingNnumber {
    public static int missingNumber(int[] arr){
        int n = arr.length;
        int x = 0;
        int y = 0;
        for (int i = 0; i < n; i++) {
            x = x + arr[i];
        }
        for (int i = 0; i <= n; i++) {
            y = y + i;
        }
        int ans = y - x;
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,5,6,7,8};
        System.out.println(missingNumber(arr));

    }
}
