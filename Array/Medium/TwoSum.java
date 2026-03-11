
import java.util.HashMap;

public class TwoSum {
    // Brute Force Approch
    public static int[] twoSum(int[] arr, int target){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    // Better Approch
    public static int[] twoSumBetter(int[] arr, int target){
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            int more = target - arr[i];
            if(map.containsKey(more)){
                return new int[] {map.get(more), i};
            }
            else{
                map.put(arr[i], i);
            }
        }
        return new int[] {-1,-1};
    }
    public static void main(String args[]){
        int[] arr = {2,6,5,8,11};
        int target = 14;
        int[] res = twoSum(arr,target);
        System.out.println("[" + res[0] + ", " + res[1]+"]");
        int[] res2 = twoSumBetter(arr, target);
        System.out.println("[" + res2[0] + ", " + res2[1]+"]");
    }
}
