// package Recursion;

public class pow {

    public static int powerr(int x, int n){
        if(n==0) return 1;
        while(n!=1){
            return x * powerr(x, n-1);
        }
        return x;
    }

    public static void main(String[] args) {
        int x = 2;
        System.out.println(powerr(x,10));
    }

    
}
