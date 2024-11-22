import java.util.*;

class Pasien {
    String nama;
    JenisKamar[] rawatInap = new JenisKamar[10];
    JenisPerawatan[] perawatan = new JenisPerawatan[10];
    boolean pakaiBPJS;
    double totalBiaya;
}

class JenisKamar {
    String kelas;
    int hargaperhari;

    public JenisKamar(String kelas, int hargaherhari) {
        this.kelas = kelas;
        this.hargaperhari = hargaherhari;
    }
}

class JenisPerawatan {
    String nama;
    int biaya;

    public JenisPerawatan(String nama, int biaya) {
        this.nama = nama;
        this.biaya = biaya;
    }
}

public class no1 {
    
    static Pasien[] pasien = new Pasien[150];
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        int i = 0;
        do {
            System.out.println("Menu:");
            System.out.println("1. Masuk sebagai pasien");
            System.out.println("2. Admin");
            System.out.println("3. Exit");
            System.out.print("Masukkan pilihan: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Pasien");
                    opsiPasien(i);
                    i++;
                    break;
                case 2:
                    System.out.println("Admin");
                    opsiAdmin();
                    break;
                case 3:
                    System.out.println("EXIT");
                    break;
                default:
                    System.out.println("Pilihan invalid");
            }
        } while (choice != 3);
    }

    public static void opsiPasien(int i) {
        scan.nextLine();
        pasien[i] = new Pasien();

        System.out.println("masukkan nama pasien ke " + i);
        pasien[i].nama = scan.nextLine();

        for (int x = 0; x < pasien[i].rawatInap.length; x++) {
            System.out.println("Pilih kelas rawat inap untuk hari ke " + (x + 1) + ":");
            System.out.println("1. Kelas I - 10.000");
            System.out.println("2. Kelas II - 20.000");
            System.out.println("3. Kelas III - 30.000");
            System.out.println("4. VIP - 50.000");
            System.out.print("Masukkan pilihan kelas (1-4): ");
            int pilihanKelas = scan.nextInt();
            scan.nextLine();

            switch (pilihanKelas) {
                case 1:
                    pasien[i].rawatInap[x] = new JenisKamar("Kelas I", 10000);
                    break;
                case 2:
                    pasien[i].rawatInap[x] = new JenisKamar("Kelas II", 20000);
                    break;
                case 3:
                    pasien[i].rawatInap[x] = new JenisKamar("Kelas III", 30000);
                    break;
                case 4:
                    pasien[i].rawatInap[x] = new JenisKamar("VIP", 50000);
                    break;
                default:
                    System.out.println("Invalid, default ke Kelas I ");
                    pasien[i].rawatInap[x] = new JenisKamar("Kelas I", 10000);
            }

            System.out.println("Perawatan hari ke -- : " + (x + 1));
            System.out.println("1. Operasi - 1.000");
            System.out.println("2. X-RAY - 2.000");
            System.out.println("3. USG - 3.000");
            System.out.print("Masukkan pilihan perawatan (1-3): ");
            int pilihanRawat = scan.nextInt();
            scan.nextLine();

            switch (pilihanRawat) {
                case 1:
                    pasien[i].perawatan[x] = new JenisPerawatan("Operasi", 1000);
                    break;
                case 2:
                    pasien[i].perawatan[x] = new JenisPerawatan("X-RAY", 2000);
                    break;
                case 3:
                    pasien[i].perawatan[x] = new JenisPerawatan("USG", 3000);
                    break;
                default:
                    System.out.println("Invalid, default perawatan Operasi");
                    pasien[i].perawatan[x] = new JenisPerawatan("Operasi", 1000);
                    break;
            }

            pasien[i].totalBiaya += (pasien[i].rawatInap[x].hargaperhari + pasien[i].perawatan[x].biaya);
        }

        System.out.println("apakah anda menggunakan BPJS? \n 1.Yes \n 2.No");
        int bpjs = scan.nextInt();
        if (bpjs == 1) {
            pasien[i].totalBiaya = 0;
        }

        System.out.println("total biaya pasien ke" + (i +1) +" " + pasien[i].totalBiaya);
    }

    public static void opsiAdmin() {
        scan.nextLine();
        System.out.println("\n ==== OPSI ADMIN ===\n");
        System.out.println("1. hitung pendapatan RS");
        System.out.println("2. hitung pendapatan berdasarkan jenis perawatan");

        int choice = scan.nextInt();
        if (choice == 1) {
            double totalPendapatan = hitungTotalPendapatanRS();
            System.out.println("Total pendapatan RS = " + totalPendapatan);
        } else if (choice == 2) {
            hitungPendapatanBerdasarkan();
        } else {
            System.out.println("error input");
            opsiAdmin();
        }
    }

    public static double hitungTotalPendapatanRS() {
        double totalPendapatan = 0;

        for (int i = 0; i < pasien.length; i++) {
            if (pasien[i] != null) {
                totalPendapatan += pasien[i].totalBiaya;
            }
        }

        return totalPendapatan;
    }

    public static void hitungPendapatanBerdasarkan() {
        System.out.println("Berdasarkan perawatan apa?");
        System.out.println("1. Operasi");
        System.out.println("2. X-RAY");
        System.out.println("3. USG");

        double total = 0;
        int choice = scan.nextInt();
        String pilihan = "";

        switch (choice) {
            case 1:
                pilihan = "Operasi";
                break;
            case 2:
                pilihan = "X-RAY";
                break;
            case 3:
                pilihan = "USG";
                break;
            default:
                System.out.println("Pilihan invalid");
                return; 
        }

        for (int i = 0; i < pasien.length; i++) {
            if (pasien[i] != null) {
                for (int x = 0; x < pasien[i].perawatan.length; x++) {
                    if (pasien[i].perawatan[x] != null && pasien[i].perawatan[x].nama.equalsIgnoreCase(pilihan)) {
                        total += pasien[i].perawatan[x].biaya;
                    }
                }
            }
        }

        System.out.println("Total pendapatan perawatan" +pilihan+ " = " + total);
    }
}
