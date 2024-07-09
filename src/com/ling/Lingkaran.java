package com.ling;

public class Lingkaran {
    //variable instance private
    private double radius;
    private final  double PI=3.14;

    //construct untuk inisialisasi radius
    public Lingkaran(double radius){
        this.radius=radius;
    }

    //method untuk mengambil nilai radius
    public double getRadius(){
        return radius; 
    }

    //method untuk menghitung Luas Lingkaran
    public double hitungLuas(){
        return PI*radius*radius;
    }

    //method untuk menghitung Keliling Lingkaran
    public double hitungKeliling(){
        return 2*PI*radius;
    }

    //untuk mrngubah nilai radius dengan validasi
    public void setRadius(double radius){
        if(radius>0){
            this.radius=radius;
        }else{
            System.out.println("radius harus lebih dari 0.");
        }
    }
}