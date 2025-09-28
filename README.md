# POST-TEST-4-PBO

## NAMA: ZAHRA AURELLYA HERDIANSYAH

## NIM: 2409116062

<img width="355" height="248" alt="image" src="https://github.com/user-attachments/assets/56e6e7c9-a063-4b04-9f46-a239524b2b50" />

### Struktur Program Peminjaman Barang Sekre
1. Package main
- Berisi kelas `Main.java` yang menjadi titik masuk (entry point) program.
- Kelas ini menampilkan menu utama (tambah, lihat, ubah, hapus, keluar) dan memanggil fungsi dari PeminjamanService.

2. Package model

- Berisi kelas-kelas yang merepresentasikan data (entity) dalam sistem.
- `Peminjaman.java` → Superclass berisi atribut umum (nama, NIM, departemen, barang, jumlah) serta getter, setter, dan method tampilkanInfo().
- `PeminjamanElektronik.java` → Subclass dari Peminjaman, digunakan khusus untuk barang elektronik dengan tambahan atribut kondisi.
- `PeminjamanNonElektronik.java` → Subclass dari Peminjaman, digunakan untuk barang non-elektronik dengan tambahan atribut bahan.

`Konsep inheritance` (pewarisan) digunakan agar subclass dapat menambahkan atribut spesifik di atas atribut umum dari superclass.

3. Package service
- Berisi kelas PeminjamanService.java yang menangani logika bisnis aplikasi.
- Fungsi utama:

`tambah()` : menambahkan data peminjaman baru (memilih jenis elektronik atau non-elektronik).

`lihat()` : menampilkan daftar peminjaman, dipisahkan antara barang elektronik dan non-elektronik.

`ubah()` : mengubah data lama, termasuk mengganti jenis barang.

`hapus()` : menghapus data peminjaman berdasarkan pilihan pengguna.

### Main.Java

<img width="439" height="113" alt="image" src="https://github.com/user-attachments/assets/dc270845-33c3-4607-94fa-58b3d4e97c16" />

File ini berada pada package `main`.
- Mengimpor `PeminjamanService` dari package service untuk menjalankan fitur tambah, lihat, ubah, dan hapus data.
- Mengimpor `Scanner` dari Java untuk membaca input pengguna.
- Berfungsi sebagai entry point program dengan menampilkan menu utama dan memanggil metode dari `PeminjamanService`.

#
<img width="694" height="137" alt="image" src="https://github.com/user-attachments/assets/346d7986-9bd0-4f7a-b6bb-56e445f3b3da" />

Bagian kode ini adalah **awal dari class `Main`** dan **metode `main`**, fungsinya:

* Membuat objek `Scanner` (`sc`) untuk membaca input dari pengguna.
* Membuat objek `PeminjamanService` (`ps`) untuk mengelola operasi peminjaman (tambah, lihat, ubah, hapus).
* Mendeklarasikan variabel `pil` untuk menyimpan pilihan menu dari pengguna.

Ini menjadi **titik masuk (entry point) program** di mana menu interaktif akan dijalankan.

#
<img width="973" height="328" alt="image" src="https://github.com/user-attachments/assets/b36d0c10-06b0-420a-b525-37f8782474f3" />

Bagian kode ini adalah **loop menu utama** program, fungsinya:
* Menampilkan daftar pilihan menu untuk manajemen peminjaman: **Tambah, Lihat, Ubah, Hapus, Keluar**.
* Membaca input pengguna sebagai string, lalu mencoba **mengubahnya menjadi angka** (`Integer.parseInt`).
* Jika input bukan angka, akan ditangani exception dan variabel `pil` di-set `-1` agar dianggap pilihan tidak valid.
Ini memungkinkan program tetap aman dari input yang salah dan terus menampilkan menu sampai pengguna memilih keluar.

#
<img width="897" height="297" alt="image" src="https://github.com/user-attachments/assets/ba15f8e6-7b80-4ce1-8a9d-f102ebe142f1" />

Bagian kode ini adalah **struktur pengendalian menu** di `Main`:
* Menggunakan `switch` untuk mengeksekusi **aksi sesuai pilihan** (`pil`) dari pengguna:
  * `1` → memanggil `ps.tambah()` untuk menambah data peminjaman.
  * `2` → memanggil `ps.lihat()` untuk menampilkan daftar peminjaman.
  * `3` → memanggil `ps.ubah()` untuk mengubah data peminjaman.
  * `4` → memanggil `ps.hapus()` untuk menghapus data peminjaman.
  * `5` → menampilkan pesan “Terima kasih!” dan keluar dari program.
  * `default` → menampilkan pesan “Pilihan tidak valid!” jika input tidak sesuai.
