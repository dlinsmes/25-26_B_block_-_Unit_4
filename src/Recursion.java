public class Recursion {

    public static void main(String [] args) {
        System.out.println(exponent(3, 4));

        System.out.println(expRecursive(3, 5));
        //hi();

        countUpTo(5);
        System.out.println();
        countDownFrom(10);
        System.out.println();

        //looped method
        for (int i = 1; i <= 60; i++)
            System.out.print(fib2(i) + " ");

        System.out.println();

        //recursive method - takes longer to run for higher term numbers
        for (int i = 1; i <= 60; i++)
            System.out.print(fib(i) + " ");

        System.out.println();


    }

    //recursion - a method can call itself
    //-if you're not careful, infinite recursion can occur
    //(like an infinite loop)
    //-need a way to stop the recursive calls

    public static void hi() {
        System.out.println("hi");
        hi();
    }

    //write this method to calculate the
    //exponent of any non-negative base and power
    public static int exponent(int base, int pow) {
        int product = 1;
        for (int i = 0; i < pow; i++)
            product *= base;
        return product;
    }


    //recursive exponent method
    //2^4 = 2 * 2 * 2 * 2
    //    = 2 * 2^3
    //2^3 = 2 * 2^2
    //2^2 = 2 * 2^1
    //2^1 = 2 * 2^0
    //2^0 = 1

    public static int expRecursive(int base, int pow) {

        //base case - simplest form of the problem where
        //the solution is obvious/easy
        //-if you raise any number to the 0th pow, the solution
        //is 1
        if (pow == 0) {
            return 1;
        }
        //recursive case - call the method again
        //-usually you modify the argument to the method call
        //so that you eventually reach the base case
        else {
            return base * expRecursive(base, pow - 1);
        }
    }

    //recursive methods can always be written with a loop instead
    //-need to know how to interpret code that's written recursively
    //-never forced to write a method using recursion instead of a loop

    public static void countUpTo(int max) {

        //base case is 1 - for any number that's passed to the method,
        //you should start counting at 1
        if (max == 1)
            System.out.print(max + " ");
        else {
            countUpTo(max-1);
            //this print statement can't run until the previous line
            //(the recursive call) finishes
            //if you call countUpTo(5), then 5 can't print until
            //countUpTo(4) finishes
            System.out.print(max + " ");
        }
    }

    public static void countDownFrom(int max) {
        if (max == 1)
            System.out.print(max + " ");
        else {
            //almost the same as countUp except here we print the
            //current number first before making the recursive call
            //to one smaller number
            System.out.print(max + " ");
            countDownFrom(max-1);
        }
    }

    //fibonacci numbers
    // 1 1 2 3 5 8 13 21
    //the first two numbers in the sequence are both 1
    //after that, each following number is the sum of the previous
    //two terms
    //f(1) --> 1
    //f(2) --> 1
    //f(3) --> f(1) + f(2)
    //f(n) --> f(n-1) + f(n-2)

    //n is the term that we want
    public static int fib(int n) {
        //base case - the first and second fib terms are both 1
        if (n == 1 || n == 2)
            return 1;
        else
            return fib(n-2) + fib(n-1);
    }

    //sometimes the logic for a problem is easier to write
    //using recursion rather than using loops

    //rewrite this method using loops instead of recursion
    public static int fib2(int n) {
        int prev2 = 0;
        int prev1 = 0;
        int current = 1;
        for (int i = 2; i <= n; i++) {
            prev2 = prev1;
            prev1 = current;
            current = prev2 + prev1;
        }
        return current;
    }
}
