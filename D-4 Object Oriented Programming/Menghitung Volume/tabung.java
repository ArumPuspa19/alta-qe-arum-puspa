public class tabung {
   double jari;
    double tinggi;
    final double PHI = 3.14;


    public tabung(double jari, double tinggi){
        this.jari= jari;
        this.tinggi=tinggi;
    }
    public double getJari(){
        return jari;
    }
    public void setTinggi(double tinggi){
        this.tinggi=tinggi;
    }

    public double volumetabung(){
        return (PHI*jari*jari)* tinggi;
    }
}
