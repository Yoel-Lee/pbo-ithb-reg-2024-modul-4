import java.util.Date;

public class PresensiStaff extends Presensi {
    private String jam;

    public PresensiStaff(Date tanggal, Status status, String jam) {
        super(tanggal, status);
        this.jam = jam;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    @Override
    public String getStatusString() {
        if (getStatus() == Status.ALPHA) {  
            return "Alpha";
        } else {  
            return super.getStatusString() + " staff hadir pada jam " + jam;
        }
    }
}
