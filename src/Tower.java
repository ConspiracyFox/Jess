public class Tower extends ChessPieces{
    public Tower() {
        super("Tower", 'T', 't');
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
        return new char[0][];
    }

    @Override
    public char[][] positionB() {
        return new char[0][];
    }
}
