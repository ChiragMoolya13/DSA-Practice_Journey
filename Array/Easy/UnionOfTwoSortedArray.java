import java.util.*;
public class UnionOfTwoSortedArray {
    public static List<Integer> Union(int[] arr1, int[] arr2, int n, int m){
        List<Integer> union = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i<n && j<m){
            if(arr1[i]<arr2[j]){
                if(union.isEmpty()||union.get(union.size()-1)!=arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
            }
            else if(arr2[j]<arr1[i]){ 
                if(union.isEmpty()||union.get(union.size()-1)!=arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
            } 
            else{
                if(union.isEmpty()||union.get(union.size()-1)!=arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        while(i<n){
            if(union.isEmpty()||union.get(union.size()-1)!=arr1[i]){
                union.add(arr1[i]);
            }
            i++;
        }
        while(j<m){
            if(union.isEmpty()||union.get(union.size()-1)!=arr2[j]){
                union.add(arr2[j]);
            }
            j++;
        }
        return union;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {2,3,4,4,5,11,12};
        int n = arr1.length;
        int m = arr2.length;
        List<Integer> result = Union(arr1, arr2, n, m);
        for (int elem : result) {
            System.out.print(elem + " ");
        }
    }
}
