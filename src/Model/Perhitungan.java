package Model;

import Interface.ContohInterface;

public class Perhitungan implements ContohInterface {
    private int hasil;
    private int a;
    private int b;

    public Perhitungan(int _a, int _b, int _hasil){
        this.a = _a;
        this.b = _b;
        _hasil = 0;
        this.hasil = _hasil;
        printJudulClass("Print judul dalam Class Peri ");
    }

    private void printJudulClass(String jdl)
    {
        System.out.println(jdl);

    }

    @Override
    public void PrintJudul() {
        System.out.println("Judul dalam Interface");

    }

    @Override
    public void HitungTambah() {
        this.hasil = this.a + this.b;

    }

    @Override
    public void HitungKali() {
        this.hasil = this.a * this.b;

    }

    public int HitungTambah(int a1, int b1){
        this.a = a1;
        this.b = b1;
        HitungTambah();
        return this.hasil;
    }

    public int HitungKali(int a2, int b2){
        this.a = a2;
        this.b = b2;
        HitungKali();
        return this.hasil;
    }
}
