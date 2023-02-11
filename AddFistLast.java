public class AddFistLast {
    public static void main(String args[]){
        int n = 12345; // sum of 1+5 = 6

        int last = n % 10;
        while(n>10){
            n = n / 10;
        }
        last = last + n;
        System.out.println(last);
    }
    
}
