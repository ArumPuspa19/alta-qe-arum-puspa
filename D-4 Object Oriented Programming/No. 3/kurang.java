public class kurang extends operasi{
    float nilai1;
    float nilai2;

    @Override
    public float pkurang() {
        float jumlah1 = nilai1-nilai2;
        System.out.println("Pengurangan = "+Math.round(jumlah1));
        return jumlah1;
    }
    }
