import java.util.List;

 public class Dosen extends Staff {
    private String departemen;
    private List<String> mataKuliahDiajar;

    
  



    public Dosen(String nama, String alamat, String ttl, String telepon, String NIK, String departemen,
            List<String> mataKuliahDiajar) {
        super(nama, alamat, ttl, telepon, NIK);
        this.departemen = departemen;
        this.mataKuliahDiajar = mataKuliahDiajar;
    }






    public String getDepartemen() {
        return departemen;
    }






    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }






    public List<String> getMataKuliahDiajar() {
        return mataKuliahDiajar;
    }






    public void setMataKuliahDiajar(List<String> mataKuliahDiajar) {
        this.mataKuliahDiajar = mataKuliahDiajar;
    }






    @Override
    public void login() {
        System.out.println("Dosen logged in with NIK: " + getNIK());
    }

}
