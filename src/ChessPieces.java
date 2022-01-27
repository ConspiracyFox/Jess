public abstract class ChessPieces implements Pieces {
    private String name;
    private char logoW;
    private char logoB;

    public ChessPieces(String name, char logoW, char logoB) {
        setName(name);
        setLogoW(logoW);
        setLogoB(logoB);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getLogoW() {
        return logoW;
    }

    public void setLogoW(char logoW) {
        this.logoW = logoW;
    }

    public char getLogoB() {
        return logoB;
    }

    public void setLogoB(char logoB) {
        this.logoB = logoB;
    }


}
