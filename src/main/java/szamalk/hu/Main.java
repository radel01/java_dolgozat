package szamalk.hu;

public class Main {
    public static void main(String[] args) {
        Tábla Tábla=new Tábla('#');
        System.out.println("4. feladat: Az üres tábla:");
        Tábla.Megjelenít();
        System.out.println("6. feladat: A feltöltött tábla");
        Tábla.Elhelyez(8);
        Tábla.Megjelenít();
//        System.out.println("Üres-e az 1. sor: "+Tábla.ÜresSor(0));
//        System.out.println("Üres-e az 2. sor: "+Tábla.ÜresSor(1));
//
//        System.out.println("Üres-e az 1. oszlop: "+Tábla.ÜresOszlop(0));
//        System.out.println("Üres-e az 2. oszlop: "+Tábla.ÜresOszlop(1));

        
    }
}