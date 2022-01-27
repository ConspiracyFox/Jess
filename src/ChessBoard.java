public class ChessBoard {
    private char [] [] board;

    public ChessBoard() {
        board = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == 1) {
                    Pawn a = new Pawn();
                    board[i][j] = a.getLogoB();
                }
                else if (i == 6) {
                    board[i][j] = new Pawn().getLogoW();

                } else {
                    board[i][j] = '.';

                }
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ChessBoard a = new ChessBoard();
    }


}
