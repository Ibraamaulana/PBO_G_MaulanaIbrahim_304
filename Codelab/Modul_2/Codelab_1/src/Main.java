// Mendefinisikan class Hewan
class Hewan {
    // Atribut (data) yang dimiliki oleh Hewan
    String Nama;  // Nama hewan
    String Jenis; // Jenis hewan
    String Suara; // Suara yang dihasilkan oleh hewan

    // Method untuk menampilkan informasi hewan
    void Data1() {
        System.out.println("Nama: " + Nama);  // Menampilkan Nama
        System.out.println("Jenis: " + Jenis); // Menampilkan Jenis
        System.out.println("Suara: " + Suara); // Menampilkan Suara
    }
}

// Class utama untuk menjalankan program
public class Main {
    public static void main(String[] args) { // Method main() sebagai titik awal eksekusi program

        // Membuat objek pertama dari class Hewan
        Hewan hewan1 = new Hewan(); // Instansiasi objek hewan1 dari class Hewan
        hewan1.Nama = "Kucing";     // Mengisi atribut Nama dengan "Kucing"
        hewan1.Jenis = "Mamalia";   // Mengisi atribut Jenis dengan "Mamalia"
        hewan1.Suara = "Nyan~~";    // Mengisi atribut Suara dengan "Nyan~~"

        // Membuat objek kedua dari class Hewan
        Hewan hewan2 = new Hewan(); // Instansiasi objek hewan2 dari class Hewan
        hewan2.Nama = "Anjing";     // Mengisi atribut Nama dengan "Anjing"
        hewan2.Jenis = "Mamalia";   // Mengisi atribut Jenis dengan "Mamalia"
        hewan2.Suara = "Woof-woff!!"; // Mengisi atribut Suara dengan "Woof-woff!!"

        // Memanggil method Data1() untuk menampilkan data hewan1
        hewan1.Data1(); // Menampilkan informasi Kucing

        System.out.println(); // Menambahkan baris kosong sebagai pemisah output

        // Memanggil method Data1() untuk menampilkan data hewan2
        hewan2.Data1(); // Menampilkan informasi Anjing
    }
}
 