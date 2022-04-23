import Model.Perhitungan;

public class JalankanPerhitungan {
    public static void main(String[] args) {
        Perhitungan v = new Perhitungan(7, 6, 13);
        v.PrintJudul();
        int hasilTambah = v.HitungTambah(6,13);
        System.out.println("Hasil Tambah = "+hasilTambah);
        int hasilPerkalian = v.HitungKali(6,13);
        System.out.println("Hasil Perkalian =  "+hasilPerkalian);
    }
}