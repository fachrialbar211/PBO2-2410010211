/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p07;

/**
 *
 * @author Fachri
 */
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class KoleksiBukuModel extends AbstractTableModel {

    private final String[] namaKolom = {
        "Kode", "Judul", "Penulis", "Tahun Terbit", "Status"
    };

    private final List<DataBuku> daftarBuku = new ArrayList<>();

    @Override
    public int getRowCount() {
        return daftarBuku.size();
    }

    @Override
    public int getColumnCount() {
        return namaKolom.length;
    }

    @Override
    public String getColumnName(int kolom) {
        return namaKolom[kolom];
    }

    @Override
    public Object getValueAt(int baris, int kolom) {
        DataBuku buku = daftarBuku.get(baris);

        return switch (kolom) {
            case 0 -> buku.getKode();
            case 1 -> buku.getJudul();
            case 2 -> buku.getPenulis();
            case 3 -> buku.getTahunTerbit();
            case 4 -> buku.getStatus();
            default -> null;
        };
    }

    public DataBuku ambilBuku(int baris) {
        return daftarBuku.get(baris);
    }

    public void tambahBuku(DataBuku buku) {
        daftarBuku.add(buku);
        int baris = daftarBuku.size() - 1;
        fireTableRowsInserted(baris, baris);
    }

    public void ubahBuku(int baris, DataBuku buku) {
        daftarBuku.set(baris, buku);
        fireTableRowsUpdated(baris, baris);
    }

    public void hapusBuku(int baris) {
        daftarBuku.remove(baris);
        fireTableRowsDeleted(baris, baris);
    }

    public int hitungBukuTersedia() {
        return (int) daftarBuku.stream()
                .filter(buku -> buku.getStatus() == Ketersediaan.TERSEDIA)
                .count();
    }
}
