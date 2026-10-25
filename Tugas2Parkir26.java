import java.util.Scanner;

public class Tugas2Parkir26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi;
        int total = 0;

        do {
            System.out.print("Jenis (1: Mobil, 2: Motor, 0: Keluar): ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                if (jenis == 1) {
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;
                }
            } else {
                System.out.println("Jenis kendaraan tidak valid");
            }
        } while (jenis != 0);
        System.out.println("Total pendapatan parkir: " + total);

        sc.close();
    }
}