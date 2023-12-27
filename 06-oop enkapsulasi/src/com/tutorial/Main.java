package com.tutorial;
class Pegawai {
    private String nama;
    private String jabatan;
    private double pajak;
    private double gajiPokok;
    private double gajiBersih;

    public Pegawai(String nama, String jabatan, double gajiPokok) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.pajak = 0.1;
        this.gajiPokok = gajiPokok;
        hitungGajiBersih();
    }

    public double getGajiBersih() {
        return gajiBersih;
    }

    private void setGajiBersih(double gajiBersih) {
        this.gajiBersih = gajiBersih;
    }

    private void hitungGajiBersih() {
        setGajiBersih(gajiPokok - (gajiPokok * pajak));
    }

    public static void main(String[] args) {
        double gajiPokok = 3500000;
        Pegawai pegawai1 = new Pegawai("Adam", "Dosen", gajiPokok);

        System.out.println("Nama: " + pegawai1.nama);
        System.out.println("Jabatan: " + pegawai1.jabatan);
        System.out.println("Gaji Pokok: " + pegawai1.gajiPokok);
        System.out.println("Pajak: " + pegawai1.pajak);
        System.out.println("Gaji Bersih: " + pegawai1.getGajiBersih());
    }
}