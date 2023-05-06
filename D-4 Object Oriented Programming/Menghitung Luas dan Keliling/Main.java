import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input sisi Persegi");
        int sisi = scan.nextInt();
        System.out.println("Input alas segitiga");
        int alas = scan.nextInt();
        System.out.println("Input tinggi segitiga");
        int tinggi = scan.nextInt();
        System.out.println("Input panjang persegi panjang");
        int panjang = scan.nextInt();
        System.out.println("Input lebar persegi panjang");
        int lebar = scan.nextInt();
        persegi kal = new persegi(sisi);
        System.out.println("Menghitung Luas dan Keliling Persegi");
        System.out.println("Hasil luas persegi = " +kal.luasPersegi());
        System.out.println("Hasil keliling persegi= " +kal.kelilingPersegi());
        System.out.println();

        persegipanjang kal1 = new persegipanjang(panjang, lebar);
        System.out.println("Menghitung Luas dan keliling Persegi Panjang");
        System.out.println("Hasil luas persegipanjang= " +kal1.luaspanjangpersegi());
        System.out.println("Hasil keliling persegipanjang= " +kal1.kelilingpersegipanjang());
        System.out.println();

       segitiga kalku = new segitiga(alas, tinggi);
        System.out.println();
        System.out.println("Menghitung Luas dan Keliling Segitiga");
        System.out.println("Hasil luas segitiga= " +kalku.luasSegitiga());
        System.out.println("Hasil keliling segitiga= " +kalku.kelilingSegitiga());


    }
}