public class dimensi extends harga{
    void dimensi1 (int panjang, int lebar, int tinggi, int berat) {

        volume = panjang*lebar*tinggi;

        int harga = 0;
        if( volume != 0 && berat != 0){

            if (volume <= 50 && berat == 1) {
                harga = 5000 * berat;
            } else {
                if (volume <= 50 && berat >= 1){
                    harga = 5000 * berat;
                } else {
                    if (volume >= 50 && berat >= 1) {
                        harga = 5000 * berat;
                    }
                }
            }
            System.out.println("Harga: Rp " + Math.round(harga));
        }
    }
}

