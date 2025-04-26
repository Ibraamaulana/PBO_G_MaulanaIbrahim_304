public class Admin extends User {
    private String usernama, password;
    public Admin(String nama, String nim, String usernama, String password) {
        super(nama, nim);
        this.usernama = usernama;
        this.password = password;
    }

    public void setUsernama(String usernama) {
        this.usernama = usernama;
    }
    public String getUsernama() {
        return usernama;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword() {
        return password;
    }

    @Override
    public void login(String user, String password) {
        if (user.equals(getUsernama())) {
            if (password.equals(getPassword())) {
                displayinfo();
            }
        } else {
            System.out.println("Login gagal! username atau password salah");
        }
    }

    @Override
    public void displayinfo() {
        System.out.println("Login Admin Berhasil");
    }

}