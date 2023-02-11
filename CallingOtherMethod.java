class CallingOtherMethod {
    
    public static void add(int a, int b){
        System.out.println(a+b);
    }
    public static void main(String args[]){
        System.out.println("Main started");
        add(5,6);  
       // System.out.println(sub(4,3)); // 1st way to print the sub or
        int c = sub(5,3);  // 2nd way to print the sub 
        System.out.println(c);  // and printing           
        System.out.println("Main Ended");
    }

    public static int sub(int i, int j){
        int c = i + j;
        return c;
    }
}