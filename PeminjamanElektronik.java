package model;

public class PeminjamanElektronik extends Peminjaman {
    private String kondisiBarang;

    public PeminjamanElektronik(String nama, String nim, String departemen,
                                String barang, int jumlah, String kondisiBarang) {
        super(nama, nim, departemen, barang, jumlah, kondisiBarang);
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Barang     : Elektronik");
    }
}
