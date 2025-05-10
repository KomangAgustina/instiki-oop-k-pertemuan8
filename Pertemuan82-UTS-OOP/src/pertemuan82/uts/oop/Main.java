package pertemuan82.uts.oop;

/**
 *
 * @author Nama: Ni Komang Agustina Trisnadewi
 *         NIM : 2301010030
 *         TGL: 10 Mei 2025
 */
public class Main {
    public static void main(String[] args) {
        Pegawai[] daftarPegawai = new Pegawai[10];

        // Mengisi data menggunakan constructor
        daftarPegawai[0] = new Pegawai("Eva", "198766", 12000000);
        daftarPegawai[1] = new Pegawai("Lina", "198775", 8800000);
        daftarPegawai[2] = new Pegawai("Fauzi", "198774", 10500000);
        daftarPegawai[3] = new Pegawai("Sari", "198778", 4600000);
        daftarPegawai[4] = new Pegawai("Ika", "198767", 7800000);
        daftarPegawai[5] = new Pegawai("Joko", "198769", 8200000);
        daftarPegawai[6] = new Pegawai("Doni", "198765", 4800000);
        daftarPegawai[7] = new Pegawai("Gina", "198766", 9400000);
        daftarPegawai[8] = new Pegawai("Citra", "198776", 3000000);
        daftarPegawai[9] = new Pegawai("Agus", "198780", 10000000);

        // Menampilkan data
        System.out.println("Data Pegawai:");
        for (int i = 0; i < daftarPegawai.length; i++) {
            System.out.println((i + 1) + ". " + daftarPegawai[i].toString());
        }
    }
}
