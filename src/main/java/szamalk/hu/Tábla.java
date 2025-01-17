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

    public int ÜresOszlopokSzáma(){
        int ossz=0;
        for( int j = 0; j < T[0].length; j++ )
        {
            if(ÜresOszlop(j)){
                ossz++;
            }
        }
        return ossz;
    }

    public int ÜresSorokSzáma(){
        int ossz=0;
        for( int j = 0; j < T.length; j++ )
        {
            if(ÜresSor(j)){
                ossz++;
            }
        }
        return ossz;
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
        for (int i = 0; i < 64; i++) {
            Tábla Tábla=new Tábla('*');
            Tábla.Elhelyez(i+1);
            Tábla.Megjelenít();
        }
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

    public boolean ÜresOszlop(int oszlop){
        boolean uresE=true;
        for( int j = 0; j < T.length; j++ )
        {
            if(T[j][oszlop]=='K'){
                uresE=false;
            }
        }
        return uresE;
    }

    public boolean ÜresSor(int sor){
        boolean uresE=true;
        for( int j = 0; j < T[sor].length; j++ )
        {
            if(T[sor][j]=='K'){
                uresE=false;
            }
        }
        return uresE;
    }

}
