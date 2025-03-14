import java.util.Scanner;
import java.time.LocalDate;

public class Ibra {
    public static void main(String[] args) {  
        String nama;
        char kelamin;
        int tahunLahir, umur;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        nama = input.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        kelamin = input.next().charAt(0);
        kelamin = Character.toUpperCase(kelamin);

        if (kelamin != 'P' && kelamin != 'L') {
            return; 
        }

        System.out.print("Masukkan tahun lahir: ");
        tahunLahir = input.nextInt();

        int tahunSekarang = LocalDate.now().getYear();
        umur = tahunSekarang - tahunLahir;

        input.close();

        System.out.println("\nData Diri : ");
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + (kelamin == 'L' ? "Laki-laki" : "Perempuan"));
        System.out.println("Umur          : " + umur + " tahun");
    }
}
