package com.ling;

public class main {
    public static void main(String[] args) {
        //buat object lingkaran
        Lingkaran lingkaran = new Lingkaran(5.0);
        
        //akses radius with getter
        System.out.println("Radius Lingkaran : "+lingkaran.getRadius());
        //hitung luas
        System.out.println("Luas lingkaran : "+lingkaran.hitungLuas());
        //hitung keliling
        System.out.println("Keliling lingkaran : "+lingkaran.hitungKeliling());
        //mengubah nilai radius
        lingkaran.setRadius(7.5);
        System.out.println("radius Setelah diubah : "+lingkaran.getRadius());
    }
}