* `do…while(pil != 5)` memastikan **menu terus muncul** sampai pengguna memilih opsi keluar (`5`).


### Peminjaman.Java

<img width="196" height="25" alt="image" src="https://github.com/user-attachments/assets/ff275713-b856-4cd8-a570-a40ca91fda3b" />

Package `model` berisi class yang merepresentasikan struktur data peminjaman. Di dalamnya terdapat properti, constructor, dan metode akses yang digunakan sebagai dasar pengolahan data pada sistem manajemen peminjaman barang.

#
<img width="382" height="181" alt="image" src="https://github.com/user-attachments/assets/5dda1412-d899-4219-b5e1-65bf2ebfcd5d" />

- Merupakan superclass yang menyimpan atribut umum peminjaman, yaitu:
  - nama : nama peminjam
  - nim : nomor induk mahasiswa
  - departemen : asal departemen
  - barang : nama barang yang dipinjam
  - jumlah : banyaknya barang yang dipinjam
- Atribut dibuat private untuk menerapkan enkapsulasi, dan diakses melalui getter & setter.
- Menyediakan metode tampilkanInfo() untuk menampilkan data peminjaman.

#
<img width="1096" height="196" alt="image" src="https://github.com/user-attachments/assets/1b51816e-71d4-4e71-ae49-ab091d2a6b8c" />

`Constructor Peminjaman` berfungsi untuk membuat objek baru dan langsung mengisi semua atribut (nama, nim, departemen, barang, jumlah) dengan data yang diberikan saat objek dibuat.

#
<img width="457" height="516" alt="image" src="https://github.com/user-attachments/assets/7284a4bd-e7b0-491b-985a-c461df8cc9b9" />

- Digunakan untuk mengambil nilai dari atribut yang bersifat private.
- Getter yang tersedia:
  - getNama() → mengembalikan nilai nama.
  - getNim() → mengembalikan nilai nim.
  - getDepartemen() → mengembalikan nilai departemen.
  - getBarang() → mengembalikan nilai barang.
  - getJumlah() → mengembalikan nilai jumlah.
- Dengan getter, data tetap terjaga (enkapsulasi) tetapi bisa diakses dari luar kelas dengan cara yang aman.

#
<img width="645" height="518" alt="image" src="https://github.com/user-attachments/assets/d29c4c43-7042-469a-8b2c-b1019796fbea" />

- Digunakan untuk mengubah atau menetapkan nilai pada atribut private.
- Setter yang tersedia:
  - setNama(String nama) → menetapkan nilai nama.
  - setNim(String nim) → menetapkan nilai nim.
  - setDepartemen(String departemen) → menetapkan nilai departemen.
  - setBarang(String barang) → menetapkan nilai barang.
  - setJumlah(int jumlah) → menetapkan nilai jumlah.
- Dengan setter, nilai atribut dapat dimodifikasi secara terkendali, tetap menjaga prinsip enkapsulasi.

#
<img width="713" height="224" alt="image" src="https://github.com/user-attachments/assets/60a16ddb-d9d6-45ba-9f77-c37fb1cd7127" />

Disediakan method `tampilkanInfo()` yang langsung menampilkan semua informasi peminjaman ke layar.


### PeminjamanElektronik.Java

<img width="193" height="29" alt="image" src="https://github.com/user-attachments/assets/86157f3b-bc18-46a7-8137-eacbfb4d00be" />

Package `model` berisi class yang merepresentasikan struktur data peminjaman.

#
<img width="668" height="56" alt="image" src="https://github.com/user-attachments/assets/13de4546-6c26-4fcc-b704-237083d8c899" />

`PeminjamanElektronik` adalah subclass dari `Peminjaman` yang menambahkan atribut **kondisiBarang** untuk menyimpan kondisi barang elektronik, dengan akses melalui getter-setter serta override method `tampilkanInfo()`.

#
<img width="1027" height="134" alt="image" src="https://github.com/user-attachments/assets/519c4b11-c124-4771-b64e-7d69dfbc4771" />

Konstruktor tersebut digunakan untuk menginisialisasi objek **`PeminjamanElektronik`** dengan memanggil konstruktor superclass `Peminjaman` dan menambahkan atribut baru **`kondisiBarang`**.

