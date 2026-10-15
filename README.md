# PBO2-2410010211
# Nama :Fachri Albar
# NPM :2410010211
# Kelas :5A REG PAGI BJM

# tangkapan layar p02-perpustakaan-mini
<img width="959" height="539" alt="Screenshot 2026-09-26 230820" src="https://github.com/user-attachments/assets/0202f877-d893-4e32-93e2-5291240ceac5" />

# jawaban eksperimen
1. Menambahkan Koleksi x = new Koleksi("X01", "Uji", 2026);
Akan muncul error dari compiler karena Koleksi merupakan kelas abstract, sehingga tidak bisa dibuat objeknya secara langsung menggunakan new. Class abstract harus diwariskan terlebih dahulu ke subclass.
2. Mengubah hitungDenda menjadi hitungdenda pada kelas Buku
Jika anotasi @Override masih ada, akan muncul error karena method tersebut tidak lagi memiliki nama yang sama dengan method yang ada di superclass. Jika @Override dihapus, program bisa dikompilasi, tetapi method tersebut dianggap sebagai method baru, bukan overriding dari superclass.
3. Menambahkan new Buku("B009", "", 2020, "Anonim")
Program tetap dapat dijalankan jika constructor tidak memiliki validasi untuk judul kosong. Artinya, objek Buku tetap dibuat dengan judul berupa string kosong. Jika ada validasi judul, hasilnya bisa berupa error atau pesan penolakan, tergantung kode validasinya.
4. Mengubah private StatusKoleksi status menjadi public lalu mengubah B002 menjadi TERSEDIA saat masih dipinjam
Aturan yang dilanggar adalah enkapsulasi dan aturan perubahan status koleksi. Status seharusnya tidak dapat diubah sembarangan dari luar class, apalagi mengubah buku yang masih berstatus dipinjam menjadi tersedia tanpa melalui proses pengembalian yang semestinya.


# tangkapan layar HaloPBO2
<img width="959" height="539" alt="Screenshot 2026-09-22 211307" src="https://github.com/user-attachments/assets/5b82fff9-8cc3-4dab-bb25-a838ae93e007" />


# Tangkapan Layar Kartu Mahasiswa
<img width="954" height="539" alt="Screenshot 2026-09-22 211249" src="https://github.com/user-attachments/assets/5a4d377c-bcf2-4018-a04d-f61e6685463f" />

# Tangkapan Layar Log One Line
<img width="959" height="539" alt="Screenshot 2026-09-22 211710" src="https://github.com/user-attachments/assets/b918187e-b1b9-42ec-b06d-b947eccefc30" />
## -----------------------------------------------------------------------------------------------------------------------------------
## 1. Foto Sketsa Form dan Tabel Rancangan
### A. Foto Sketsa
<img width="960" height="1280" alt="WhatsApp Image 2026-10-15 at 18 02 32" src="https://github.com/user-attachments/assets/b4a117f5-8147-45e3-8672-85d27d5d39df" />

### B. Tabel Rancangan Form Anggota Perpustakaan
| Bagian | Panel | Layout | Empty Border |
| :--- | :--- | :--- | :--- |
| **Jendela** | JFrame | `BorderLayout` | Tidak ada |
| **Header** | `headerPanel` | `BoxLayout` (Y Axis) | 16, 16, 8, 16 |
| **Pembungkus** | `isiPanel` | `BorderLayout` | Tidak ada |
| **Isi form** | `formPanel` | `GridBagLayout` | 8, 16, 8, 16 |
| **Tombol** | `tombolPanel` | `FlowLayout` (Right) | 8, 16, 16, 16 |

## 2. Tangkapan Layar FormAnggotaPerpustakaan

### A. Form Ukuran Awal
<img width="1600" height="899" alt="formanggotaperpustakaan" src="https://github.com/user-attachments/assets/7962da7c-c4b0-4a68-841a-22814e2a955d" />
### B. Form Saat Ukuran Dilebarkan
<img width="1600" height="899" alt="formanggotaperpustakaanlayarfull" src="https://github.com/user-attachments/assets/30486197-c899-4256-af01-bbba8a85fc6c" />
### C. Struktur Desain di Tab Design dan Navigator
<img width="1600" height="899" alt="panelnavigator" src="https://github.com/user-attachments/assets/5cf6c9b0-c03f-4386-a0a0-91a97a43d253" />

