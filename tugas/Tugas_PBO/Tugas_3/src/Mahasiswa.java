public class Mahasiswa extends User{
    public Mahasiswa (String nama, String nim){
        super(nama, nim);
    }

    @Override
    public void login(String nama, String nim){
        if (nama.equals(getNama())) {
            if (nim.equals(getNim())) {
                displayinfo();
            }
        }else{
            System.out.println("Login gagal! Nama atau NIM salah");
        }
    }
    @Override
   public void displayinfo(){
        System.out.println("Login Admin Berhasil!!");
        System.out.println("Nama: "+ getNama());
        System.out.println("NIM: "+ getNama());
    }

}




