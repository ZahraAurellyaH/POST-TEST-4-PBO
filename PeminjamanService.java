package service;

import model.*;
import java.util.ArrayList;
import java.util.Scanner;
import model.Peminjaman;
import model.PeminjamanElektronik;

public class PeminjamanService implements CrudService {
    ArrayList<Peminjaman> daftar = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    

    public String inputString(String prompt) {
        String s;
        do {
            System.out.print(prompt);
            s = sc.nextLine().trim();
            if (s.isEmpty()) System.out.println("Tidak boleh kosong!");
        } while (s.isEmpty());
        return s;
    }

    private String inputNIM(String prompt) {
        String nim;
        do {
            System.out.print(prompt);
            nim = sc.nextLine().trim();
            if (!nim.matches("\\d{10}")) System.out.println("NIM harus 10 digit angka!");
        } while (!nim.matches("\\d{10}"));
        return nim;
    }

    private int inputJumlah(String prompt) {
        int j = 0;
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine().trim();
            if (line.isEmpty()) return -1; 
            try {
                j = Integer.parseInt(line);
                if (j < 1) System.out.println("Jumlah minimal 1!");
                else break;
            } catch (Exception e) { System.out.println("Harus angka!"); }
        }
        return j;
    }


//    public void tambah() {
//        String nama = inputString("Nama: ");
//        String nim = inputNIM("NIM (10 digit): ");
//        String dept = inputString("Departemen: ");
//        String barang = inputString("Nama Barang: ");
//        int jumlah = inputJumlah("Jumlah: ");
//
//        System.out.print("Jenis Barang (1. Elektronik / 2. Non-Elektronik): ");
//        String pilihan = sc.nextLine().trim();
//
//        if (pilihan.equals("1")) {
//            String kondisi = inputString("Kondisi Baru (Baru/Layak/Rusak): ");
//            daftar.add(new PeminjamanElektronik(nama, nim, dept, barang, jumlah, kondisi));
//        } else {
//            String kategori = inputString("Kategori Barang (Alat Tulis/Perabot/dll): ");
//            daftar.add(new PeminjamanNonElektronik(nama, nim, dept, barang, jumlah, kategori));
//        }
//
//        System.out.println("Data berhasil ditambah!");
//    }
    
    

//    public void lihat() {
//        if (daftar.isEmpty()) { 
//            System.out.println("Belum ada data."); 
//            return; 
//        }
//
//        System.out.println("\n=== Daftar Peminjaman Barang Elektronik ===");
//        int no = 1;
//        for (Peminjaman p : daftar) {
//            if (p instanceof PeminjamanElektronik) {
//                System.out.println(no++ + ".");
//                p.tampilkanInfo();
//                System.out.println("-----------------");
//            }
//        }
//
//        System.out.println("\n=== Daftar Peminjaman Barang Non-Elektronik ===");
//        no = 1;
//        for (Peminjaman p : daftar) {
//            if (p instanceof PeminjamanNonElektronik) {
//                System.out.println(no++ + ".");
//                p.tampilkanInfo();
//                System.out.println("-----------------");
//            }
//        }
//    }
//
//    public void ubah() {
//        if (daftar.isEmpty()) {
//            System.out.println("Belum ada data.");
//            return;
//        }
//
//        // tampilkan semua data dengan index global
//        System.out.println("\n=== Semua Data Peminjaman ===");
//        for (int i = 0; i < daftar.size(); i++) {
//            System.out.println((i + 1) + ".");
//            daftar.get(i).tampilkanInfo();
//            System.out.println("-----------------");
//        }
//
//        System.out.print("Pilih nomor data yang akan diubah: ");
//        int idx = inputJumlah("") - 1;
//        if (idx < 0 || idx >= daftar.size()) {
//            System.out.println("Nomor tidak valid!");
//            return;
//        }
//
//        
//        Peminjaman lama = daftar.get(idx);
//
//      
//        String nama = inputString("Nama Baru: ");
//        String nim = inputNIM("NIM Baru (10 digit angka): ");
//        String dept = inputString("Departemen Baru: ");
//        String barang = inputString("Barang Baru: ");
//        int jumlah = inputJumlah("Jumlah Baru: ");
//
//        System.out.print("Jenis Barang Baru (1. Elektronik / 2. Non-Elektronik): ");
//        String pilihan = sc.nextLine().trim();
//
//        Peminjaman baru;
//        if (pilihan.equals("1")) {
//            String kondisi = inputString("Kondisi Barang (Baru/Layak/Rusak): ");
//            baru = new PeminjamanElektronik(nama, nim, dept, barang, jumlah, kondisi);
//        } else {
//            String kategori = inputString("Kategori Barang (Alat Tulis/Perabot/dll): ");
//            baru = new PeminjamanNonElektronik(nama, nim, dept, barang, jumlah, kategori);
//        }
//
//        
//        daftar.set(idx, baru);
//
//        System.out.println("Data berhasil diubah!");
//    }
//
//    public void hapus() {
//        if (daftar.isEmpty()) {
//            System.out.println("Belum ada data.");
//            return;
//        }
//
//        System.out.println("\n=== Semua Data Peminjaman ===");
//        for (int i = 0; i < daftar.size(); i++) {
//            System.out.println((i + 1) + ".");
//            daftar.get(i).tampilkanInfo();
//            System.out.println("-----------------");
//        }
//
//        System.out.print("Pilih nomor data: ");
//        int idx = inputJumlah("") - 1;
//        if (idx < 0 || idx >= daftar.size()) { 
//            System.out.println("Nomor tidak valid!"); 
//            return; 
//        }
//        daftar.remove(idx);
//        System.out.println("Data berhasil dihapus!");
//    }
    
