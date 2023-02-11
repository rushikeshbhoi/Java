public class MiddleSum {
    public static void main(String args[]){
        int n = 12345; // 2+3+4 = 9
        int sum = 0;
        n = n / 10;
        while(n>9){
            int last = n % 10;
            sum += last;
            n = n / 10;
        }
        System.out.println(sum);


    }
}
