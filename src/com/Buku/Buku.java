package com.Buku;

    public class Buku {
        private String judul;
        private String penulis;
        private String isbn;
        private boolean tersedia;
    
        //construct
        public Buku(String judul, String penulis, String isbn) {
            this.judul = judul;
            this.penulis = penulis;
            this.isbn = isbn;
            this.tersedia = true;
        }
        //getter for judul
        public String getJudul(){
            return judul;
        }
        //setter for judul
        public void setJudul(String judul){
            this.judul = judul;
        }
        //getter for penulis
        public String getPenulis(){
            return penulis;
        }
        //setter for penulis
        public void setPenulis(String penulis){
            this.penulis = penulis;
        }
        //getter for isbn
        public String getIsbn(){
            return isbn;
        }
        //setter for isbn
        public void setIsbn(String isbn){
            this.isbn = isbn;
        }
        public boolean isTersedia(){
            return tersedia;
        }
        //method pinjam buku
        public void pinjamBuku(){
            if(tersedia){
                tersedia = false;
                System.out.println("Buku '"+judul+"' berhasil dipinjam");
            }else{
                System.out.println("Buku '"+judul+"' tidak tersedia");
            }
        }
        //method kembalikan buku
        public void kembalikanBuku(){
            tersedia = true;
            System.out.println("Buku '"+judul+"' berhasil dikembalikan");
        }
    }
