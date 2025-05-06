/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utsoopj;

import java.util.Scanner;

/**
 *
 * @author LAB F
 * TGL 06/05/2025
 */
public class UTSOOPJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }
       public class Notemanager{
    private String[] notes = new String[100]; // Array untuk menyimpan catatan
    private int count = 0; // Jumlah catatan yang telah disimpan

    // Menambahkan catatan baru
    public void addNote(String note) {
        if (count < notes.length) {
            notes[count] = note;
            count++;
            System.out.println("Catatan berhasil ditambahkan!");
        } else {
            System.out.println("Kapasitas catatan penuh!");
        }
    }

    // Menampilkan semua catatan
    public void showNotes() {
        if (count == 0) {
            System.out.println("Belum ada catatan.");
        } else {
            System.out.println("Daftar Catatan:");
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + notes[i]);
            }
        }
    }
}

    }
    
        


public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NoteManager manager = new NoteManager();

        int choice;
        do {
            System.out.println("\n=== MENU APLIKASI CATATAN ===");
            System.out.println("1. Tambah Catatan");
            System.out.println("2. Tampilkan Catatan");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // membersihkan newline di buffer

            switch (choice) {
                case 1:
                    System.out.print("Masukkan catatan: ");
                    String note = scanner.nextLine();
                    manager.addNote(note);
                    break;
                case 2:
                    manager.showNotes();
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan aplikasi.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (choice != 3);

        scanner.close();
    }
}
public class NoteManager {
    private String[] notes = new String[100];
    private int count = 0;

    public void addNote(String note) {
        if (count < notes.length) {
            notes[count++] = note;
            System.out.println("Catatan berhasil ditambahkan!");
        } else {
            System.out.println("Penyimpanan catatan penuh.");
        }
    }

    public void showNotes() {
        if (count == 0) {
            System.out.println("Belum ada catatan.");
        } else {
            System.out.println("Daftar Catatan:");
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + notes[i]);
            }
        }
    }

 public class Note {
    private String[] notes = new String[100];
    private int count = 0;

    public void addNote(String note) {
        if (count < notes.length) {
            notes[count++] = note;
            System.out.println("Catatan berhasil ditambahkan!");
        } else {
            System.out.println("Penyimpanan catatan penuh.");
        }
    }

    public void showNotes() {
        if (count == 0) {
            System.out.println("Belum ada catatan.");
        } else {
            System.out.println("Daftar Catatan:");
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + notes[i]);
            }
        }
    }
}
}

