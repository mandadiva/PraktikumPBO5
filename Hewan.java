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
class Hewan {
    String nama;
    String jenis;
    
    public Hewan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama Hewan: " + nama);
        System.out.println("Jenis: " + jenis);
    } 
    public void suara() {
        System.out.println("Hewan ini belum memiliki suara yang spesifik");
    } 
} 

// Kelas Turunan Kucing
class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama, "Kucing");
    }
    
    @Override
    public void suara() {
        System.out.println("Kucing menggarong: Maowwwww!");
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        suara();
    }
}

// Kelas Turunan Anjing
class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama, "Anjing");
    }
    
    @Override
    public void suara() {
        System.out.println("Anjing menggonggong: woofff!");
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        suara();
    }
}
