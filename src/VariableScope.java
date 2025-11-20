public class VariableScope {

    public static void main(String [] args) {
        int [] nums = {7, 2, 5, 1, 9};
        //the array you pass to the method call doesn't need
        //to be named the same as the parameter
        sort(nums);
        for (int n: nums)
            System.out.print(n + " ");
        System.out.println();


        String [] words = {"potato", "banana", "apple", "pickle", "banana", "hamster"};
        sort(words);
        for (String w: words)
            System.out.print(w + " ");
        System.out.println();

        String sentence = "the quick brown fox jumps over the lazy dog";
        String [] sWords = sentence.split(" ");
        sort(sWords);
        for (String w: sWords)
            System.out.print(w + " ");
        System.out.println();

        if(Math.random() < .5) {
            int x = 5;
        }
        //x = 8;

        //variable scope -
        //where a variable is declared determnines where you can
        //access that variable
        //same with methods - params and variables within a method
        //only exist within that method

        //arr and y are only local to the sort() method
        //arr[0] = 2;
        //y = 9;

        int a = 0;
        double b = 9.2;
        boolean c = false;
        String d = "something else";
        int [] nums2 = {1, 2, 3};

        doSomething(a, b, c, d, nums2);

        System.out.println(a + " " + b + " " + c + " " + d);
        for (int n: nums2)
            System.out.print(n + " ");

        //for int, double, boolean, String - if you pass a value to a method call,
        //any changes to the values that the method might make are NOT kept in the original
        //place the values were declared

        //for arrays - any changes a method makes ARE kept elsewhere in the program
    }

    public static void doSomething(int i, double d, boolean b, String s, int [] nums) {
        i = -1;
        d = 1.5;
        b = true;
        s = "something";
        nums[0] = 8;
    }

    //warm up - implement the sorting alg of your choice
    //-try to write it from memory/logic, without looking
    //-increasing order
    public static void sort(int [] arr) {
        int y = 0;
        for (int i = 0; i < arr.length; i++) {
            int swapI = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[swapI]) {
                    swapI = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[swapI];
            arr[swapI] = temp;
        }
    }

    //overloaded methods are methods with the same name but
    //different sets of params
    public static void sort(String [] arr) {
        for (int i = 0; i < arr.length; i++) {
            int swapI = i;
            for (int j = i + 1; j < arr.length; j++) {
                //for strings, use compareTo() to determine
                //which one comes alphabetically before/after
                //another
                if (arr[j].compareTo(arr[swapI]) < 0) {
                    swapI = j;
                }
            }

            String temp = arr[i];
            arr[i] = arr[swapI];
            arr[swapI] = temp;
        }
    }
}
