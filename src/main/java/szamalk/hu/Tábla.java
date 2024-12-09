package szamalk.hu;

public class Tábla {
    private Character ÜresCella;
    private Character[][] T;

    public Tábla(Character üresCella, Character[][] t) {
        this.ÜresCella= üresCella;
        T =new Character[8][8] ;

        for( int i = 0; i < T.length; i++ )
        {
            for( int j = 0; j < T[i].length; j++ )
            {
                T[i][j] = ÜresCella;
            }
        }

    }

    public void ÜresOszlopokSzáma(){

    }

    public void ÜresSorokSzáma(){

    }

    public void Elhelyez(){

    }

    public void FájlbaÍr(){

    }

    public void Megjelenít(){

    }

    public void ÜresOszlop(){

    }

    public void ÜresSor(){

    }

}
