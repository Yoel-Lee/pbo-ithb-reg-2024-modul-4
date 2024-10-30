import java.util.List;

public class MatkulAjar {
    private MataKuliah matkul;
    private List<PresensiStaff> presensiStaffList;

    
    public MatkulAjar(MataKuliah matkul, List<PresensiStaff> presensiStaffList) {
        this.matkul = matkul;
        this.presensiStaffList = presensiStaffList;
    }

    
    public MataKuliah getMatkul() {
        return matkul;
    }

    public void setMatkul(MataKuliah matkul) {
        this.matkul = matkul;
    }

    public List<PresensiStaff> getPresensiStaffList() {
        return presensiStaffList;
    }

    public void setPresensiStaffList(List<PresensiStaff> presensiStaffList) {
        this.presensiStaffList = presensiStaffList;
    }

    
    public void printInfo() {
        System.out.println("Mata Kuliah yang Diajar: " + matkul.getNama());
        System.out.println("Presensi Dosen: ");
        for (PresensiStaff presensi : presensiStaffList) {
            System.out.println("Tanggal: " + presensi.getTanggal() + ", Status: " + presensi.getStatusString());
        }
    }
}
