import java.util.*;

public class FactorOfNumber {
    public static void main(String args[]){
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("The factors of given number is");
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.println(i);
            }
        }


    }
}
