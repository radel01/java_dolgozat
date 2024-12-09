package szamalk.hu;

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
    }
}