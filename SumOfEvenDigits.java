import java.util.*;

public class SumOfEvenDigits {
    public static void main(String args[]){
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        // Sum of Even number in digits
        while(n>0){
            int remainder = n % 10;
            if(remainder % 2 ==0){
                sum += remainder;
            }
            n = n / 10;
        }
        System.out.println(sum);
    }
}
