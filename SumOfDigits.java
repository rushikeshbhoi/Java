import java.util.*;

public class SumOfDigits{
    public static void main(String args[]){
        
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int sum = 0;
        while(n>0){
            int last = n % 10;
            sum += last;
            n = n / 10;
        }

        System.out.println("The sum of entered digits is :" + sum);



    }
}