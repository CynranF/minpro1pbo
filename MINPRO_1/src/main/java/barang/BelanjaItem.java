/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barang;

/**
 *
 * @author Farhan
 */
public class BelanjaItem {
    private String nama;
    private int kuantitas;
    private double harga;

    // Constructor
    public BelanjaItem(String nama, int kuantitas, double harga) {
        this.nama = nama;
        this.kuantitas = kuantitas;
        this.harga = harga;
    }

    // Getters dan Setters
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKuantitas() {
        return kuantitas;
    }

    public void setKuantitas(int kuantitas) {
        this.kuantitas = kuantitas;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Method untuk menghitung total harga item
    public double getTotalHarga() {
        return this.harga * this.kuantitas;
    }
}
