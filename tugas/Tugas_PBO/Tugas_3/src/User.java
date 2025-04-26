class User{
    private String nama, nim;

    public User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }

    public void setNim(String nim){
        this.nim = nim;
    }
    public String getNim() {
        return nim;
    }

    public void login(String nama, String nim) {
        if (nama.equals("Admin304")) {
            if (nim.equals("Password304")) {
                System.out.println("Login Admin Berhasil");
            }
        }else{
            System.out.println("Login gagal! username atau password salah");
        }
    }

    public void displayinfo() {
        System.out.println("Login Admin Berhasil!!");
        System.out.println("Nama: "+ nama);
        System.out.println("NIM: "+ nim);
    }
}


