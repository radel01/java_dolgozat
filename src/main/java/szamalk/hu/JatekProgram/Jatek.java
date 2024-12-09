package szamalk.hu.JatekProgram;

public abstract class Jatek{
    private static int jatekDb=0;

    public abstract void kezd();
    public abstract void ment();
    public abstract void vege();

    public Jatek() {
        jatekDb++;
    }

    public static int getJatekDb() {
        return jatekDb;
    }

}
