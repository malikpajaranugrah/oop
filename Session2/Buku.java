public class Buku {
    private String penulis;
    private String judul;
    private double harga;
    private int nomorPenerbit;
    private int jumlahPemesanan;
    
    public Buku(String penulis, String judul, double harga, int nomorPenerbit, int jumlahPemesanan) {
        this.penulis = penulis;
        this.judul = judul;
        this.harga = harga;
        this.nomorPenerbit = nomorPenerbit;
        this.jumlahPemesanan = jumlahPemesanan;
    }
    
    public String getPenulis() {
        return penulis;
    }
    
    public String getJudul() {
        return judul;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public int getNomorPenerbit() {
        return nomorPenerbit;
    }
    
    public int getJumlahPemesanan() {
        return jumlahPemesanan;
    }
}
