/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package belanja;

import barang.BelanjaItem;
import java.util.ArrayList;
import java.util.Scanner;

public class DaftarBelanja {
    private static ArrayList<BelanjaItem> listBelanja = new ArrayList<>();

    // Menambahkan item ke daftar belanja
    public void tambahItem(BelanjaItem item) {
        listBelanja.add(item);
        System.out.println("Item berhasil ditambahkan!");
    }

    // Menampilkan semua item
    public void tampilkanDaftar() {
        if (listBelanja.isEmpty()) {
            System.out.println("Daftar belanja kosong.");
        } else {
            System.out.println("Daftar Belanja:");
            for (BelanjaItem item : listBelanja) {
                System.out.println(item.getNama() + " - " + item.getKuantitas() + " x " + item.getHarga() + " = " + item.getTotalHarga());
            }
        }
    }

    // Menghapus item berdasarkan nama
    public void hapusItem(String nama) {
        boolean found = false;
        for (BelanjaItem item : listBelanja) {
            if (item.getNama().equalsIgnoreCase(nama)) {
                listBelanja.remove(item);
                found = true;
                System.out.println("Item berhasil dihapus!");
                break;
            }
        }
        if (!found) {
            System.out.println("Item tidak ditemukan.");
        }
    }

    // Mengupdate item berdasarkan nama
    public void updateItem(String nama) {
        boolean found = false;
        for (BelanjaItem item : listBelanja) {
            if (item.getNama().equalsIgnoreCase(nama)) {
                found = true;
                Scanner scanner = new Scanner(System.in);
                System.out.print("Masukkan kuantitas baru: ");
                int kuantitasBaru = scanner.nextInt();
                System.out.print("Masukkan harga baru: ");
                double hargaBaru = scanner.nextDouble();

                item.setKuantitas(kuantitasBaru);
                item.setHarga(hargaBaru);
                System.out.println("Item berhasil diperbarui!");
                break;
            }
        }
        if (!found) {
            System.out.println("Item tidak ditemukan.");
        }
    }
}
