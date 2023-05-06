public class persegi {
    int sisi;


    public persegi(int sisi){
        this.sisi= sisi;

    }
    public int getsisi(){
        return sisi;
    }
    public void setsisi(int sisi){
        this.sisi=sisi;
    }

    public int luasPersegi(){
        return this.sisi*sisi;
    }
    public int kelilingPersegi(){
        return 4*sisi;
    }

}
