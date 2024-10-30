abstract public class Staff extends User{
    String NIK;
    

    
    public Staff(String nama, String alamat, String ttl, String telepon, String NIK) {
        super(nama, alamat, ttl, telepon);
        this.NIK=NIK;
    }

    public String getNIK() {
          return NIK;
      }
  
      public void setNIM(String NIK) {
          this.NIK=NIK;
      }
  

      @Override
      public void login(){
        System.out.println("Staff logged in, NIK : "+ NIK);
      }


}