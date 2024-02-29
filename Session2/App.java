import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        Kotak kotak = new Kotak(20, 20);
        System.out.println("Lebar = " + kotak.getLebar() +"\nTinggi = "+ kotak.getTinggi());
        System.out.println("\nLuas kotak = " + kotak.getLuas());
        System.out.println("Keliling kotak = " + kotak.getPerimeter() +"\n");
        

        Buku buku1 = new Buku("John Doe", "Java Programming", 50.0, 123456, 2);
        Buku buku2 = new Buku("Jane Smith", "Python Basics", 40.0, 789012, 3);
        
        ArrayList<Buku> daftarBuku = new ArrayList<>();
        daftarBuku.add(buku1);
        daftarBuku.add(buku2);
        
        double totalHarga = 0;
        for (Buku buku : daftarBuku) {
            totalHarga += buku.getHarga() * buku.getJumlahPemesanan();
        }

        System.out.println("=================================================\n");
        System.out.println("Harga Satuan :");
        for (Buku buku : daftarBuku) {
            System.out.println("Buku " + buku.getJudul()+ " = $" + buku.getHarga());
            System.out.println("Dipesan sebanyak " + buku.getJumlahPemesanan() + " buah\n");
        }
        System.out.println("Total harga semua buku yang dipesan = $" + totalHarga);
    }
}
 