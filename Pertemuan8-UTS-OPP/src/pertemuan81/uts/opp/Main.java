package pertemuan81.uts.opp;

import java.util.Scanner;
import java.time.LocalDate;

/**
 * Nama : Ni Komang Agustina Trisnadewi
 * NIM  : 2301010030
 * TGL  : 10 Mei 2025
 */
public class Main {
    static Scanner input = new Scanner(System.in);
    static DailyNote[] catatanHarian = new DailyNote[100];
    static int jumlahCatatan = 0;

    public static void main(String[] args) {
        int pilihan;
        do {
            tampilkanMenu();
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tambahCatatan();
                    break;
                case 2:
                    tampilkanCatatan();
                    break;
                case 3:
                    ubahCatatan();
                    break;
                case 4:
                    hapusCatatan();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan Aplikasi Catatan Harian.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }

    static void tampilkanMenu() {
        System.out.println("\n=== Aplikasi Catatan Daily Life ===");
        System.out.println("1. Tambah Catatan Harian");
        System.out.println("2. Lihat Semua Catatan");
        System.out.println("3. Ubah Catatan");
        System.out.println("4. Hapus Catatan");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu (1-5): ");
    }

    static void tambahCatatan() {
        System.out.print("Masukkan judul catatan: ");
        String judul = input.nextLine();
        System.out.print("Masukkan isi catatan: ");
        String isi = input.nextLine();
        String tanggal = LocalDate.now().toString();

        catatanHarian[jumlahCatatan] = new DailyNote(judul, isi, tanggal);
        jumlahCatatan++;
        System.out.println("Catatan harian berhasil ditambahkan.");
    }

    static void tampilkanCatatan() {
        if (jumlahCatatan == 0) {
            System.out.println("Belum ada catatan harian.");
        } else {
            for (int i = 0; i < jumlahCatatan; i++) {
                System.out.println("\nCatatan ke-" + (i + 1));
                catatanHarian[i].tampilkan();
            }
        }
    }

    static void ubahCatatan() {
        tampilkanCatatan();
        if (jumlahCatatan == 0) return;
        System.out.print("Pilih nomor catatan yang ingin diubah: ");
        int index = input.nextInt() - 1;
        input.nextLine();

        if (index >= 0 && index < jumlahCatatan) {
            System.out.print("Masukkan judul baru: ");
            String judulBaru = input.nextLine();
            System.out.print("Masukkan isi baru: ");
            String isiBaru = input.nextLine();
            String tanggal = LocalDate.now().toString();

            catatanHarian[index].setJudul(judulBaru);
            catatanHarian[index].setIsi(isiBaru);
            catatanHarian[index].setTanggal(tanggal);
            System.out.println("Catatan berhasil diubah.");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }

    static void hapusCatatan() {
        tampilkanCatatan();
        if (jumlahCatatan == 0) return;
        System.out.print("Pilih nomor catatan yang ingin dihapus: ");
        int index = input.nextInt() - 1;
        input.nextLine();

        if (index >= 0 && index < jumlahCatatan) {
            for (int i = index; i < jumlahCatatan - 1; i++) {
                catatanHarian[i] = catatanHarian[i + 1];
            }
            jumlahCatatan--;
            System.out.println("Catatan berhasil dihapus.");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }
}
