import java.util.List;

public class DosenHonorer extends Dosen{
    private double honorPerSks;

    
    public DosenHonorer(String nama, String alamat, String ttl, String telepon, String NIK, String departemen,
    List<String> mataKuliahDiajar, double honorPerSks) {
        super(nama, alamat, ttl, telepon, NIK, departemen, mataKuliahDiajar);
        this.honorPerSks = honorPerSks;
    }
    
    public double getHonorPerSks() {
        return honorPerSks;
    }

    public void setHonorPerSks(double honorPerSks) {
        this.honorPerSks = honorPerSks;
    }

    @Override
    public void login() {
        System.out.println("Dosen Honorer logged , NIK: " + getNIK());
    }
}
