import java.util.Scanner;

public class MainDosen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen data = new DataDosen();

        int pilih;

        do {
            System.out.println("\n1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC");
            System.out.println("4. Sorting DSC");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            if (pilih == 1) {
                System.out.print("\nKode: ");
                String kd = sc.nextLine();
                System.out.print("Nama: ");
                String nm = sc.nextLine();
                System.out.print("Jenis Kelamin (L/P): ");
                String jk = sc.nextLine();
                System.out.print("Usia: ");
                int usia = sc.nextInt();
                sc.nextLine();

                Dosen d = new Dosen(kd, nm, jk, usia);
                data.tambah(d);
            }

            else if (pilih == 2) {
                sc.nextLine();
                data.tampil();
            }

            else if (pilih == 3) {
                sc.nextLine();
                data.sortingASC();
                data.tampil();
            }

            else if (pilih == 4) {
                sc.nextLine();
                data.sortingDSC();
                data.tampil();
            }

        } while (pilih != 0);
    }
}