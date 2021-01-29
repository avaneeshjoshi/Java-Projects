import java.util.Scanner;

public class newFibonacci {
    public static int Fib(int n){
        if(n>=0 && n<2){
            return n;
        }
        else {
            int myFib2 = Fib(n - 1) + Fib(n - 2);
            return myFib2;
        }
        
    }

    public static void main(String[] args) {
        Scanner myFibScanner = new Scanner(System.in);
        System.out.println("What Fibonacci Number Do You Want?");
        int n = myFibScanner.nextInt();
        int fibNo = Fib(n);
        System.out.println(Fib(n));
    }
}
