package com.ipk;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan Nama Mahasiswa :");
        String maha = scanner.nextLine();

        System.out.println("Masukan NIM Mahasiswa :");
        String nim = scanner.nextLine();

        System.out.println("Masukan IPK Mahasiswa :");
        double ipk = scanner.nextDouble();

        Mhs mhs = new Mhs(maha, nim, ipk);

        boolean selesai = false;
        while (!selesai) {
            System.out.println("\nPilih Tindakan");
            System.out.println("1. Perbarui IPK");
            System.out.println("2. Lihat Informasi Mahasiswa");
            System.out.println("3. Keluar");
            System.out.println("Pilihan anda :");
            int pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Masukan IPK baru :");
                    double ipkBARU = scanner.nextDouble();
                    mhs.setIpk(ipkBARU);
                    break;
                case 2:
                    System.out.println("Nama: " + mhs.getMaha());
                    System.out.println("NIM: " + mhs.getNim());
                    System.out.println("IPK: " + mhs.getIpk());
                    break;
                case 3:
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
