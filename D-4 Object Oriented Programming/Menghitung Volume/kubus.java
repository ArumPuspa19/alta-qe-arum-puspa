public class kubus {
    int sisi;


    public kubus(int sisi){
        this.sisi= sisi;

    }
    public int getsisi(){
        return sisi;
    }
    public void setsisi(int sisi){
        this.sisi=sisi;
    }

    public int volumekubus(){
        return this.sisi*sisi*sisi;
    }

}
