package model;

public class PeminjamanNonElektronik extends Peminjaman {
    private String kategoriBarang; 

    public PeminjamanNonElektronik(String nama, String nim, String departemen,
                                   String barang, int jumlah, String kondisiBarang) {
        super(nama, nim, departemen, barang, jumlah, kondisiBarang);
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Barang     : Non-Elektronik");
    }
}
