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
public class Android extends Handphone {
    
    private String keyStore;
    
    public Android(String man, String os, String model, int harga, String keyStore) {
        super(man, os, model, harga);
        this.keyStore = keyStore;
    }
    
    public String getKeyStore() {
        return this.keyStore;
    }
    
    public void setKeyStore(String keyStore) {
        this.keyStore = keyStore;
    }
}