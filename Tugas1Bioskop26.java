import java.util.Scanner;

public class Tugas1Bioskop26 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlah, totalTiket = 0;
        int totalHarga = 0;
        int subtotal;
        int persenDiskon;

        do {
            System.out.print("Jumlah tiket yang dibeli (ketik 0 untuk keluar): ");
            jumlah = sc.nextInt();

            if (jumlah < 0) {
                System.out.println("Jumlah tiket tidak boleh kurang dari 0. Silakan masukkan ulang!");
                continue;
            }

            if (jumlah > 0) {
                totalTiket += jumlah;
                subtotal = jumlah * hargaTiket;
                persenDiskon = 0;

                if (jumlah > 10) {
                    persenDiskon = 15;
                } else if (jumlah > 4) {
                    persenDiskon = 10;
                }

                totalHarga += subtotal - subtotal * persenDiskon / 100;
            }
        } while (jumlah != 0);

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total harga penjualan: " + totalHarga);

        sc.close();
    }
}