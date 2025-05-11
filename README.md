# Kasus 8: Kasir Asuransi

## Identitas
- Nama: Ripani Nuraprianti
- Kelas: TIF K23B
- NIM: 23552011448
- Kasus: 8 (Kasir Asuransi

## Deskripsi

Program Kasir Asuransi ini adalah aplikasi kasir untuk melakukan transaksi pembayaran premi asuransi menggunakan konsep-konsep pemrograman berorientasi objek seperti inheritance, polymorphism, encapsulation, dan abstraction. Program ini dibuat menggunakan bahasa Java di NetBeans.

## Fitur Program

- **Penerapan Inheritance**: Kelas-kelas turunan yang mewarisi properti dan metode dari kelas induk untuk mengurangi pengulangan kode.
- **Polymorphism**: Penggunaan metode yang dapat memiliki implementasi berbeda berdasarkan objek yang digunakan.
- **Encapsulation**: Pembungkusan data dalam kelas dan penyediaan akses melalui metode getter dan setter.
- **Abstraction**: Penggunaan kelas abstrak untuk mendefinisikan struktur dasar dan membiarkan kelas turunan mengimplementasikan detailnya.

## Struktur Program

**KasirAsuransiApp/
│
├── src/
│ └── kasir/
│ ├── KasirAsuransiApp.java // Main class untuk menjalankan program
│ ├── Nasabah.java // Class untuk data nasabah (Encapsulation)
│ ├── Polis.java // Class untuk data polis asuransi
│ ├── Klaim.java // Class untuk data klaim asuransi
│ ├── Asuransi.java // Abstract class (Abstraction + Polymorphism)
│ ├── Kesehatan.java // Subclass dari Asuransi (Inheritance)
│ ├── Jiwa.java // Subclass dari Asuransi (Inheritance)
│ └── LayananAsuransi.java // Interface (Abstraction)**

## Cara Menjalankan

1. Pastikan telah menginstall [NetBeans IDE](https://netbeans.apache.org/) dan JDK.
2. Download atau clone repository ini.
3. Buka proyek ini di NetBeans.
4. Jalankan aplikasi dengan menekan tombol **Run** atau **F6**.

## Penggunaan

1. Tambahkan nasabah dan produk asuransi dengan mengisi informasi yang diminta.
2. Lakukan transaksi pembayaran premi sesuai dengan jenis asuransi yang dipilih.
3. Laporan transaksi pembayaran dapat dilihat di akhir aplikasi.

## Contoh Output

=== Info Nasabah ===
Nama: Vani
Umur: 20

=== Premi Asuransi ===
Jenis: Kesehatan, Total Premi: Rp600000.0
Jenis: Jiwa, Total Premi: Rp950000.0

=== Data Klaim ===
Klaim ID: 1, Tanggal: 2025-05-11, Status: Diproses

