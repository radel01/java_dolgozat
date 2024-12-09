package szamalk.hu;

public class Tábla {
    private Character ÜresCella;
    private Character[][] T;

    public Tábla(Character üresCella) {
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
        for( int i = 0; i < T.length; i++ )
        {
            for( int j = 0; j < T[i].length; j++ )
            {
                System.out.print(T[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void ÜresOszlop(){

    }

    public void ÜresSor(){

    }

}
