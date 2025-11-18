public class OverloadedMethods {

    public static void main(String [] args) {

        //print the returned value (or save to a variable)
        System.out.println( howManyLetters("banana", "a") );

        //1 is the position of the first a
        System.out.println( "banana".indexOf("a") );

        //2 is the position of where the first na starts
        System.out.println( "banana".indexOf("na") );

        //-1 bc c is not in the string
        System.out.println( "banana".indexOf("c") );

        //don't pay attention to the value, just the sign
        //-apple comes alphabetically before banana, so return is negative
        System.out.println("apple".compareTo("banana"));

        //positive bc banana comes alphabetically after apple
        System.out.println("banana".compareTo("apple"));

        //zero bc they're the same
        System.out.println("apple".compareTo("apple"));

        String sentence = "the quick brown fox jumps over the lazy dog";
        //empty string to split to individual chars
        String [] words = sentence.split(" ");
        for(String s: words)
            System.out.println(s);

        //the version of the overloaded method that gets called is determined by
        //the arguments (values passed)
        //-this one calls the version with 2 int params
        System.out.println( max(10, 5) );

        //calls the version with 3 int params
        System.out.println( max(10, 5, 20) );

        print("hi");
        print(7+"");

        print(8);
    }

    //String methods
    //-length() - returns int - how many chars in the string
    //-equals(String other) - returns boolean -
    // true when other is the same, false otherwise
    //-substring(int start, int end) - returns String - gives part of the string
    //beginning at index start until end (exclusive)
    //-substring(int start) - returns String - gives the part of the string
    //beginning at index start until the end of the string
    //new:
    //-indexOf(String substring) - returns int - gives the position of the
    //first occurrence of substring in the larger string, or -1 if it's not
    //in the larger string
    //-compareTo(String other) - returns int - used for alphabetizing
    //ex: a.compareTo(b) where a and b are string variables
    //-return a negative when a comes alphabetically before b
    //-return a positive when a comes alphabetically after b
    //-returns 0 when the two strings are the same
    //-split(String del) - returns String array - used for splitting a string
    //wherever del occurs in the larger string and saving each portion into
    //an array

    //warm up
    //count and return how many times letter occurs in word
    public static int howManyLetters(String word, String letter) {

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            String currentLetter = word.substring(i, i+1);
            if (currentLetter.equals(letter)) {
                count++;
            }
        }
        return count;
    }

    //overloaded methods
    //-two methods can have the same name as long as they have different
    //method signatures
    //-a method signature is the method name and its quantity, type, and sequence
    //of parameters
    //substring() is considered overloaded - one version takes two int params, another
    //takes one int param

    public static int max(int a, int b) {
        if (a > b)
            return a;
        return b;
    }

    public static int max(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (b > a && b > c)
            return b;
        return c;
    }

    //invalid bc the signature (set of params) matches the first version of max
//    public static int max(int c, int d) {
//        return 0;
//    }

    //valid bc now the first param is a double instead of an int
    public static int max(double a, int b) {
        if (a > b)
            return (int) a;
        return b;
    }

    //also valid - now the second param is the double
    public static int max(int a, double b) {
        if (a > b)
            return a;
        return (int) b;
    }

    public static void print(String s) {
        System.out.println(s);
    }

    public static void print(int i) {
        //can call an overloaded version of the same method
        print(i+"");
    }

}