package pertemuan82.uts.oop;

import java.text.DecimalFormat;

/**
 *
 * @author Nama: Ni Komang Agustina Trisnadewi
 *         NIM : 2301010030
 *         TGL: 10 Mei 2025
 */
public class Pegawai {
    private String nama;
    private String nip;
    private double gaji;

    // Constructor default
    public Pegawai() {
        this.nama = "";
        this.nip = "";
        this.gaji = 0;
    }

    // Constructor overloading
    public Pegawai(String nama, String nip, double gaji) {
        this.nama = nama;
        this.nip = nip;
        this.gaji = gaji;
    }

    // Setter dan Getter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getGaji() {
        return gaji;
    }

    // Method untuk menghitung kategori gaji
    public String kategoriGaji() {
        if (gaji >= 10000000) return "Tinggi";
        else if (gaji >= 5000000) return "Menengah";
        else return "Rendah";
    }

    // Method toString (Overriding)
    @Override
    public String toString() {
    DecimalFormat df = new DecimalFormat();
    return "Nama        : " + nama +
           "\nNIP       : " + nip +
           "\nGaji      : Rp" + df.format(gaji) +
           "\nKategori  : " + kategoriGaji() + "\n";
}

}
