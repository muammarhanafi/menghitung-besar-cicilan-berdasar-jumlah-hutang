import java.util.Scanner;

public class CicilanTanpaBunga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah hutang: ");
        int jumlahHutang = scanner.nextInt();

        System.out.print("Masukkan jumlah bulan: ");
        int jumlahBulan = scanner.nextInt();

        int cicilanPerBulan = jumlahHutang / jumlahBulan;
        int sisaHutang = jumlahHutang % jumlahBulan;

        System.out.println("Besaran cicilan per bulan: " + cicilanPerBulan);
        System.out.println("Sisa hutang: " + sisaHutang);
    }
}