import java.util.Date;

public class Presensi {
    private Date tanggal;
    private Status status;


    public Presensi(Date tanggal, Status status) {
        this.tanggal = tanggal;
        this.status = status;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    
    public String getStatusString() {
        if (status == Status.HADIR) {
            return "Hadir";
        } else {
            return "Alpha";
        }
    }
}
