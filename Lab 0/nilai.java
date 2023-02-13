import java.util.Scanner;

public class nilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Masukkan Nama Mahasiswa: ");

        //Menginisiasi variabel String untuk menyimpan input nama
        String inpNama;

        //meminta nama user
        inpNama = input.nextLine();

        //Meminta nilai asli user
        System.out.printf("Masukkan Nilai Asli: ");
        int inpNilaiAsli = input.nextInt();

        //Meminta durasi pengerjaan user
        System.out.printf("Masukkan Durasi: ");
        int inpDurasi = input.nextInt();

        //menginisiasi variable dounble
        double inpNilaiAkhir;

        //Menghitung nilai akhir
        if(inpDurasi<60){
             inpNilaiAkhir = 1.2 * inpNilaiAsli;
        } else if (inpDurasi >=60 && inpDurasi<=70) {
            inpNilaiAkhir = inpNilaiAsli;
        } else if (inpDurasi >=70 && inpDurasi<=90) {
            inpNilaiAkhir = 0.75 * inpNilaiAsli;
        } else if (inpDurasi >=90 && inpDurasi<=100) {
            inpNilaiAkhir = 0.5 * inpNilaiAsli;
        } else {
            inpNilaiAkhir = 0.2 * inpNilaiAsli;
        }
        System.out.println(inpNama + " mendapatkan nilai akhir " + inpNilaiAkhir);

        //Menutup scanner input
        input.close();
    }
}