#
<img width="715" height="194" alt="image" src="https://github.com/user-attachments/assets/c930deec-284d-496c-b117-71d8a3ff0beb" />

Method **`getKondisiBarang()`** digunakan untuk mengambil nilai kondisi barang elektronik, sedangkan **`setKondisiBarang(String kondisiBarang)`** digunakan untuk mengubah atau menetapkan nilai kondisi barang tersebut.

#
<img width="929" height="181" alt="image" src="https://github.com/user-attachments/assets/57e717dd-9964-4429-8ae2-b137a3ee91e5" />

Method **`tampilkanInfo()`** dioverride untuk menambahkan informasi **kondisi barang elektronik** setelah menampilkan data umum dari superclass `Peminjaman`.


### PeminjamanNonElektronik.Java

<img width="193" height="29" alt="image" src="https://github.com/user-attachments/assets/86157f3b-bc18-46a7-8137-eacbfb4d00be" />

Package `model` berisi class yang merepresentasikan struktur data peminjaman.

#
<img width="703" height="63" alt="image" src="https://github.com/user-attachments/assets/ffadb215-1200-46ab-a805-97a61bae40f0" />

`PeminjamanNonElektronik` adalah subclass dari `Peminjaman` yang menambahkan atribut **kategoriBarang** untuk membedakan jenis barang non-elektronik, dengan pengelolaan melalui getter-setter serta override method `tampilkanInfo()`.

#
<img width="1075" height="150" alt="image" src="https://github.com/user-attachments/assets/365c1cd9-5271-4e3f-8fbb-9741a3bbe925" />

Itu adalah **konstruktor** dari kelas `PeminjamanElektronik`.
Fungsinya untuk membuat objek baru dengan mengisi data umum peminjaman (`nama`, `nim`, `departemen`, `barang`, `jumlah`) melalui pemanggilan `super(...)`, lalu menambahkan data khusus elektronik berupa **`kondisiBarang`**.

#
<img width="715" height="191" alt="image" src="https://github.com/user-attachments/assets/a56a8f50-4042-4df1-bfa7-a34d1f664a3f" />

Dua method ini adalah **getter dan setter**:

* `getKondisiBarang()` → mengambil nilai kondisi barang elektronik.
* `setKondisiBarang(String kondisiBarang)` → menetapkan atau mengubah nilai kondisi barang elektronik.

#
<img width="912" height="174" alt="image" src="https://github.com/user-attachments/assets/fad3f472-2326-496b-8330-29689eacc691" />

Method **`tampilkanInfo()`** dioverride untuk menambahkan informasi **kategori barang elektronik** setelah menampilkan data umum dari superclass `Peminjaman`.


### PeminjamanService.Java

<img width="366" height="133" alt="image" src="https://github.com/user-attachments/assets/0ecb16cc-1e36-4d3d-9c40-b6bc29a44436" />

- Package: kelas ini berada di package service.
- Import:
  - model.* → mengimpor semua kelas dari package model (seperti Peminjaman, PeminjamanElektronik, PeminjamanNonElektronik).
  - java.util.ArrayList → digunakan untuk menyimpan daftar data peminjaman.
  - java.util.Scanner → digunakan untuk input data dari pengguna.

 #
 <img width="658" height="95" alt="image" src="https://github.com/user-attachments/assets/60dd575a-8e80-4169-bb08-b3f86d69fb5e" />

Kelas PeminjamanService berfungsi untuk mengelola data peminjaman.
- ArrayList<Peminjaman> daftar → menyimpan kumpulan objek peminjaman (baik elektronik maupun non-elektronik).
- Scanner sc → digunakan untuk menerima input dari pengguna.

#
<img width="890" height="240" alt="image" src="https://github.com/user-attachments/assets/5773a51f-a24f-49df-a1a6-81f2ee9481e2" />

Method `inputString` berfungsi meminta input teks dari pengguna, memastikan tidak kosong, dan mengembalikan hasil yang sudah valid.

#
<img width="1112" height="238" alt="image" src="https://github.com/user-attachments/assets/53c45ece-170b-49a9-b1b5-3d3c95b92736" />

Method `inputNIM` digunakan untuk meminta input NIM dari pengguna, dengan validasi bahwa NIM harus berupa **10 digit angka**, jika tidak sesuai maka akan diminta ulang hingga benar.

#
<img width="926" height="366" alt="image" src="https://github.com/user-attachments/assets/11879948-0b7a-4bae-aaa1-f21d7b05b7c8" />

