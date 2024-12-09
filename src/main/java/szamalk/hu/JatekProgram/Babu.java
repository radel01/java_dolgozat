package szamalk.hu.JatekProgram;

public class Babu {
    private int ero;
    private String szin;

    public Babu(String szin) {
        this(szin, 1);
    }

    public Babu(String szin, int ero) {
        this.szin = szin;
        if(ero>=1 && ero<=9) {
            this.ero = ero;
        }

    }


}
