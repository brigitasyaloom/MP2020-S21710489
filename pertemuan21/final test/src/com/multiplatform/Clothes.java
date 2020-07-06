package com.multiplatform;

public class Clothes {
    private String warna;
    private String jenis;
    private String ukuran;

    public Clothes(String warna, String jenis, String ukuran) {
        this.warna = warna;
        this.jenis = jenis;
        this.ukuran = ukuran;
    }

    public String getWarna() {
        return warna;
    }

    public String getJenis() {
        return jenis;
    }

    public String getUkuran() {
        return ukuran;
    }
}
