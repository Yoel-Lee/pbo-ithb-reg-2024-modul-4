import java.util.List;

 public class Dosen extends Staff {
    private String departemen;
    private List<MatkulAjar> mataKuliahDiajar;

    
  



    public Dosen(String nama, String alamat, String ttl, String telepon, String NIK, String departemen,
            List<MatkulAjar> mataKuliahDiajar) {
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






    public List<MatkulAjar> getMataKuliahDiajar() {
        return mataKuliahDiajar;
    }






    public void setMataKuliahDiajar(List<MatkulAjar> mataKuliahDiajar) {
        this.mataKuliahDiajar = mataKuliahDiajar;
    }






    @Override
   public void print(){
    System.out.println("Departemen : "+departemen);
    for (MatkulAjar matkulAjarPrint : mataKuliahDiajar) {
        System.out.println("kode : "+ matkulAjarPrint.getMatkul().getKode());
        System.out.println("nama : "+matkulAjarPrint.getMatkul().getNama());
        System.out.println("sks : " +matkulAjarPrint.getMatkul().getSKS());
        System.out.println("= = = PRESENSI = = =");
       for ( PresensiStaff presensi: matkulAjarPrint.getPresensiStaffList()) {
            System.out.println("Tanggal : "+presensi.getTanggal());
            System.out.println("Status : "+presensi.getStatus());
            System.out.println("Jam : "+presensi.getJam());
       }
    }
   }

}
