import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input sisi Kubus");
        int sisi = scan.nextInt();
        System.out.println("Input Panjang Balok");
        int panjang = scan.nextInt();
        System.out.println("Input Tinggi Balok");
        int tinggi = scan.nextInt();
        System.out.println("Input Lebar Balok");
        int lebar = scan.nextInt();
        System.out.println("Input Jari-Jari Tabung");
        int jari = scan.nextInt();
        System.out.println("Input Tinggi Tabung");
        int tinggi1 = scan.nextInt();
        kubus kal = new kubus(sisi);
        System.out.println("Menghitung Volume Kubus");
        System.out.println("Hasil Volume Kubus = " +kal.volumekubus());
        System.out.println();

        balok kal1 = new balok(panjang, lebar, tinggi);
        System.out.println("Menghitung Volume Balok");
        System.out.println("Hasil Valume Balok= " +kal1.volumebalok());
        System.out.println();

        tabung kalku = new tabung(jari, tinggi1);
        System.out.println();
        System.out.println("Menghitung Volume Tabung");
        System.out.println("Hasil Volume Tabung= " +kalku.volumetabung());


    }
    }
