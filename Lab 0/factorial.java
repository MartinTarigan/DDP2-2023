package lab0.java;
import java.util.Scanner;

public class pangkatFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hasilFact = 1;
        int hasilPangkat = 1;
        int n;
        int m;

        System.out.printf("masukkan bilangan utama (n): ");
        n = input.nextInt();
        System.out.printf("masukkan pemangkatan (m): ");
        m = input.nextInt();

        //factorial
        int tempN = n;
        while(tempN>=1) {
            hasilFact = hasilFact * tempN;
            tempN -= 1;
        }
        //pangkat
        for (int i = 0; i < m; i++){
            hasilPangkat = hasilPangkat * n;
        }
        System.out.println("n factorial = " + hasilFact);
        System.out.println("n pangkat m = " + hasilPangkat);
    }
}
