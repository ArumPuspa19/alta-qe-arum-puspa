public class segitiga {
    int alas;
    int tinggi;


    public segitiga(int alas, int tinggi){
        this.alas= alas;
        this.tinggi=tinggi;

    }
    public int getalas(){
        return alas;
    }
    public void setalas(int alas){
        this.alas=alas;
    }
    public int gettinggi(){
        return tinggi;
    }
    public void settinggi(int tinggi){
        this.tinggi=tinggi;
    }

    public double kelilingSegitiga(){
        double miring;
        miring= Math.sqrt((alas*alas)+(tinggi*tinggi));
        return this.alas+tinggi+miring;
    }
    public int luasSegitiga(){
        return (alas*tinggi)/2;
    }
}
