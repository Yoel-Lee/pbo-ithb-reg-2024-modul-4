import java.util.List;

public class MahasiswaMagister extends Mahasiswa {
    private List<String> mataKuliah;
    private String judulTesis;
    private double nilai1;
    private double nilai2;
    private double nilai3;

    public MahasiswaMagister(String nama, String alamat, String ttl, String telepon, String NIM, String jurusan,String presensi,
            List<String> mataKuliah, String judulTesis, double nilai1, double nilai2, double nilai3) {
        super(nama, alamat, ttl, telepon, NIM, jurusan,presensi);
        this.mataKuliah = mataKuliah;
        this.judulTesis = judulTesis;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
    }

    public List<String> getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(List<String> mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public String getJudulTesis() {
        return judulTesis;
    }

    public void setJudulTesis(String judulTesis) {
        this.judulTesis = judulTesis;
    }

    public double getNilai1() {
        return nilai1;
    }

    public void setNilai1(double nilai1) {
        this.nilai1 = nilai1;
    }

    public double getNilai2() {
        return nilai2;
    }

    public void setNilai2(double nilai2) {
        this.nilai2 = nilai2;
    }

    public double getNilai3() {
        return nilai3;
    }

    public void setNilai3(double nilai3) {
        this.nilai3 = nilai3;
    }
@Override
    public double getNilaiAverage() {
        return (nilai1 + nilai2 + nilai3) / 3;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Mata Kuliah yang Diambil: ");
        for (String MK : mataKuliah) {
            System.out.println("- "+MK + " ");
        }
        System.out.println("Judul Tesis: " + judulTesis);
        System.out.println("Nilai 1: " + nilai1);
        System.out.println("Nilai 2: " + nilai2);
        System.out.println("Nilai 3: " + nilai3);
        System.out.println("Rata-Rata Nilai: " + getNilaiAverage());
    }
    public void printMatkul(){
        for (String MK : mataKuliah) {
            System.out.println("- "+MK + " ");
        }
    }

}
