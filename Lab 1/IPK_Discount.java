import java.util.Scanner;

public class LYZ_C_2206029645_MartinMarcelinoTarigan_Lab01  {
    public static void main(String[] args) {

        // Menginisiasi input sebagai Scanner
        Scanner input = new Scanner(System.in);

        //Menginisiasi data-data tipe double
        double IPK, price, revenue = 0;

        System.out.println("Selamat datang di Toko Fotokopi Dek Depe!");
        System.out.println("--------------------------------------------------------");

        //Mengambil data jumlah mahasiswa yang akan menggunakan jasa fotokopi
        System.out.print("Masukkan jumlah mahasiswa yang ingin melakukan fotokopi: ");
        int inputStudent = input.nextInt();

        for (int i = 0; i < inputStudent; i++) {
            System.out.printf("--------------------DATA MAHASISWA %d--------------------\n", i+1);

            //Mengambil data mahasiswa
            System.out.print("Nama: ");
            String nameStudent = input.next();
            System.out.print("IPK: ");
            IPK = input.nextDouble();
            System.out.print("Jumlah lembar: ");
            int sumOfPage = input.nextInt();

            //Menentukan diskon berdasarkan IPK
            String discount = "50%";
            if (IPK <= 2.5) {discount = "10%";}
            else if (IPK>2.5 && IPK<=3.0) {discount = "25%";}
            else if (IPK>3.0 && IPK<=3.5) {discount = "35%";}

            //Mengalkulasikan biaya setiap mahasiswa dan menghitung total pendapatan
            double newDiscount = (100-Double.parseDouble(discount.substring(0,discount.length()-1)))/100;
            price = sumOfPage * 555 * newDiscount;
            revenue += price;
            System.out.printf("%s membayar seharga %.2f dengan diskon sebesar %s\n", nameStudent, price, discount);
        }
        System.out.printf("Hasil pendapatan yang diperoleh Toko Fotokopi dari %d mahasiswa adalah %.2f\n", inputStudent, revenue);
        input.close();
    }
}
