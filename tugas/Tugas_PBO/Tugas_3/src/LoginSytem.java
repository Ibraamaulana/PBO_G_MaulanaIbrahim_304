import java.util.Scanner;
public class LoginSytem {
    public static void main(String[] args) {

        User user1 = new User("NAMA", "2024");
        Admin admi1 = new Admin("Ibrahim", "304", "Admin304", "Password304");
        Mahasiswa mahasiswa1 = new Mahasiswa("Maulana Ibrahim", "202410370110304");

        int pilihan;
        Scanner masuk = new Scanner(System.in);
        System.out.print("Pilih Login:\n1. Admin\n2. Mahasiswa\n");
        System.out.print("Masukkan Pilihan: ");
        pilihan = masuk.nextInt();
        masuk.nextLine();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan username: ");
                String userAdmin = masuk.nextLine();
                System.out.print("Masukkan password: ");
                String paswordAdmin = masuk.nextLine();
                admi1.login(userAdmin,paswordAdmin);
                break;
            case 2:
                System.out.print("Masukkan nama: ");
                String namaMaha = masuk.nextLine();
                System.out.print("Masukkan NIM: ");
                String nimMaha= masuk.nextLine();
                mahasiswa1.login(namaMaha,nimMaha );
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
        masuk.close();
    }
}

