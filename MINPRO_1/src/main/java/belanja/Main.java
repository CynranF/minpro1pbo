/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belanja;

import barang.BelanjaItem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DaftarBelanja daftar = new DaftarBelanja();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Sistem Pengelolaan Daftar Belanja ===");
            System.out.println("1. Tambah Item");
            System.out.println("2. Tampilkan Daftar Belanja");
            System.out.println("3. Hapus Item");
            System.out.println("4. Update Item");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Item: ");
                    String nama = scanner.nextLine();
                    System.out.print("Kuantitas: ");
                    int kuantitas = scanner.nextInt();
                    System.out.print("Harga: ");
                    double harga = scanner.nextDouble();
                    BelanjaItem item = new BelanjaItem(nama, kuantitas, harga);
                    daftar.tambahItem(item);
                    break;
                case 2:
                    daftar.tampilkanDaftar();
                    break;
                case 3:
                    System.out.print("Nama item yang akan dihapus: ");
                    String namaHapus = scanner.nextLine();
                    daftar.hapusItem(namaHapus);
                    break;
                case 4:
                    System.out.print("Nama item yang akan diupdate: ");
                    String namaUpdate = scanner.nextLine();
                    daftar.updateItem(namaUpdate);
                    break;
                case 5:
                    System.out.println("Keluar dari program...");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
