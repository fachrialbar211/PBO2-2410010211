# Penggunaan AI

## Nama AI

**ChatGPT (GPT-5.6 Luna)**

AI digunakan sebagai media pendukung selama proses pembuatan aplikasi `FormTiketTravel`. Pemanfaatannya terutama untuk membantu memahami cara kerja komponen Java Swing, menyusun logika pada event tombol, menerapkan tampilan FlatLaf, serta mencari penyebab ketika terdapat kesalahan pada source code.

---

## Prompt 1 – Menampilkan Hasil Input Pengguna

### Prompt

> "Saya sedang membuat aplikasi pemesanan tiket travel dengan Java Swing. Saya ingin tombol Pesan mengambil seluruh informasi yang terdapat pada form, kemudian menampilkan hasilnya dalam sebuah pop-up. Data yang perlu diambil adalah nama, nomor HP, tujuan perjalanan, kelas tiket, pilihan fasilitas, dan catatan. Bagaimana cara membuat event tombol tersebut?"

### Hasil Jawaban AI

AI menjelaskan bahwa data dari setiap komponen dapat dibaca sesuai dengan jenis komponennya. `JTextField` dan `JTextArea` menggunakan `getText()`, `JComboBox` menggunakan `getSelectedItem()`, sedangkan `JRadioButton` dan `JCheckBox` dapat diperiksa menggunakan `isSelected()`.

Setelah semua nilai diperoleh, data dapat disusun menjadi sebuah `String` dan ditampilkan melalui `JOptionPane`.

Contoh kode yang digunakan:

```java
private void prosesPemesanan() {

    String nama = namaPemesanField.getText();
    String hp = nomorHpField.getText();
    String tujuan = (String) kotaTujuanCombo.getSelectedItem();

    String kelas = "";

    if (ekonomiRadio.isSelected()) {
        kelas = "Ekonomi";
    } else if (bisnisRadio.isSelected()) {
        kelas = "Bisnis";
    } else if (eksekutifRadio.isSelected()) {
        kelas = "Eksekutif";
    }

    String fasilitas = "";

    if (bagasiCheck.isSelected()) {
        fasilitas += "Bagasi, ";
    }

    if (makanCheck.isSelected()) {
        fasilitas += "Makan, ";
    }

    if (asuransiCheck.isSelected()) {
        fasilitas += "Asuransi";
    }

    if (fasilitas.isEmpty()) {
        fasilitas = "Tidak ada fasilitas";
    }

    String hasil =
            "RINGKASAN TIKET\n"
            + "------------------------\n"
            + "Nama       : " + nama
            + "\nNo. HP     : " + hp
            + "\nTujuan     : " + tujuan
            + "\nKelas      : " + kelas
            + "\nFasilitas  : " + fasilitas
            + "\nCatatan    : " + catatanArea.getText();

    JOptionPane.showMessageDialog(
            this,
            hasil,
            "Detail Pemesanan",
            JOptionPane.INFORMATION_MESSAGE
    );
}
```

Kode tersebut digunakan agar data yang sudah dimasukkan pengguna dapat dikumpulkan dan ditampilkan kembali dalam satu jendela informasi.

---

## Prompt 2 – Menambahkan Fitur Dark Mode

### Prompt

> "Bagaimana cara membuat fitur Dark Mode pada aplikasi Java Swing yang menggunakan FlatLaf? Saya memiliki sebuah JToggleButton. Saat tombol aktif saya ingin menggunakan FlatDarkLaf, sedangkan saat tombol tidak aktif saya ingin kembali ke FlatLightLaf."

### Hasil Jawaban AI

AI menyarankan penggunaan kondisi berdasarkan status `JToggleButton`. Apabila tombol bernilai `true`, program menjalankan `FlatDarkLaf.setup()`. Jika nilainya `false`, aplikasi menggunakan `FlatLightLaf.setup()`.

Setelah tema diganti, `FlatLaf.updateUI()` dipanggil untuk memperbarui tampilan seluruh komponen pada form.

Kode yang diberikan:

```java
private void aturTema() {

    boolean modeGelap = temaToggle.isSelected();

    if (modeGelap) {
        FlatDarkLaf.setup();
        temaToggle.setText("Light");
    } else {
        FlatLightLaf.setup();
        temaToggle.setText("Dark");
    }

    FlatLaf.updateUI();
}
```

Kemudian kode tersebut dihubungkan dengan event `JToggleButton`:

```java
private void temaToggleActionPerformed(
        java.awt.event.ActionEvent evt) {

    aturTema();
}
```

Dengan implementasi tersebut, pengguna dapat mengubah tampilan aplikasi secara langsung melalui tombol toggle.

---

## Prompt 3 – Mengatasi Error Nama Variabel

### Prompt

> "Ketika saya menjalankan project FormTiketTravel di NetBeans muncul error karena program tidak mengenali nama variabel dari salah satu komponen GUI. Bagaimana cara mengetahui nama variabel komponen tersebut dan memperbaikinya melalui NetBeans tanpa mengedit kode otomatis?"

### Hasil Jawaban AI

AI menjelaskan bahwa salah satu penyebabnya adalah nama variabel pada source code berbeda dengan nama variabel komponen yang dibuat melalui GUI Builder.

Untuk memeriksanya, komponen yang bermasalah dapat dipilih pada tab **Design**. Setelah itu, nama variabel diperiksa melalui pengaturan komponen. Apabila nama yang digunakan berbeda, nama variabel dapat disesuaikan menggunakan fitur **Change Variable Name**.

Misalnya source code menggunakan:

```java
temaToggle.isSelected();
```

maka nama variabel `JToggleButton` pada GUI Builder harus sesuai dengan `temaToggle`.

AI juga menyarankan agar bagian `initComponents()` tidak diedit secara langsung. Jika ada perubahan terhadap komponen form, perubahan sebaiknya dilakukan melalui GUI Builder agar kode yang dibuat otomatis oleh NetBeans tetap aman.

---

# Alasan Menggunakan AI

AI digunakan sebagai alat bantu selama proses pengembangan `FormTiketTravel`, terutama ketika membutuhkan referensi mengenai penerapan komponen Java Swing dan penyelesaian masalah pada kode.

Bantuan AI digunakan untuk membuat contoh logika pengambilan data dari form, mengolah pilihan pengguna, menampilkan informasi pemesanan melalui `JOptionPane`, serta menerapkan pergantian tema menggunakan FlatLaf.

Selain itu, AI dimanfaatkan untuk memahami pesan error yang muncul selama proses pengerjaan. Penjelasan yang diberikan kemudian dibandingkan dengan struktur project yang dibuat di NetBeans sehingga solusi yang digunakan dapat disesuaikan dengan kondisi aplikasi.

Kode dari AI tidak langsung digunakan tanpa pemeriksaan. Setiap kode dipelajari dan disesuaikan dengan nama komponen yang terdapat pada `FormTiketTravel`. Sementara itu, pembuatan layout dan penempatan komponen tetap dilakukan secara langsung melalui **NetBeans GUI Builder**.

Penggunaan AI membantu memahami beberapa konsep seperti penggunaan `getText()`, `getSelectedItem()`, `isSelected()`, event handler, `JOptionPane`, serta penerapan Look and Feel menggunakan FlatLaf. Dengan demikian, AI berfungsi sebagai pendamping dalam proses pembelajaran dan bukan sebagai pengganti proses pengerjaan program.
