public class persegipanjang {
    int panjang;
    int lebar;


    public persegipanjang(int lebar, int panjang){
        this.panjang= panjang;
        this.lebar=lebar;

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

    public int luaspanjangpersegi(){
        return this.panjang*lebar;
    }
    public int kelilingpersegipanjang(){
        return 2*(panjang+lebar);
    }
}
