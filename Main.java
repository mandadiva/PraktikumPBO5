/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Avanza", 195, 4, 4);
        SepedaMotor sepedaMotor = new SepedaMotor("Honda", 150, 2, "2-tak");
        
        mobil.tampilkanInfo();
        System.out.println();
        sepedaMotor.tampilkanInfo();
    }    
}
