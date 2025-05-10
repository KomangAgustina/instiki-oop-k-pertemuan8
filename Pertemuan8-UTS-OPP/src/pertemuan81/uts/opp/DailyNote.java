package pertemuan81.uts.opp;

/**
 * Nama : Ni Komang Agustina Trisnadewi
 * NIM  : 2301010030
 * TGL  : 10 Mei 2025
 */
public class DailyNote {
    private String judul;
    private String isi;
    private String tanggal;

    public DailyNote() {
        this.judul = "Tanpa Judul";
        this.isi = "Tidak ada isi.";
        this.tanggal = "Tidak diketahui";
    }

    public DailyNote(String judul, String isi, String tanggal) {
        this.judul = judul;
        this.isi = isi;
        this.tanggal = tanggal;
    }

    public String getJudul() {
        return judul;
    }

    public String getIsi() {
        return isi;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public void tampilkan() {
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Judul  : " + judul);
        System.out.println("Isi    : " + isi);
    }
}
