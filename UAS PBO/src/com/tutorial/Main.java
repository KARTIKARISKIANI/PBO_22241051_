package com.tutorial;

class Pegawai {
    protected String nama;
    protected double gajiPokok;
    protected double tunjangan;
    protected int durasiLembur;
    public Pegawai(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
        this.tunjangan = 0;
        this.durasiLembur = 0;
    }

    public String getNama() {
        return nama;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public int getDurasiLembur() {
        return durasiLembur;
    }

    public void setDurasiLembur(int durasiLembur) {
        this.durasiLembur = durasiLembur;
    }

    public double gajiBersih() {
        return gajiPokok + tunjangan + (durasiLembur * 0.1 * gajiPokok);
    }

    public void displayInfo() {
        System.out.println("Nama Pegawai: " + nama);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Durasi Lembur: " + durasiLembur);
        System.out.println("Gaji Bersih: " + gajiBersih());
    }
}

class PegawaiTetap extends Pegawai {
    public PegawaiTetap(String nama, double gajiPokok) {
        super(nama, gajiPokok);
    }

    @Override
    public double gajiBersih() {
        return super.gajiBersih() + (0.1 * gajiPokok);
    }
}

class PegawaiTidakTetap extends Pegawai {
    public PegawaiTidakTetap(String nama, double gajiPokok) {
        super(nama, gajiPokok);
    }

    @Override
    public double gajiBersih() {
        return super.gajiBersih();
    }
}

public class Main {
    public static void main(String[] args) {
        Pegawai pegawai1 = new PegawaiTetap("jhon", 5000);
        pegawai1.setTunjangan(0.7 * pegawai1.getGajiPokok());
        pegawai1.setDurasiLembur(5);

        Pegawai pegawai2 = new PegawaiTidakTetap("jane", 4000);
        pegawai2.setDurasiLembur(8);

        pegawai1.displayInfo();
        System.out.println("-----------------------");
        pegawai2.displayInfo();
    }
}