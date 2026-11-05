package id.ac.uniska.pbo2.p08.uts.a.latihan;

// Nama : Fachri Albar
// NPM  : 2410010211

public class Barang_Latihan {
    private String nama;
    private String kategori;
    private double harga;
    private int jumlah;

    public Barang_Latihan(String nama, String kategori, double harga, int jumlah) {
        this.nama = nama;
        this.kategori = kategori;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public String getKategori() {
        return kategori;
    }

    public double getHarga() {
        return harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public double hitungSubtotal() {
        return this.harga * this.jumlah;
    }
}