package main;

import service.PeminjamanService;
import model.PeminjamanElektronik;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PeminjamanService ps = new PeminjamanService();
        int pil = 0;
        

        do {
            System.out.println("\n=== Manajemen Peminjaman Barang Sekre ===");
            System.out.println("1. Tambah Peminjaman");
            System.out.println("2. Lihat Daftar Peminjaman");
            System.out.println("3. Ubah Data Peminjaman");
            System.out.println("4. Hapus Data Peminjaman");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            String line = sc.nextLine().trim();
            try { pil = Integer.parseInt(line); } 
            catch (Exception e) { pil = -1; }

            switch(pil) {
                case 1 -> ps.tambah();
                case 2 -> ps.lihat();
                case 3 -> ps.ubah();
                case 4 -> ps.hapus();
                case 5 -> System.out.println("Terima kasih!");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pil != 5);
        
        sc.close();
    }
}
