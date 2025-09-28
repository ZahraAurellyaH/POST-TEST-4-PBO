package model;

public class Peminjaman {
    public String nama;
    public String nim;
    public String departemen;
    public String barang;
    public int jumlah;
    public String kondisiBarang;


    public Peminjaman(String nama, String nim, String departemen, String barang, int jumlah, String kondisiBarang) {
        this.nama = nama;
        this.nim = nim;
        this.departemen = departemen;
        this.barang = barang;
        this.jumlah = jumlah;
        this.kondisiBarang = kondisiBarang;
    }

    
    public void tampilkanInfo() {
        System.out.println("Nama        : " + nama);
        System.out.println("NIM         : " + nim);
        System.out.println("Departemen  : " + departemen);
        System.out.println("Nama Barang : " + barang);
        System.out.println("Jumlah      : " + jumlah);
        System.out.println("Kondisi Barang: " + kondisiBarang);
    }
}
