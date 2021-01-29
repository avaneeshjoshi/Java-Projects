import java.util.Scanner;

public class FibonacciSequence {
 //First Function To Commit Calculations
 public static int Fib(int n){
        if(n>=0 && n<2){
            return n;
        }
        else {
            int myFib2 = Fib(n - 1) + Fib(n - 2);
            return myFib2;
        }
        
    }
//Second Function to Ask You Which nTh Number You Want Printed
    public static void main(String[] args) {
        Scanner myFibScanner = new Scanner(System.in);
        System.out.println("What Fibonacci Number Do You Want?");
        int n = myFibScanner.nextInt();
        int fibNo = Fib(n);
        System.out.println(Fib(n));
    }
}
// Made By Avaneesh Joshi
