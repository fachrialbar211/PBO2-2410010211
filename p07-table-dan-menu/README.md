# Jawaban Praktikum 5 -- Eksperimen JTable, Menu, dan Dialog

**Nama:** Fachri Albar\
**NPM:** 2410010211\
**Kelas:** 5A\
**Mata Kuliah:** Pemrograman Berbasis Objek 2\
**Modul:** Pertemuan 7 -- Tabel, Menu, dan Mini Proyek GUI

------------------------------------------------------------------------

## 1. Pengaruh `fireTableRowsInserted()`

**Pertanyaan:** Jika pemanggilan `fireTableRowsInserted(baris, baris);`
dijadikan komentar, apakah tabel langsung berubah setelah kontak baru
ditambahkan?

**Jawaban:** Tidak. Data kontak memang sudah ditambahkan ke dalam `List`
pada model, tetapi JTable tidak langsung mengetahui bahwa ada data baru.
Method `fireTableRowsInserted()` berfungsi memberi tahu JTable bahwa
baris baru telah ditambahkan sehingga tabel dapat memperbarui
tampilannya.

## 2. Pengaruh `convertRowIndexToModel()`

**Pertanyaan:** Jika `barisTerpilih()` hanya mengembalikan
`kontakTable.getSelectedRow()`, nama siapa yang muncul pada dialog
konfirmasi setelah mencari kata `ah`, memilih Ahmad Fauzi, lalu klik
Hapus dan pilih No?

**Jawaban:** Baris yang terlihat setelah pencarian memiliki nomor indeks
yang berbeda dari posisi data sebenarnya di model. Jika indeks tampilan
langsung digunakan sebagai indeks model, aplikasi dapat mengambil data
yang salah. Pada contoh modul, indeks tampilan untuk Ahmad Fauzi adalah
1, sedangkan indeks modelnya adalah 2. Karena itu, data yang terbaca
dapat menjadi Budi Santoso, bukan Ahmad Fauzi.

## 3. Perbedaan Dialog Modal dan Nonmodal

**Pertanyaan:** Apa yang terjadi jika `super(pemilik, judul, true)`
diubah menjadi `false`?

**Jawaban:** Dialog menjadi nonmodal. Pengguna tetap dapat mengklik dan
berinteraksi dengan jendela utama meskipun dialog masih terbuka. Berbeda
dengan dialog modal (`true`) yang mengunci jendela utama sampai dialog
ditutup. Akibatnya, alur pengisian dan penyimpanan data dapat menjadi
kurang terkontrol karena jendela utama tetap dapat digunakan.

## 4. Fungsi Accelerator dan Status Tombol Menu

**Pertanyaan:** Mengapa Ctrl+E dan Ctrl+D tidak bekerja ketika tidak ada
baris yang dipilih?

**Jawaban:** Karena tombol Ubah dan Hapus beserta menu item-nya
dinonaktifkan ketika tidak ada baris yang dipilih. Hal ini dilakukan
melalui method `perbaruiTombol()`. Pintasan Ctrl+E dan Ctrl+D terhubung
ke menu Ubah dan Hapus, sehingga aksi tersebut tidak dapat dijalankan
saat menu item dalam keadaan nonaktif. Sementara Ctrl+N tetap dapat
digunakan karena tambah tidak membutuhkan pilihan baris.

## 5. Perubahan Accelerator pada Menu Hapus

**Pertanyaan:** Jika accelerator `hapusItem` diubah menjadi tombol
Delete tanpa Ctrl, baris apa yang berubah pada `initComponents()`?

**Jawaban:** Baris pengaturan accelerator pada `hapusItem` berubah.
Sebelumnya menggunakan `KeyEvent.VK_D` dengan
`InputEvent.CTRL_DOWN_MASK`. Setelah diubah menjadi tombol Delete tanpa
Ctrl, pengaturannya menggunakan `KeyEvent.VK_DELETE` tanpa modifier
Ctrl.

Contoh bentuk kode:

``` java
hapusItem.setAccelerator(
    javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0)
);
```

## 6. Inisialisasi Model Setelah `initComponents()`

**Pertanyaan:** Apa yang terjadi jika deklarasi model hanya
`private KontakTableModel model;`, kemudian objek model dibuat setelah
`initComponents()`?

**Jawaban:** Aplikasi dapat mengalami `NullPointerException` ketika
dijalankan. Penyebabnya adalah `initComponents()` mengatur model JTable
menggunakan variabel `model`, padahal objek model belum dibuat sehingga
nilainya masih `null`. Oleh karena itu, model harus diinisialisasi
sebelum `initComponents()` dipanggil agar dapat digunakan saat komponen
tabel dibuat.

------------------------------------------------------------------------

## Kesimpulan

Dari eksperimen Praktikum 5 dapat disimpulkan bahwa `AbstractTableModel`
harus memberi notifikasi kepada JTable setiap kali data berubah.
Penggunaan `convertRowIndexToModel()` diperlukan agar pemrosesan data
tetap tepat ketika tabel diurutkan atau disaring. Dialog modal membantu
menjaga alur interaksi, sedangkan accelerator mempermudah akses menu.
Selain itu, model harus diinisialisasi sebelum `initComponents()` agar
JTable menerima objek model yang valid.
