import java.util.Scanner;
public class TTT {

    //class variables - any method can access these
    static Scanner s = new Scanner(System.in);
    static String [][] board;

    public static void main(String [] args) {
        setup();

        String [] names = getNames();
        String [] pieces = {"x", "o"};
        printBoard();

        //1 or 0 - use as an index for names and pieces
        int currentPlayer = 0;
        boolean gameOver = false;
        while(!gameOver) {
            String name = names[currentPlayer];
            String piece = pieces[currentPlayer];

            //two values: row, col
            int [] coords = turn(name, piece);
            printBoard();
            gameOver = win(coords, piece) || tie();
            currentPlayer = change(currentPlayer);
        }
    }

    public static void setup() {
        System.out.println("how big is the board?");
        int size = s.nextInt();
        while (size < 1) {
            System.out.println("invalid");
            System.out.println("how big is the board?");
            size = s.nextInt();
        }
        s.nextLine();
        board = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                board[i][j] = "_";
        }
    }

    public static String [] getNames() {
        String [] names = new String [2];
        //get names, save them to the array

        return names;
    }
}
