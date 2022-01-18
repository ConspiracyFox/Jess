
public class main {
    public static void main(String[] args) {
        char[] [] board =  {{'r', ' ', 'k', ' ', 'b', ' ', 'q', ' ', 'k', ' ', 'b', ' ', 'n', ' ', 'r', ' ',},
                            {'p', ' ', 'p', ' ', 'p', ' ', 'p', ' ', 'p', ' ', 'p', ' ', 'p', ' ', 'p', ' ',},
                            {'.', ' ', '.', ' ', '.', ' ', '.', ' ', '.', ' ', '.', ' ', '.', ' ', '.', ' ',},
                            {'.', ' ', '.', ' ', '.', ' ', '.', ' ', '.', ' ', '.', ' ', '.', ' ', '.', ' ',},
                            {'.', ' ', '.', ' ', '.', ' ', '.', ' ', '.', ' ', '.', ' ', '.', ' ', '.', ' ',},
                            {'.', ' ', '.', ' ', '.', ' ', '.', ' ', '.', ' ', '.', ' ', '.', ' ', '.', ' ',},
                            {'P', ' ', 'P', ' ', 'P', ' ', 'P', ' ', 'P', ' ', 'P', ' ', 'P', ' ', 'P', ' ',},
                            {'R', ' ', 'N', ' ', 'B', ' ', 'Q', ' ', 'K', ' ', 'B', ' ', 'N', ' ', 'R', ' '}};
        printBoard(board);
    }

    public static void printBoard(char[] [] board){
      for (char[] row : board) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

}