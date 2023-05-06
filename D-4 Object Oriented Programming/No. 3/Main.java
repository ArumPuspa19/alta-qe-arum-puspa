public class Main {
    public static void main(String[] args) {
        operasi Operasi = new operasi();
        Operasi.jumlahan();
        Operasi.pkurang();
        Operasi.kalian();
        Operasi.bagian();

        //penjumlahan
        jumlah jml = new jumlah();
        jml.nilai1 = 3;
        jml.nilai2 = 4;
        jml.jumlahan();

        //pengurangan
        kurang jml1 = new kurang();
        jml1.nilai1 = 15;
        jml1.nilai2 = 4;
        jml1.pkurang();

        //perkalian
        kali jml2 = new kali();
        jml2.nilai1 = 10;
        jml2.nilai2 = 10;
        jml2.kalian();

        //pembagian
        bagi jml3 = new bagi();
        jml3.nilai1 = 12;
        jml3.nilai2 = 3;
        jml3.bagian();
    }
}
