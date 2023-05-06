public class balok {
    int panjang;
    int lebar;
    int tinggi;


    public balok(int lebar, int panjang,int tinggi){
        this.panjang= panjang;
        this.lebar=lebar;
        this.tinggi=tinggi;

    }
    public int getlebar(){
        return lebar;
    }
    public void setlebar(int lebar){
        this.lebar=lebar;
    }
    public int getpanjang(){
        return panjang;
    }
    public void setpanjang(int panjang){
        this.panjang=panjang;
    }
    public int gettinggi(){
        return tinggi;
    }
    public void settinggi(int tinggi){
        this.tinggi=tinggi;
    }

    public int volumebalok(){
        return this.panjang*lebar*tinggi;
    }

}
