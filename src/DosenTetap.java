import java.util.List;

public class DosenTetap extends Dosen {
    private double salary;

    public DosenTetap(String nama, String alamat, String ttl, String telepon, String NIK, String departemen,
            List<String> mataKuliahDiajar, double salary) {
        super(nama, alamat, ttl, telepon, NIK, departemen, mataKuliahDiajar);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void login() {
        System.out.println("Dosen Tetap logged , NIK: " + getNIK());
    }

}