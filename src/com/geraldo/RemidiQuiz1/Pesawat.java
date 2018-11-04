package com.geraldo.RemidiQuiz1;

public class Pesawat {
    private String jenis;
    private int jumlahPenumpang;
    
    public void airLineInfo() {
        System.out.println("Jenis Pesawat = " + jenis + " | Jumlah Penumpang = " + jumlahPenumpang);
    }
    
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setJumlahPenumpang(int jumlahPenumpang) {
        this.jumlahPenumpang = jumlahPenumpang;
    }
}
