package com.ipk;

public class Mhs {
    private String maha;
    private String nim;
    private double ipk;

    public Mhs(String maha, String nim, double ipk){
        this.maha = maha;
        this.nim = nim;
        this.ipk = ipk;
    }
    //getter inputan for data
    public String getMaha(){
        return maha;
    }
    public String getNim(){
        return nim;
    }
    public double getIpk(){
        return ipk;
    }
    public void setIpk(double ipk){
        this.ipk = ipk;
    }
}
