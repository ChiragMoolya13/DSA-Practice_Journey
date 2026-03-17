public class MajorityElements {
    // Bruteforce approach using nested for loops time complexity of o(n2) 
    public static int MajorityElem(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if(arr[j]==arr[i]){
                    count++;
                }
                if(count>n/2){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    // Optimized approch using Moore's Voting Algorithm
    public static int MooresVotingAlgo(int[] arr){
        int count = 0;
        int el = 0;
        for(int i = 0;i<arr.length;i++){
            if(count == 0){
                count=1;
                el = arr[i];
            }
            else if (arr[i] == el){
                count++;
            }
            else{
                count--;
            }
        }
        int cnt1=0;
        for (int i = 0; i < arr.length; i++) {
             if(arr[i]==el){
                cnt1++;
             }
        }
        if(cnt1>arr.length/2){
            return el;
        }
        return -1;
    }
    public static void main(String args[]){
        int[] arr = {2,2,1,1,2,2};
        System.out.println(MajorityElem(arr));
        System.out.println(MooresVotingAlgo(arr));
    }
}
