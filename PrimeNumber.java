import java.util.*;

public class PrimeNumber {
    public static void main(String args[]){
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count+=1;
            }
        }
        if(count==2){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
