public class Recursion3 {
    // reverse an array with two pointers
    public static void reverseArr(int l, int arr[], int r){
        if(l>r){
            for(int i = 0; i<5;i++){
            System.out.print(arr[i]+ " ");
            }
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        
        reverseArr(l+1, arr, r-1);
    }
    // reverse an array with one pointers
    public static void reverseArrOnePointer(int i, int arr[],int n) {
        if(i>=n/2){
            for(int j = 0; j<5;j++){
            System.out.print(arr[j]+ " ");
            }
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;

        reverseArrOnePointer(i+1, arr,n-i-1);
    }
    // find out if the string is palindrom or not
    public static boolean palindromString(int i, String s){
        if(i>=s.length()/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(s.length()-i-1)){
            return false;
        }
        return palindromString(i+1, s);
    }
    public static void main(String[] args) {
        // int[] arr = new int[5];
        // for(int i = 1; i<=5;i++){
        //     arr[i-1] = i;
        // }
        // for(int i = 0; i<5;i++){
        //     System.out.println(arr[i]+ " ");
        // }
        // // reverseArr(0, arr, 5-1);
        // reverseArrOnePointer(0, arr, 5);

        String str = "Madam";

        String str2 = str.toLowerCase();

        boolean result = palindromString(0, str2);

        System.out.println(result);


    }
}
