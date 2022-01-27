public class Pawn extends ChessPieces {

    public Pawn() {
        super("Pawn",'P' , 'p');
    }


    @Override
    public boolean moveW() {
        return false;
    }

    @Override
    public boolean moveB() {
        return false;
    }

    @Override
    public char[][] positionW() {
        char[][] posW = new char[8][8];


        return new char[1][1];
    }

    @Override
    public char[][] positionB() {
        return new char[0][];
    }

}
