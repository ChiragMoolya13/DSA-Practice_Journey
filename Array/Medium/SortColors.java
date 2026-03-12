import java.util.Arrays;
// Better
public class SortColors {
    public static void SortColor(int[] arr){
        int count0 = 0;
        int count1 = 0;
        // int count2 = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==0){
                count0++;
            }
            else if(arr[i]==1){
                count1++;
            }
            // else{
            //     count2++;
            // }
        }
        for (int i = 0; i < count0; i++) {
            arr[i]=0;
        }
        for (int i = count0; i < count0+count1; i++) {
            arr[i]=1;
        }
        for (int i = count0+count1; i < arr.length; i++) {
            arr[i]=2;
        }
    }
    //Optimized (Dutch National Flag Algorithm)
    public static void Dnfa(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while(mid<=high){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        // SortColor(arr);
        Dnfa(arr);
        System.out.println(Arrays.toString(arr));
    }
}
