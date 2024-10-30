import java.util.List;

public class Karyawan extends Staff {
    private double salary;
    private List<String> presensiStaff;

    // Constructor
    public Karyawan(String nama, String alamat, String ttl, String telepon, String NIK, double salary, List<String> presensiStaff) {
        super(nama, alamat, ttl, telepon, NIK);
        this.salary = salary;
        this.presensiStaff = presensiStaff;
    }

    // Getter dan Setter
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<String> getPresensiStaff() {
        return presensiStaff;
    }

    public void setPresensiStaff(List<String> presensiStaff) {
        this.presensiStaff = presensiStaff;
    }

    @Override
    public void login() {
        System.out.println("Karyawan logged in , NIK: " + getNIK());
    }
}
