package latihan.GajiKaryawan;

import java.util.Scanner;

/*
 * @author Raihan Giffari
 *
 * Nama  : Raihan Giffari
 * Nim   : 10119008
 * Kelas : IF1
 */

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Manager manager1 = new Manager();

        // Masukkan
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK : ");
        manager1.setNik(userInput.nextLine());

        System.out.print("Masukkan Nama : ");
        manager1.setNama(userInput.nextLine());

        System.out.print("Masukkan Golongan (1/2/3) : ");
        manager1.setGolongan(userInput.nextInt());

        System.out.print("Masukkan Jabatan (Manager/Kabag) : " );
        manager1.setJabatan(userInput.next());

        System.out.print("Masukkan Jumlah Kehadiran : ");
        manager1.setKehadiran(userInput.nextInt());

        // Keluaran
        System.out.println("\n====Hasil Perhitungan====");
        System.out.printf("NIK\t\t: %s", manager1.getNik());
        System.out.printf("\nNAMA\t: %s", manager1.getNama());
        System.out.printf("\nGOLONGAN: %d", manager1.getGolongan());
        System.out.printf("\nJABATAN\t: %s", manager1.getJabatan());
        System.out.printf("\n\nTUNJANGAN GOLONGAN\t: %.1f", manager1.tunjanganGolongan(manager1.getGolongan()));
        System.out.printf("\nTUNJANGAN JABATAN\t: %.1f", manager1.tunjanganJabatan(manager1.getJabatan()));
        System.out.printf("\nTUNJANGAN KEHADIRAN\t: %.1f", manager1.tunjanganKehadiran(manager1.getKehadiran()));
        System.out.printf("\n\nGAJI TOTAL\t: %.1f", manager1.gajiTotal());


    }
}