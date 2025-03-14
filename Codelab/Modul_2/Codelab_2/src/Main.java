import java.util.Scanner;

class RekeningBank {
    String nomorRekening, namaPemilik;
    double saldo;
    Scanner objInput = new Scanner(System.in);

    void data1() { // Menampilkan informasi awal rekening
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp" + saldo);
    }

    void data2() { // Menyetor uang
        System.out.print(namaPemilik + " menyetor: Rp");
        double masuk = objInput.nextDouble(); // Input jumlah setoran
        saldo += masuk; // Saldo ditambahkan dengan setoran
        System.out.println(namaPemilik + " menyetor Rp" + masuk + ", saldo sekarang: Rp" + saldo);
    }

    void data3() { // Menarik uang
        System.out.print(namaPemilik + " menarik: Rp");
        double tarik = objInput.nextDouble(); // Input jumlah tarik tunai

        if (saldo >= tarik) { // Cek apakah saldo cukup
            saldo -= tarik; // Kurangi saldo
            System.out.println("(Berhasil) saldo sekarang: Rp" + saldo);
        } else {
            System.out.println("(Gagal, saldo tidak mencukupi) saldo saat ini: Rp" + saldo);
        }
    }

    void data4() { // Menampilkan saldo setelah transaksi
        System.out.println("=== Rekap Transaksi ===");
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp" + saldo);
    }
}

public class Main {
    public static void main(String[] args) {
        RekeningBank orang1 = new RekeningBank();
        orang1.namaPemilik = "Ibrahim";
        orang1.nomorRekening = "202410370110304";
        orang1.saldo = 2000000; // Saldo awal

        RekeningBank orang2 = new RekeningBank();
        orang2.namaPemilik = "Mas Pam";
        orang2.nomorRekening = "202410370110320";
        orang2.saldo = 1000000; // Saldo awal

        orang1.data1(); // Menampilkan data awal
        System.out.println();
        orang2.data1();

        orang1.data2(); // Menyetor uang
        System.out.println();
        orang2.data2();

        orang1.data3(); // Menarik uang
        System.out.println();
        orang2.data3();

        orang1.data4(); // Menampilkan saldo akhir setelah transaksi
        System.out.println();
        orang2.data4();
    }
}
