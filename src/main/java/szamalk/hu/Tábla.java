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

    public void Elhelyez(int N){
        int index=0;
        while (index<=N){
            int rnd1= (int) (Math.random()*8);
            int rnd2= (int) (Math.random()*8);
            T[rnd1][rnd2]='K';
            index++;
        }
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
