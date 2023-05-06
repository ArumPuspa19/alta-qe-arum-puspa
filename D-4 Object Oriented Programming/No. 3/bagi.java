public class bagi extends operasi{
    float nilai1;
    float nilai2;

    @Override
    public float bagian() {
        float jumlah5 = nilai1/nilai2;
        System.out.println("Pembagian = "+Math.round(jumlah5));
        return jumlah5;
    }
}
