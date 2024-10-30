import java.util.List;

public class MatkulAmbil {
    private MataKuliah matkul;
    private List<Presensi> presensiList;
    private double n1;  
    private double n2;  
    private double n3;
    
    
    public MatkulAmbil(MataKuliah matkul, List<Presensi> presensiList, double n1, double n2, double n3) {
        this.matkul = matkul;
        this.presensiList = presensiList;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }  
        
            
            public MataKuliah getMatkul() {
                return matkul;
            }
        
        
            public void setMatkul(MataKuliah matkul) {
                this.matkul = matkul;
            }
        
        
            public List<Presensi> getPresensiList() {
                return presensiList;
            }
        
        
            public void setPresensiList(List<Presensi> presensiList) {
                this.presensiList = presensiList;
            }
        
        
            public double getN1() {
                return n1;
            }
        
        
            public void setN1(double n1) {
                this.n1 = n1;
            }
        
        
            public double getN2() {
                return n2;
            }
        
        
            public void setN2(double n2) {
                this.n2 = n2;
            }
        
        
            public double getN3() {
                return n3;
            }
        
        
            public void setN3(double n3) {
                this.n3 = n3;
            }

            public double hitungNilaiAkhir() {
                return (n1 + n2 + n3) / 3;  
            }
        
            
            public void printInfo() {
                System.out.println("Mata Kuliah: " + matkul.getNama());
                System.out.println("Nilai 1: " + n1 + ", Nilai 2: " + n2 + ", Nilai 3: " + n3);
                System.out.println("Nilai Akhir: " + hitungNilaiAkhir());
            }




}

