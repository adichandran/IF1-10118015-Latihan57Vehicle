/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan57vehicle;

/**
 *
 * @author 
 * NAMA                 : Adi Chandra Nugraha
 * KELAS                : IF-1
 * NIM                  : 10118015
 * Deskripsi Program    : Program ini berisi tentang vehicle berupa bicycle dan
 *                        skateboard.
 */
public class IF110118015Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.setBrand("Trek Bike");
        bicycle.setModel("7.4FX");
        bicycle.setGearCount(23);
        System.out.println("Brand : "+bicycle.getBrand());
        System.out.println("Model : "+bicycle.getModel());
        System.out.println("Jumlah Gear : "+bicycle.getGearCount()+"\n");
        
        Skateboard sk = new Skateboard();
        sk.setBrand("Ally Skate");
        sk.setModel("Rocket");
        sk.setMyBoardLength(54.5);
        System.out.println("Brand : "+sk.getBrand());
        System.out.println("Model : "+sk.getModel());
        System.out.println("Panjang Board : "+sk.getMyBoardLength());
    }
    
}
