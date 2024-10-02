import java.util.Scanner;

public class flowchartlatihan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jenis buku (kamus/novel/yang lain): ");
        String jenisBuku = scanner.nextLine().toLowerCase();

        System.out.print("Maskkan jumlah buku: ");
        int jumlahBuku = scanner.nextInt();

        System.out.print("Masukkan harga buku: ");
        double hargaBuku = scanner.nextDouble();

        double diskon = 0;

        if (jenisBuku.equals("kamus")) {
            diskon = 10;
            if (jumlahBuku > 2) {
                diskon += 2;
            }
        }else if (jenisBuku.equals("novel")) {
            diskon = 7;
            if (jumlahBuku > 3) {
                diskon += 2;
            }else {
                diskon += 1;
            }
        }else {
            if (jumlahBuku > 3) {
                diskon = 5;

            }
        }System.out.println("Anda mendapat diskon sebesar " + diskon + "%" );

    }
}