## 3. Jawaban Eksperimen & Saran Teman
### A. Eksperimen Praktikum 2 (GaleriLayout)
1. **Perubahan Alignment FlowLayout ke Center:**
   - **Perilaku antarmuka**: Deretan tombol bergeser ke posisi tengah horizontal kontainer. Saat lebar jendela diperkecil hingga tidak muat, tombol yang turun ke baris berikutnya juga tetap otomatis tersusun rata tengah (*center*).
   - **Baris yang berubah di `initComponents()`**: Inisialisasi layout panel berubah menjadi:
     `flowPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 8, 8));`
2. **Perubahan Rows = 0 dan Columns = 2 pada GridLayout:**
   - **Jumlah baris terbentuk**: 5 baris.
   - **Alasan**: Nilai `Rows = 0` membuat jumlah baris bersifat dinamis menyesuaikan jumlah komponen. Karena jumlah kolom dikunci menjadi 2 kolom dan total ada 9 tombol, Java menghitung: $\lceil 9 / 2 \rceil = 5$ baris (baris ke-5 berisi 1 tombol di kolom kiri).
3. **Pengaturan MaximumSize dan Vertical Strut pada BoxLayout:**
   - **Perubahan lebar tombol**: Keempat tombol menu melebar horizontal memenuhi seluruh lebar panel secara seragam (tidak lagi mengikuti panjang teks masing-masing).
   - **Fungsi Vertical Strut**: Berfungsi sebagai pengisi ruang pemisah (*spacer*) tetap secara vertikal di antara tombol menu sehingga jarak antar-tombol tampak konsisten dan tidak berhimpitan.
### B. Eksperimen Praktikum 4 (FormBiodata)
1. **Pengubahan Weight X pada namaField menjadi 0.0 saat dilebarkan:**
   - Kotak isian `namaField` tidak ikut memanjang saat jendela diperlebar, melainkan tetap pada ukuran bawaannya (*preferred size*), menyisakan ruang kosong di sisi kanan.
2. **Pengubahan Direction formPanel dari North menjadi Center saat jendela ditinggikan:**
   - Seluruh baris isian formulir akan berada mengapung di tengah-tengah jendela secara vertikal saat jendela ditinggikan, bukan merapat rapi di bagian atas.
3. **Penghapusan baris setMinimumSize(getSize()) saat jendela diperkecil:**
   - Jendela dapat diciutkan sampai sangat kecil hingga teks label, isian, dan tombol saling menimpa atau terpotong secara tidak wajar.

### C. Evaluasi & Saran Teman (Tahap 4)
- **Nama Pemeriksa**: Teman sekelas / Rekan praktikum
- **Hasil Pemeriksaan**: Seluruh 8 butir daftar periksa terpenuhi (label sejajar, isian terkelompok, placeholder aktif, tombol default di kanan bawah, dan form adaptif tanpa Null/Absolute Layout).
- **Saran Perbaikan**: Tampilan sudah sangat rapi dan konsisten; disarankan memastikan ukuran font pada resolusi layar tinggi tetap nyaman dibaca dan placeholder teks pada email/HP dapat langsung terhapus otomatis saat pengguna mengetik.

---

## 4. Deklarasi Penggunaan AI
- **Pernyataan**: Menggunakan asistensi AI.
- **Alat yang Digunakan**: Gemini (Google AI).
- **Keperluan / Tujuan Penggunaan**:
  1. Diskusi perancangan sketsa hierarki panel dan *nested layout manager*.
  2. Panduan konfigurasi *constraints* `GridBagLayout` (Grid X, Grid Y, Weight X, Fill, Insets).
  3. Pemecahan masalah (*debugging*) sintaks Java dan integrasi FlatLaf.
  4. Analisis pertanyaan refleksi dan eksperimen layout manager.







