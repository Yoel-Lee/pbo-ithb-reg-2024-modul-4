public class Mahasiswa extends User{
    String NIM;
    String jurusan;
    String presensi;
    
    
    
    public Mahasiswa(String nama, String alamat, String ttl, String telepon, String NIM, String jurusan,
    String presensi) {
        super(nama, alamat, ttl, telepon);
        this.NIM = NIM;
        this.jurusan = jurusan;
        this.presensi = presensi;
    }
    
    
    public String getPresensi() {
        return presensi;
    }



    public void setPresensi(String presensi) {
        this.presensi = presensi;
    }
   
    
    public String getNIM() {
          return NIM;
      }
  
      public void setNIM(String nIM) {
          NIM = nIM;
      }
  
      public String getJurusan() {
          return jurusan;
      }
  
      public void setJurusan(String jurusan) {
          this.jurusan = jurusan;
      }

      public double getNilaiAverage() {
        return 0; 
    }

@Override
      public void print() {
        super.print();
        System.out.println("NIM: " + getNIM());
        System.out.println("Jurusan: " + getJurusan());
        System.out.println("Presensi : "+ presensi);
      }

      public void printMatkul(){
        System.out.println();
      }

    
     


}