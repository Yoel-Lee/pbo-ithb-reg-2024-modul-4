import java.util.List;

public class DosenHonorer extends Dosen{
    private double honorPerSks;

    
   
    public DosenHonorer(String nama, String alamat, String ttl, String telepon, String NIK, String departemen,
            List<MatkulAjar> mataKuliahDiajar, int hadir, double honorPerSks) {
        super(nama, alamat, ttl, telepon, NIK, departemen, mataKuliahDiajar, hadir);
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

    @Override 
    public void printGaji(){
       System.out.println("gaji "+ getNama()+ " : "+ getHadir()*honorPerSks); 
    }
}
