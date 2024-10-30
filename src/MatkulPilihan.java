public class MatkulPilihan extends MataKuliah {
    private int jumlahMinMahasiswa;
    
    public MatkulPilihan(String kode, int sKS, String nama, int jumlahMinMahasiswa) {
        super(kode, sKS, nama);
        this.jumlahMinMahasiswa = jumlahMinMahasiswa;
    }
    
    
        public int getJumlahMinMahasiswa() {
            return jumlahMinMahasiswa;
        }
    
        public void setJumlahMinMahasiswa(int jumlahMinMahasiswa) {
            this.jumlahMinMahasiswa = jumlahMinMahasiswa;
        }

        public void printInfo() {
            super.printInfo(); 
            System.out.println("Jumlah Minimum Mahasiswa: " + jumlahMinMahasiswa);
        }
}
