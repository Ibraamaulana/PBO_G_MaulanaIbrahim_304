import java.util.Scanner;
class Admin {
     String username, pasword;
     void login() {
         if (username.equals("Admin304")) {
             if (pasword.equals("Password304")) {
                 System.out.println("Login Admin Berhasil");
             }
         }else{
             System.out.println("Login gagal! username atau password salah");
         }
     }
 }
 class Mahasiswa {
    String nama, nim;

    void login(){
        if (nama.equals("Maulana Ibrahim")) {
            if (nim.equals("202410370110304")) {
                displayinfo();
            }
        }else{
            System.out.println("Login gagal! Nama atau NIM salah");
        }
    }
    void displayinfo(){
        System.out.println("Login Admin Berhasil!!");
        System.out.println("Nama: "+ nama);
        System.out.println("NIM: "+ nim);
    }
 }

 public class LoginSystem {
     public static void main(String[] args) {
         int pilihan;

         Scanner masuk = new Scanner(System.in);
         System.out.print("Pilih Login:\n1. Admin\n2. Mahasiswa\n");
         System.out.print("Masukkan Pilihan: ");
         pilihan = masuk.nextInt();
         masuk.nextLine();

         switch (pilihan) {
             case 1:
                 Admin admin = new Admin();
                 System.out.print("Masukkan username: ");
                 admin.username = masuk.nextLine();
                 System.out.print("Masukkan password: ");
                 admin.pasword = masuk.nextLine();
                 admin.login();
                 break;
             case 2:
                 Mahasiswa mahasiswa = new Mahasiswa();
                 System.out.print("Masukkan nama: ");
                 mahasiswa.nama = masuk.nextLine();
                 System.out.print("Masukkan NIM: ");
                 mahasiswa.nim = masuk.nextLine();
                 mahasiswa.login();
                 break;
             default:
                 System.out.println("Pilihan tidak valid!");
         }
         masuk.close();
     }
 }


