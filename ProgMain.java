import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Scanner;

public class ProgMain {

    public static void main(String[] args) throws Exception {

        ArrayList<Prog2> p = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nama, alamat, notlp, email, pilihan, ww;
        Integer ttl, penyedia, alat, bahan, trans, js, jt;

        System.out.println("--- Car Cleaning. Anda pesan Kami datang ---");
        System.out.println("=============================================");
        System.out.println("---------------------oOo---------------------");

        System.out.println("Masukan data pemesan");
        System.out.print("Nama      : ");
        nama = sc.nextLine();
        System.out.print("Alamat    : ");
        alamat = sc.nextLine();
        System.out.print("No Telfon : ");
        notlp = sc.nextLine();
        System.out.print("Email     : ");
        email = sc.nextLine();

        System.out.println("");

        System.out.println("*Jenis Jasa*");
        System.out.println("1.Cuci Mobil");
        System.out.println("2.Salon Mobil Interior");
        System.out.println("3.Salon Mobil Eksterior");

        System.out.print("pilih jasa  : ");
        js = sc.nextInt();

        System.out.println("");

        System.out.println("Team Penyedia jasa");
        System.out.println("1.Team Sea[2 orang]");
        System.out.println("2.Team Mountain[4 orang]");
        System.out.println("3.Team Forest[5 orang]");

        System.out.print("pilih team  : ");
        jt = sc.nextInt();

        System.out.println("");

        System.out.print("Berikan keterangan pemesanan : ");
        ww = br.readLine();

        System.out.println("");

        System.out.print("Masukan biaya Penyedia Jasa   Rp.");
        penyedia = sc.nextInt();
        System.out.print("Masukan biaya Jasa Alat       Rp.");
        alat = sc.nextInt();
        System.out.print("Masukan biaya Bahan Jasa      Rp.");
        bahan = sc.nextInt();
        System.out.print("Masukan biaya Transportasi    Rp.");
        trans = sc.nextInt();

        ttl = penyedia + alat + bahan + trans;
        System.out.println("=============================================");
        System.out.println("---------------------oOo---------------------");

        System.out.print("Jasa yang di pesan    : ");
        if (js == 1) {
            System.out.println("Cuci Mobil");
        } else if (js == 2) {
            System.out.println("Salon Mobil Interior");
        } else if (js == 3) {
            System.out.println("Salon Mobil Eksterior");
        }
        System.out.print("Nama Penyedia Jasa    : ");
        if (jt == 1) {
            System.out.println("1.Team Sea[2 orang]");
        } else if (jt == 2) {
            System.out.println("2.Team Mountain[4 orang]");
        } else if (jt == 3) {
            System.out.println("3.Salon Mobil Eksterior");
        }
        System.out.print("Keterangan            : ");
        System.out.println(ww);
        System.out.println("");
        System.out.print("Total biaya yang di bayar pemesanan : Rp.");
        System.out.println(ttl);
        System.out.println("");
    }
}