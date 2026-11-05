package id.ac.uniska.pbo2.p08.uts.a.latihan;

// Nama : Fachri Albar
// NPM  : 2410010211

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;

public class DaftarBelanja_Latihan {
    private final List<Barang_Latihan> daftarBarang = new ArrayList<>();
    private final DecimalFormat rupiahFormat;

    public DaftarBelanja_Latihan() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator('.');
        symbols.setDecimalSeparator(',');
        this.rupiahFormat = new DecimalFormat("Rp#,##0", symbols);
    }

    // Validasi data ganda
    public boolean isBarangAda(String nama) {
        for (Barang_Latihan b : daftarBarang) {
            if (b.getNama().equalsIgnoreCase(nama.trim())) {
                return true;
            }
        }
        return false;
    }

    public void tambahBarang(Barang_Latihan b) {
        daftarBarang.add(b);
    }

    public void bersihkanSemua() {
        daftarBarang.clear();
    }

    public double hitungTotal() {
        double total = 0;
        for (Barang_Latihan b : daftarBarang) {
            total += b.hitungSubtotal();
        }
        return total;
    }

    // Aturan diskon 10% jika belanja >= Rp 100.000
    public double hitungDiskon() {
        double total = hitungTotal();
        if (total >= 100000) {
            return total * 0.10;
        }
        return 0;
    }

    public double hitungBayar() {
        return hitungTotal() - hitungDiskon();
    }

    public String formatRupiah(double nilai) {
        return rupiahFormat.format(nilai);
    }

    public String getRingkasan() {
        return String.format("Total %s, diskon %s, bayar %s",
                formatRupiah(hitungTotal()),
                formatRupiah(hitungDiskon()),
                formatRupiah(hitungBayar()));
    }
}