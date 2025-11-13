public class Methods {

    public static void print(String s) {
        System.out.println(s);
    }

    public static void main(String [] args) {

        //write code that will calculate the sum of values
        //between 2 provided numbers:
        // 4 and 8 --> 4 + 5 + 6 + 7 + 8
        int small = 4;
        int big = 8;

        int sum = 0;
        for (int i = small; i <= big; i++) {
            sum += i;
        }
        System.out.println("sum of numbers between " + small + " and " +
         big + " is "  + sum);

        //methods or functions let us defined code that can be reused multiple
        //times throughout the program

        //call (use) a method
        //-pass(provide) arguments (values) that match the defined
        //parameters in the method definition
        //-the quantity, sequence, and data type of arguments need to match the
        //method definition
        sumBtwn(3, 10);
        //this will call the method, but nothing is done with the return value
        //so it gets lost

        //can save the return value to a variable matching the return type
        int sum2 = sumBtwn(20, 30);
        System.out.println(sum2);

        //can print the returned value (this won't save the value for later)
        System.out.println(sumBtwn(40, 45));

        //when a method returns a value, you can treat the method call as if
        //it's a variable of that type, and pass one method call to another
        int bigSum = sumBtwn( sumBtwn(10, 15), 100 );
        System.out.println(bigSum);

        System.out.println(flipCoin());

        //the return value never gets used
        flipCoin();

        print("hi");

        //data type doesn't match the param type
        //print(100)
        int n = 100;

        //can add an empty string to make the whole argument a string
        print(n+ "");

        printFactorial(10);

        //since the method has a void return, it can't be passed
        //to a print statement or saved as a variable
        //System.out.println( printFactorial(10) );
    }

    //define methods inside the class but outside of main()
    //-for now, all methods will start with public static
    //- int is the return type - the method will produce data of this
    //type to be used elsewhere in the program
    //-void (like in main) means the method returns nothing
    //-sumBtwn is the method name - when you want to use/call the function
    //later, use this name
    //-int s and int b are parameters - input variables for the method code
    //-treat parameters like variable declarations - say the data type
    public static int sumBtwn(int s, int b) {

        int sum = 0;
        for (int i = s; i <= b; i++) {
            sum += i;
        }

        return sum;

        //since the method is declared with an int return type, need to
        //return an int value
        //-can't return data of some other type
    }

    //parameters are optional - depends on if the method needs input data
    public static String flipCoin() {
        if (Math.random() > .5) {
            //once a return statement is reached, the method stops there and
            //no other code will run
            return "Heads";
            //System.out.println("fadszfdas");
        }
        return "Tails";
    }

    public static void printFactorial(int n) {

        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        //can call methods in other methods
        print(product + "");
    }
}
