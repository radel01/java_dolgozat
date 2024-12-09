package szamalk.hu.JatekProgram;

import java.util.Arrays;

public class LogikaiJatek extends Jatek{
    private Babu[][] tabla;
    private int[] sorrend;
    private int babuDb;

    public LogikaiJatek() {
        this(3);
    }

    public LogikaiJatek(int babuDb) {
        if(babuDb>=2 && babuDb<=15) {
            this.babuDb = babuDb;
        }
        this.tabla=new Babu[4][5];
        this.sorrend=new int[10];

    }
    public void kezd(){
        System.out.println("Kezdés");
    }
    public void ment(){
        System.out.println("Mentés");
    }
    public void vege(){
        System.out.println("Vége");
    }

    public boolean van8FelettEro(){
        return false;
    }

    @Override
    public String toString() {
        return "babuDb=" + babuDb ;
    }
}
