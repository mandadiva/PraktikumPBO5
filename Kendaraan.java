/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author user
 */
// Kelas Induk
class Kendaraan {
    String nama;
    int kecepatan;
    
    public Kendaraan(String nama, int kecepatan) {
        this.nama = nama;
        this.kecepatan = kecepatan;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Kecepatan: " + kecepatan + "km/jam");
    } 
}

// Kelas Menengah Kendaraandarat
class KendaraanDarat extends Kendaraan {
    int jumlahRoda;
    
    public KendaraanDarat(String nama, int kecepatan, int jumlahRoda) {
        super(nama, kecepatan);
        this.jumlahRoda = jumlahRoda;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Roda: " + jumlahRoda);
    }
}

// Kelas Turunan Mobil
class Mobil extends KendaraanDarat {
    int jumlahPintu;
    
    public Mobil(String nama, int kecepatan, int jumlahRoda, int jumlahPintu) {
        super(nama, kecepatan, jumlahRoda);
        this.jumlahPintu = jumlahPintu;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}

// Kelas Turunan SepedaMotor
class SepedaMotor extends KendaraanDarat {
    String jenisMesin;
    
    public SepedaMotor(String nama, int kecepatan, int jumlahRoda, String jenisMesin) {
        super(nama, kecepatan, jumlahRoda);
        this.jenisMesin = jenisMesin;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}