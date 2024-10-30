 public class MataKuliah {
    private String kode;
    private int SKS;
    private String nama;
    public MataKuliah(String kode, int sKS, String nama) {
        this.kode = kode;
        SKS = sKS;
        this.nama = nama;
    }
    
    public String getKode() {
        return kode;
    }
    public void setKode(String kode) {
        this.kode = kode;
    }
    public int getSKS() {
        return SKS;
    }
    public void setSKS(int sKS) {
        SKS = sKS;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void printInfo() {
        System.out.println("Kode: " + kode + ", Nama: " + nama + ", SKS: " + SKS);
}
}