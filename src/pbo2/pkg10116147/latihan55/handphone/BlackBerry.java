/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116147.latihan55.handphone;

/**
 *
 * @author
 * Nama      : Garry Prang
 * Kelas     : PBO-2
 * NIM       : 10116147
 * Deskripsi : Program untuk menampilkan deskripsi handphone.
 */
public class BlackBerry extends Handphone {
    
    private String pinBB;
    
    public BlackBerry(String man, String os, String model, int harga, String pinBB) {
        super(man, os, model, harga);
        this.pinBB = pinBB;
    }
    
    public String getPinBB() {
        return this.pinBB;   
    }
    
    public void setPinBB(String pinBB) {
        this.pinBB = pinBB;
    }
}