@Override
public void tambah() {
    String nama = inputString("Nama: ");
    String nim = inputNIM("NIM (10 digit): ");
    String dept = inputString("Departemen: ");
    String barang = inputString("Nama Barang: ");
    int jumlah = inputJumlah("Jumlah: ");

    System.out.print("Jenis Barang (1. Elektronik / 2. Non-Elektronik): ");
    String pilihan = sc.nextLine().trim();

    if (pilihan.equals("1")) {
        String kondisi = inputString("Kondisi Barang (Baru/Layak/Rusak): ");
        daftar.add(new PeminjamanElektronik(nama, nim, dept, barang, jumlah, kondisi));
    } else {
        String kondisi = inputString("Kondisi Barang: ");
        daftar.add(new PeminjamanNonElektronik(nama, nim, dept, barang, jumlah, kondisi));
    }

    System.out.println("Data berhasil ditambah!");
}

@Override
public void lihat() {
    if (daftar.isEmpty()) {
        System.out.println("Belum ada data.");
        return;
    }

    System.out.println("\n=== Peminjaman Elektronik ===");
    int no = 1;
    for (Peminjaman p : daftar) {
        if (p instanceof PeminjamanElektronik) {
            System.out.println(no++ + ".");
            p.tampilkanInfo();
            System.out.println("-----------------");
        }
    }

    System.out.println("\n=== Peminjaman Non-Elektronik ===");
    no = 1;
    for (Peminjaman p : daftar) {
        if (p instanceof PeminjamanNonElektronik) {
            System.out.println(no++ + ".");
            p.tampilkanInfo();
            System.out.println("-----------------");
        }
    }
}


    @Override
    public void ubah() {
        lihat();
        if (daftar.isEmpty()) return;
        System.out.print("Pilih nomor data: ");
        int idx = inputJumlah("") - 1;
        if (idx < 0 || idx >= daftar.size()) { 
            System.out.println("Nomor tidak valid!"); 
            return; 
        }

        Peminjaman p = daftar.get(idx);
        System.out.print("Nama Baru: ");
        String nama = sc.nextLine().trim(); if (!nama.isEmpty()) p.nama = nama;

        String nimBaru;
        while (true) {
            System.out.print("NIM Baru (10 digit angka): ");
            nimBaru = sc.nextLine().trim();
            if (nimBaru.isEmpty() || nimBaru.matches("\\d{10}")) break;
            System.out.println("NIM harus 10 digit angka!");
        }
        if (!nimBaru.isEmpty()) p.nim = nimBaru;

        System.out.print("Departemen Baru: ");
        String dept = sc.nextLine().trim(); if (!dept.isEmpty()) p.departemen = dept;

        System.out.print("Barang Baru: ");
        String barang = sc.nextLine().trim(); if (!barang.isEmpty()) p.barang = barang;

        System.out.print("Jumlah Baru: ");
        String line = sc.nextLine().trim();
        if (!line.isEmpty()) {
            try {
                int j = Integer.parseInt(line);
                if (j >= 1) p.jumlah = j;
            } catch (Exception e) { System.out.println("Jumlah tidak valid!"); }
        }
        
        System.out.print("Kondisi Baru [" + p.kondisiBarang + "]: ");
        String kondisiBarang = sc.nextLine().trim();
        if (!kondisiBarang.isEmpty()) p.kondisiBarang = kondisiBarang;

        System.out.println("Data berhasil diubah!");
    }

    @Override
    public void hapus() {
        lihat();
        if (daftar.isEmpty()) return;
        System.out.print("Pilih nomor data: ");
        int idx = inputJumlah("") - 1;
        if (idx < 0 || idx >= daftar.size()) { 
            System.out.println("Nomor tidak valid!"); 
            return; 
        }
        daftar.remove(idx);
        System.out.println("Data berhasil dihapus!");
    }
}
    


