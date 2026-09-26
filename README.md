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

