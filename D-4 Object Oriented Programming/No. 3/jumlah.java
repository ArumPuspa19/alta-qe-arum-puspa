public class jumlah extends operasi {
    float nilai1;
    float nilai2;

    @Override
    public float jumlahan() {
        float jumlah = nilai1+nilai2;
        System.out.println("Penjumlahan = "+Math.round(jumlah));
        return jumlah;
    }


}
