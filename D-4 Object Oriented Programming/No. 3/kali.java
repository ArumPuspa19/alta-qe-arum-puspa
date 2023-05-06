public class kali extends operasi{
    float nilai1;
    float nilai2;

    @Override
    public float kalian() {
        float jumlah2 = nilai1*nilai2;
        System.out.println("Perkalian = "+Math.round(jumlah2));
        return jumlah2;
    }

}
