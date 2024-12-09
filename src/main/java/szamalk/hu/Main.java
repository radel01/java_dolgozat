package szamalk.hu;

import szamalk.hu.JatekProgram.LogikaiJatek;

public class Main {
    public static void main(String[] args) {
        Tábla Tábla=new Tábla('#');
        System.out.println("4. feladat: Az üres tábla:");
        Tábla.Megjelenít();
        System.out.println("6. feladat: A feltöltött tábla");
        Tábla.Elhelyez(8);
        Tábla.Megjelenít();

        System.out.println("9. feladat: Üres oszlopok és sorok száma:");
        System.out.println("Oszlopok: "+ Tábla.ÜresOszlopokSzáma());
        System.out.println("Sorok: "+ Tábla.ÜresSorokSzáma());

        LogikaiJatek j1=new LogikaiJatek();
        j1.kezd();
        j1.ment();
        j1.vege();
        System.out.println(j1.toString());

        LogikaiJatek j2=new LogikaiJatek(10);
        j2.kezd();
        j2.ment();
        j2.vege();
        System.out.println(j2.toString());
    }
}