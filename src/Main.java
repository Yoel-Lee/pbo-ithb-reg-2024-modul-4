import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
        public static void main(String[] args) {

                // modul4 no 2
                System.out.println(" \n\n----- \n MODUL 4 NO 1 & 2 \n -----\n\n");

                MahasiswaDoktor mhsD1 = new MahasiswaDoktor("Dewi", "Jl. Anggrek", "03-03-1985", "08111222333",
                                "789012",
                                "IF", "80%", "Studi Kuantum", 25.0, .0, 12);
                mhsD1.print();

                System.out.println();
                MahasiswaMagister mhsM1 = new MahasiswaMagister("Jaysen", "JL.ada", "03-11-02", "0822222123", "12344",
                                "IF", "65%", Arrays.asList("Algo", "Strukdat", "PBO"), "Dampak Laptop", 50, 10, 70);
                mhsM1.print();

                System.out.println();
                MahasiswaSarjana mhsS1 = new MahasiswaSarjana("Budi", "Jl. Merdeka", "01-01-2000", "08123456789",
                                "123456",
                                "IF", "40%", Arrays.asList("Matematika", "Fisika"), 70, 70, 80);
                mhsS1.print();

                // Modul 4 no 3
                System.out.println("\n\n MODUL 4 NO 3 - 5 , PRINT RATA RATA ANAK IF , LULUS/TIDAK ,  MATKUL APA & TOTAL PRESENSI \n\n");
                String targetJurusan = "IF";
                double totalNilai = 0;
                int jumlahMahasiswa = 0;
                int mahasiswaNgulang = 0;

                Mahasiswa[] mahasiswa = { mhsD1, mhsM1, mhsS1 };
                for (Mahasiswa mahasiswaFor : mahasiswa) {
                        if (mahasiswaFor.getJurusan().equals(targetJurusan)) {

                                if (mahasiswaFor.getNilaiAverage() < 56) {
                                        mahasiswaNgulang++;
                                }

                                totalNilai += mahasiswaFor.getNilaiAverage();
                                jumlahMahasiswa++;
                        }
                }

                if (jumlahMahasiswa > 0) {
                        double rataRataTotal = totalNilai / jumlahMahasiswa;
                        System.out.println("Rata rata dari " + jumlahMahasiswa + " mahasiswa " + targetJurusan
                                        + " adalah : " + rataRataTotal);
                } else {
                        System.out.println("Tidak ada mahasiswa");
                }

                System.out.println("Mahasiswa yang tidak lulus di jurusan " + targetJurusan + " : " + mahasiswaNgulang
                                + " dari " + jumlahMahasiswa + " mahasiswa");

                // modul 4 no 5
                String targetNIM = "123456";
                for (Mahasiswa mahasiswaFor2 : mahasiswa) {
                        if (mahasiswaFor2.getNIM().equals(targetNIM)) {
                                System.out.println("presensi : " + mahasiswaFor2.presensi);
                                System.out.println("Matkul diambil : ");
                                mahasiswaFor2.printMatkul();
                        }
                }
                System.out.println("\n\n\n\n MODUL 4 NOMOR 6 PRINT DOSEN \n\n");
                
                // modul 4 no 6
               
                Dosen dosen1 = new Dosen("Ko Dion", "Jl rajawali", "02-10-11", "082213444232", "1123009", "IF",
                Arrays.asList(
                        new MatkulAjar(
                                new MataKuliah("IF101", 4,"MatIF")
                                          , Arrays.asList (new PresensiStaff(new Date(),Status.HADIR, "08.00"))
                                         )
                                  )
                           );
                           
                dosen1.print();

                System.out.println("\n\n\n\n MODUL 4 NOMOR 7 PRINT GAJI \n\n");

        }

}