Method `inputJumlah` digunakan untuk meminta input jumlah barang dari pengguna, dengan validasi bahwa input harus berupa angka dan minimal **1**, jika kosong akan mengembalikan **-1**.

#
<img width="1185" height="538" alt="image" src="https://github.com/user-attachments/assets/d29098ec-4ec3-43f4-9572-d10c9b7f11d8" />

Method `tambah` berfungsi untuk menambahkan data peminjaman baru dengan meminta input pengguna. Data umum seperti **nama, NIM, departemen, barang, dan jumlah** dicatat, lalu pengguna memilih jenis barang. Jika **elektronik**, ditambahkan atribut kondisi barang, sedangkan jika **non-elektronik**, ditambahkan kategori barang. Data kemudian disimpan ke dalam daftar dan ditampilkan pesan bahwa data berhasil ditambah.

#
<img width="992" height="696" alt="image" src="https://github.com/user-attachments/assets/4f8a4782-ac11-45f0-ba80-682ec4f49e95" />

Method `lihat` digunakan untuk menampilkan seluruh data peminjaman. Jika belum ada data, akan muncul pesan **“Belum ada data”**. Data kemudian dipisahkan ke dalam dua daftar: **barang elektronik** dan **non-elektronik**, ditampilkan secara berurutan dengan nomor dan detail informasi tiap peminjaman.

#
<img width="833" height="547" alt="image" src="https://github.com/user-attachments/assets/32ef1282-b229-42e8-b858-065558724c91" />

Method `ubah` digunakan untuk mengedit data peminjaman. Jika daftar kosong, muncul pesan **“Belum ada data”**. Semua data ditampilkan dengan nomor urut, lalu pengguna memilih nomor data yang ingin diubah. Jika nomor yang dipilih tidak valid, sistem akan menolak dan memberi pesan kesalahan.

#
<img width="1115" height="701" alt="image" src="https://github.com/user-attachments/assets/d7ed659a-52e6-4990-9cd0-cb5609d2be89" />

Potongan lanjutan method `ubah` ini berfungsi untuk mengganti data lama dengan data baru.

* Data lama diambil dari daftar berdasarkan indeks pilihan.
* Pengguna mengisi ulang data baru (nama, NIM, departemen, barang, jumlah).
* Jika barang elektronik, diminta **kondisi barang**; jika non-elektronik, diminta **kategori barang**.
* Objek baru dibuat sesuai pilihan lalu **mengganti data lama** di posisi yang sama pada daftar.
* Terakhir, muncul pesan **“Data berhasil diubah!”**.

#
<img width="786" height="625" alt="image" src="https://github.com/user-attachments/assets/3ee62f79-5b5d-43df-8167-54fbcda78c0f" />

Method `hapus` digunakan untuk menghapus data peminjaman.

* Jika daftar masih kosong, tampil pesan **“Belum ada data.”**.
* Semua data ditampilkan dengan nomor urut.
* Pengguna memilih nomor data yang ingin dihapus. Jika nomor tidak valid, muncul pesan error.
* Jika valid, data akan dihapus dari daftar, lalu ditampilkan pesan **“Data berhasil dihapus!”**.


### PENERAPAN ABSTRACTION
Abstraction adalah konsep OOP (Object-Oriented Programming) yang digunakan untuk menyembunyikan detail implementasi dan hanya menampilkan fungsionalitas utama. Dengan abstraction, kita bisa fokus pada apa yang dilakukan sebuah class/interface, bukan bagaimana cara melakukannya.

<img width="380" height="214" alt="image" src="https://github.com/user-attachments/assets/70e7baeb-49ff-479e-b6e7-edc25f19d637" />

CrudService adalah interface → hanya berisi kontrak (method tambah, lihat, ubah, hapus) tanpa isi.
Class PeminjamanService mengimplementasikan interface ini, sehingga wajib memberikan isi methodnya.


### PENERAPAN POLYMORPHISM
Polymorphism adalah konsep dalam OOP (Object-Oriented Programming) yang memungkinkan sebuah method atau objek memiliki banyak bentuk.

## Overloading
Overloading terjadi ketika terdapat dua atau lebih method dengan nama yang sama, tetapi memiliki parameter yang berbeda (baik jumlah maupun tipenya).

<img width="762" height="250" alt="image" src="https://github.com/user-attachments/assets/44f0b176-4299-401a-8d09-1640cda35919" />

