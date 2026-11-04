/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p07;

/**
 *
 * @author Fachri
 */
public class DataBuku {
    
    private String kode;
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private Ketersediaan status;

    public DataBuku(String kode, String judul, String penulis,
                    int tahunTerbit, Ketersediaan status) {
        this.kode = kode;
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.status = status;
    }

    public String getKode() {
        return kode;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public Ketersediaan getStatus() {
        return status;
    }
}
