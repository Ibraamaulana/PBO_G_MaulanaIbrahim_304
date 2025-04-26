// Kelas utama untuk karakter dalam game
class KarakterGame {
    private String nama;
    private int kesehatan;

    // Konstruktor untuk inisialisasi karakter
    public KarakterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    // Setter dan getter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }

    // Setter dan getter untuk kesehatan
    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }
    public int getKesehatan() {
        return kesehatan;
    }

    // Metode untuk menyerang (default untuk karakter umum)
    public void serang() {
        System.out.println(nama + " menyerang menggunakan pedang!");
    }
}

// Kelas Pahlawan yang mewarisi KarakterGame
class Pahlawan extends KarakterGame {
    public Pahlawan(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    // Override metode serang untuk pahlawan
    @Override
    public void serang() {
        System.out.println("🔥 " + getNama() + " menyerang viper menggunakan Orbital Strike! 🔥");

        // Mengatur kesehatan ke 200 sebelum dikurangi
        setKesehatan(200);
        int hasil = getKesehatan() - 20;
        setKesehatan(hasil);

        // Mengubah nama karakter
        setNama("Viper");

        System.out.println("💀 " + getNama() + " sekarang memiliki kesehatan " + getKesehatan() + "! 💀");
    }
}

// Kelas Musuh yang juga mewarisi KarakterGame
class Musuh extends KarakterGame {
    public Musuh(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    // Override metode serang untuk musuh
    @Override
    public void serang() {
        System.out.println("☠️ " + getNama() + " menyerang Brimstone menggunakan Snake Bite! ☠️");

        // Mengatur kesehatan ke 150 sebelum dikurangi
        setKesehatan(150);
        int hasil = getKesehatan() - 15;
        setKesehatan(hasil);

        // Mengubah nama karakter
        setNama("Brimstone");

        System.out.println("⚡ " + getNama() + " sekarang memiliki kesehatan " + getKesehatan() + "! ⚡");
    }
}

// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat karakter-karakter dalam game
        KarakterGame karakter0 = new KarakterGame("Karakter umum", 100);
        Pahlawan karakter1 = new Pahlawan("Brimstone", 150);
        Musuh karakter2 = new Musuh("Viper", 200);

        // Menampilkan status awal karakter
        System.out.println("🌟 Status Awal Pertempuran! 🌟");
        System.out.println("⚔️ " + karakter1.getNama() + " memiliki kesehatan: " + karakter1.getKesehatan());
        System.out.println("🕷️ " + karakter2.getNama() + " memiliki kesehatan: " + karakter2.getKesehatan());

        // Memulai pertempuran
        System.out.println("🔥🔥🔥 Pertempuran Dimulai! 🔥🔥🔥");
        karakter1.serang();
        karakter2.serang();
    }
}