<img width="1090" height="539" alt="image" src="https://github.com/user-attachments/assets/8360a494-fb47-4d7b-b931-f254fc96c02a" />

<img width="779" height="702" alt="image" src="https://github.com/user-attachments/assets/6d371631-e6c8-49c4-bb6f-84feecdb5206" />

<img width="1067" height="678" alt="image" src="https://github.com/user-attachments/assets/7903d30c-7e39-428a-8a84-395d267e3e78" />

<img width="666" height="350" alt="image" src="https://github.com/user-attachments/assets/82f5c340-1258-4450-ae8d-3362cf4f972d" />


## Overriding
Overriding terjadi ketika sebuah class anak (atau implementasi dari interface) menulis ulang method dari class induk atau interface dengan isi/implementasi yang berbeda.

<img width="290" height="59" alt="image" src="https://github.com/user-attachments/assets/b8ba9916-4013-4bc1-b913-b1bb53a44aed" />

<img width="281" height="60" alt="image" src="https://github.com/user-attachments/assets/24264d32-9969-43af-85e0-73f4e532c412" />

<img width="265" height="65" alt="image" src="https://github.com/user-attachments/assets/273a0476-5659-4816-a424-aab2e0b79f0f" />

<img width="272" height="59" alt="image" src="https://github.com/user-attachments/assets/01ab2195-1846-4fd6-bd1b-c1c1968855d8" />

<img width="364" height="55" alt="image" src="https://github.com/user-attachments/assets/e2cc7c1d-df04-41d0-b3f4-40a42b7ccb3a" />



### Alur Program

<img width="476" height="198" alt="image" src="https://github.com/user-attachments/assets/7290afc0-6b2f-4be5-b3f8-64a82640c1d1" />

Saat pertama kali program dijalankan, user langsung memilih menu nomor 2. Belum ada data yang muncul dikarenakan belum ada pengisian peminjaman.

#
<img width="480" height="199" alt="image" src="https://github.com/user-attachments/assets/03c0e07c-1975-425d-a3c6-ea15bbbe166e" />

Saat user salah menginput angka atau menginput huruf, maka akan muncul pilihan tidak valid, dan akan kembali ke menu utama.

#
<img width="575" height="441" alt="image" src="https://github.com/user-attachments/assets/137bb771-51e8-4f9d-86f0-d5a66e2e6e06" />

User memilih menu nomor 1, yaitu tambah peminjaman. User akan diminta untuk mengisi beberapa keterangan peminjaman. Untuk nim diharuskan menginput 10 angka, jika kurang atau lebih maka akan dimintai kembali.

#
<img width="592" height="390" alt="image" src="https://github.com/user-attachments/assets/8449a06a-771b-436e-90e7-5b1a07f5678c" />

Disini user memilih kembali menu nomor 1.

#
<img width="487" height="636" alt="image" src="https://github.com/user-attachments/assets/8ce6595a-52d5-407d-b907-a39925ada1be" />

User memilih menu nomor 2 dan program akan memperlihatkan daftar peminjaman yang sudah di input sebelumnya.

#
<img width="627" height="676" alt="image" src="https://github.com/user-attachments/assets/1e3ca408-fd13-4b9a-a0fa-55cf7b42a007" />

User memilih menu 3. yaitu untuk mengubah data peminjaman. program akan memperlihatkan semua data peminjaman dan akan meminta user untuk meilih nomor data yang akan diubah. Selanjutnya user akan diminta untuk mengisi kembali keterangan yang baru.

#
<img width="541" height="482" alt="image" src="https://github.com/user-attachments/assets/944776d4-132c-4971-87cb-12a8439f9517" />

Diatas merupakan daftar peminjaman barang yang sudah diubah sebelumnya.

#
<img width="395" height="597" alt="image" src="https://github.com/user-attachments/assets/99ba0d4e-9a7d-4f54-be0a-f1e64b3fd21d" />

User memilih menu nomor 4, yangb dimana kan menghapus data peminjaman. Saat user salah menginput huruf, maka akan diminta kembali mengisi dengan angka.

#
<img width="648" height="302" alt="image" src="https://github.com/user-attachments/assets/1da1de87-e08a-4ec6-ad83-e74c4def849f" />

Diatas merupakan hasil dari menghapus data.

#
<img width="818" height="413" alt="image" src="https://github.com/user-attachments/assets/3428e3b2-6495-4487-aafc-50348ebe9322" />

Yang terakhir yaitu menu nomor 5, program selesai dan akan keluar dari program.
