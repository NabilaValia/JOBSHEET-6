import java.util.Scanner;

public class Pemilihan2Percobaan311 {

    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        // Memasukkan kategori
        System.out.print("Masukkan Kategori (pekerja/pebisnis) : ");
        kategori = input11.nextLine();  // Menggunakan nextLine() untuk kategori

        // Memasukkan penghasilan
        System.out.print("Masukkan Besarnya Penghasilan : ");
        penghasilan = input11.nextInt();  // Menggunakan nextInt() untuk penghasilan

        // Memproses kategori dan penghasilan
        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000) {
                pajak = 0.1;
            } else if (penghasilan <= 3000000) {
                pajak = 0.15;
            } else {
                pajak = 0.2;
            }
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan Bersih : " + gajiBersih);

        } else if (kategori.equalsIgnoreCase("pebisnis")) {
            if (penghasilan <= 2500000) {
                pajak = 0.15;
            } else if (penghasilan <= 3500000) {
                pajak = 0.2;
            } else {
                pajak = 0.25;
            }
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan Bersih : " + gajiBersih);

        } else {
            System.out.println("Masukkan Kategori Salah");
        }
    }
}
