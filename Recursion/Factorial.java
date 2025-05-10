// package Recursion;

public class Factorial {

    public static int factorial(int x){
        if(x==1) return 1;
        return x* factorial(x-1);
    }

    public static void main(String[] args) {
        int x = 10;
        System.out.println(factorial(x));
    }
    
}
