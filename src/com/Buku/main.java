package com.Buku;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukan judul buku : ");
        String judul = scanner.nextLine();

        System.out.println("masukan penulis buku : ");
        String penulis = scanner.nextLine();

        System.out.println("masukan penulis ISBN : ");
        String isbn = scanner.nextLine();

        Buku buku = new Buku(judul, penulis, isbn);

        boolean selesai = false;
        while (!selesai){
            System.out.println("\nPilih tindakan");
            System.out.println("1. Pinjam Buku");
            System.out.println("2. Kembalikan Buku");
            System.out.println("3. Lihat Informasi Buku");
            System.out.println("4. Keluar");
            System.out.println("Masukan Pilihan anda : ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    buku.pinjamBuku();
                    break;
                case 2:
                    buku.kembalikanBuku();
                    break;
                case 3:
                    System.out.println("Judul "+buku.getJudul());
                    System.out.println("Penulis "+buku.getPenulis());
                    System.out.println("ISBN "+buku.getIsbn());
                    System.out.println("Tersedia "+buku.isTersedia());
                    break;
                case 4:
                    selesai = true;
                    break;
                default:
                    System.out.println("pilihan tidak valid");
                    break;
            }
        }
        scanner.close();
    }
}
