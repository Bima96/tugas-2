package Modul_2;
import java.util.Scanner;
public class MainATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ATM atm = new ATM();
        do {
            System.out.println("*********************************************");
            System.out.println("\tSELAMAT DATANG DI ATM MORIS\t\t");
            System.out.print("Silahkan masukkan pin anda : ");
            int pin = input.nextInt();
            atm.login(pin);
            if (atm.getCari() == -1){
                System.out.println("PIN YANG ANDA MASUKKAN SALAH");
                System.out.println("SILAHKAN MASUKKAN KEMBALI");
            }
        } while (atm.getCari() == -1);
        for (int i = 0; i < 3; i++){
            while (true){
                for (int j = 1; j > 0; j++){
                    System.out.println("");
                    System.out.println("-------------------------------------");
                    System.out.println("\tMENU\t\t\t");
                    System.out.println("-------------------------------------");
                    System.out.println("1. Cek Saldo");
                    System.out.println("2. Penarikan Tunai");
                    System.out.println("3. Transfer");
                    System.out.println("4. Keluar");
                    System.out.println("");
                    System.out.print("Masukkan Pilihan Anda: ");
                    int pil = input.nextInt();
                    switch (pil){
                        case 1 :
                            System.out.println("\t\tCEK SALDO\t\t");
                            System.out.println("************************************");
                            System.out.println("Saldo Anda sebesar Rp "+ atm.cekSaldo());
                            break;
                        case 2 :
                            System.out.println("\t\tPENARIKAN TUNAI\t\t");
                            System.out.println("************************************");
                            System.out.print("Masukkan Jumlah Uang Yang Akan Diambil : ");
                            int a = input.nextInt();
                            atm.penarikan(a);
                            System.out.println("************************************");
                            break;
                        case 3 :
                            System.out.println("\t\tTRANSFER\t\t");
                            System.out.println("************************************");
                            System.out.print("Masukkan Nomor Rekening Tujuan : ");
                            int y = input.nextInt();
                            System.out.print("Masukkan Jumlah Uang yang Ingin Dikirim : ");
                            int z = input.nextInt();
                            atm.transfer(z,y);
                            break;
                        case 4 :
                            System.out.println("\t\tTERIMA KASIH\t\t");
                            System.exit(0);
                            break;
                        default :
                            System.out.println("Pilihan yang Anda Masukkan Tidak Ada");
                    }
                    System.out.println("Apakah Anda Ingin Melakukan Transaksi Lagi ? <y/n>");
                    String y = input.next();
                    if ("y".equals(y)){
                    } else if ("n".equals(y)){
                        System.out.println("TERIMA KASIH");
                        System.exit(0);
                    }
                }
            }
        }
    }
}
