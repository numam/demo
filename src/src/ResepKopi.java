import java.util.Scanner;

public class ResepKopi {
    static String resep = ""; // Variabel untuk menyimpan resep

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di Program Resep Kopi!");
        System.out.println("Pilih salah satu opsi:");
        System.out.println("1. Pilih Resep");
        System.out.println("2. Masukkan Jumlah Kopi (dalam gram)");

        int pilihan = input.nextInt();

        if (pilihan == 1) {
            // Pilihan untuk menampilkan resep
            tampilkanResep();
        } else if (pilihan == 2) {
            // Pilihan untuk memasukkan jumlah kopi
            System.out.print("Masukkan jumlah kopi (dalam gram): ");
            int jumlahKopi = input.nextInt();
            tampilkanResepSesuai(jumlahKopi);
        } else {
            System.out.println("Pilihan tidak valid. Silakan pilih 1 atau 2.");
        }

        input.close();
    }

    public static void tampilkanResep() {
        System.out.println("Pilih resep yang diinginkan:");
        System.out.println("1. Espresso");
        System.out.println("2. Kopi Tubruk");
        System.out.println("3. Kopi Susu");

        Scanner input = new Scanner(System.in);
        int pilihanResep = input.nextInt();

        switch (pilihanResep) {
            case 1:
                resep = "Resep Espresso: Ekstrak 30gr kopi, saji dalam cangkir kecil.";
                break;
            case 2:
                resep = "Resep Kopi Tubruk: Campur 20gr kopi dan 150ml air panas, aduk rata.";
                break;
            case 3:
                resep = "Resep Kopi Susu: Campur 20gr kopi dengan 150ml susu panas.";
                break;
            default:
                System.out.println("Pilihan resep tidak valid.");
        }

        System.out.println(resep); // Menampilkan resep

        input.close();
    }

    public static void tampilkanResepSesuai(int jumlahKopi) {
        if (jumlahKopi < 20) {
            System.out.println("Jumlah kopi tidak mencukupi untuk membuat resep apa pun.");
        } else if (jumlahKopi >= 20 && jumlahKopi < 30) {
            if (!resep.isEmpty()) {
                System.out.println(resep); // Menampilkan resep yang sesuai
            } else {
                System.out.println("Pilih resep terlebih dahulu.");
            }
        } else if (jumlahKopi >= 30) {
            if (!resep.isEmpty()) {
                System.out.println(resep); // Menampilkan resep yang sesuai
            } else {
                System.out.println("Pilih resep terlebih dahulu.");
            }
        }
    }
}
