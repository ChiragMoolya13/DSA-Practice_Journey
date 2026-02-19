public class P6 {
    public static void main(String[] args) {
        int num = 1;
        for(int i = 0; i<=5;i++){
            for(int j = 5;j>i;j--){
                System.out.print(num);
            }
            System.out.println("");
            num++;
        }
    }
}