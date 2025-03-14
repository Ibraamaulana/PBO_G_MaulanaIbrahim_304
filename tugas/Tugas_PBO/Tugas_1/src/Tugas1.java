import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        int pilihan;
        String admin,nama,pasword,nim;

        Scanner masuk = new Scanner(System.in);
        Scanner kesatu = new Scanner(System.in);
        Scanner kedua = new Scanner(System.in);

        System.out.print("Pilih Login:\n1. Admin\n2. Mahasiswa\n");
        System.out.print("Masukkan Pilihan: ");
        pilihan = masuk.nextInt();

        switch(pilihan){
            case 1:
                System.out.print("Masukkan username: ");
                admin = kesatu.nextLine();
                System.out.print("Masukkan password: ");
                pasword = kesatu.nextLine();

                if (admin.equals("Admin304")) {
                    if (pasword.equals("Password304")) {
                        System.out.println("Login Admin Berhasil");
                    }
                }else{
                    System.out.println("Login gagal! username atau password salah");
                }
                break;
            case 2:
                System.out.print("Masukkan Nama: ");
                nama = kedua.nextLine();
                System.out.print("Masukkan NIM: ");
                nim = kedua.nextLine();

                if (nama.equals("Maulana Ibrahim")) {
                    if (nim.equals("202410370110304")) {
                        System.out.println("Login Admin Berhasil!!");
                        System.out.println("Nama: "+ nama);
                        System.out.println("NIM: "+ nim);
                    }
                }else{
                    System.out.println("Login gagal! Nama atau NIM salah");
                }
                break;
            default:
        }
    }
}
