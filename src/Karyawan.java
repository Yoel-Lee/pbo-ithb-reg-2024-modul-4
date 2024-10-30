import java.util.List;

public class Karyawan extends Staff {
    private double salary;
    private List<Presensi> presensiStaff;

    public Karyawan(String nama, String alamat, String ttl, String telepon, String NIK, double salary,
            List<Presensi> presensiStaff) {
        super(nama, alamat, ttl, telepon, NIK);
        this.salary = salary;
        this.presensiStaff = presensiStaff;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public List<Presensi> getPresensiStaff() {
        return presensiStaff;
    }
    public void setPresensiStaff(List<Presensi> presensiStaff) {
        this.presensiStaff = presensiStaff;
    }

    @Override 
    public void printGaji(){
        int jumlahHadir=0;
        for (Presensi presensi : presensiStaff) {
            if (presensi.getStatus()==Status.HADIR){
                jumlahHadir++;
            }
        }
        double gaji = ((double) jumlahHadir / 22) * salary;
        System.out.println("gaji "+this.getNama()+" : "+(int) gaji);
    }
}
