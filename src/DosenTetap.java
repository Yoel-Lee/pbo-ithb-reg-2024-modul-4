import java.util.List;

public class DosenTetap extends Dosen {
    private double salary;
    
    public DosenTetap(String nama, String alamat, String ttl, String telepon, String NIK, String departemen,
            List<MatkulAjar> mataKuliahDiajar, int hadir, double salary) {
        super(nama, alamat, ttl, telepon, NIK, departemen, mataKuliahDiajar, hadir);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void printGaji(){
        double gaji= salary+(getHadir()*25000);
        System.out.println("gaji " +getNama()+ " : "+gaji);
    }


}