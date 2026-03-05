import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoSortedArray {

    public static List<Integer> Intersection(int[] A, int[] B,int n, int m){
        int j = 0;
        int i = 0;
        List<Integer> ans = new ArrayList<>();
        while(i<n && j<m){
            if(A[i]<B[j]){
                i++;
            }
            else if(B[j]<A[i]){
                j++;
            }
            else{
                ans.add(A[i]);
                i++;
                j++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {2,3,4,4,5,11,12};
        int n = arr1.length;
        int m = arr2.length;
        List<Integer> result = Intersection(arr1, arr2, n, m);
        for (int elem : result) {
            System.out.print(elem + " ");
        }
    }
}