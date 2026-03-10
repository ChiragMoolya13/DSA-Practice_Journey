import java.util.*;
public class ContainsDuplicate {
    //Bruteforce approch
    public static boolean containsDuplicate(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    //Optimised approch using Hashset
    public static boolean containsDupliOpti(int[] arr){
        HashSet<Integer> map = new HashSet<>();
        for(int num: arr){
            if(map.contains(num)){
                return true;
            }
            map.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        boolean ans = containsDupliOpti(arr);
        System.out.println(ans);

    }
}
