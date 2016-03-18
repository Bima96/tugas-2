package Modul_2;
public class ATM {
    private Nasabah user[] = new Nasabah[3];
    private int c = -1;
    private static int temp, penarikan;
    public ATM(){
        user[0] = new Nasabah (1000000, 1023, 1234, "Anto");
        user[1] = new Nasabah (1500000, 1022, 2234, "Barli");
        user [2] = new Nasabah (2000000, 2021, 3334, "Cahyo");
    }
    public void login (int a){
        for (int i = 0 ; i < 3; i++){
            if (user[i].getPin() == a){
                System.out.println("-----------------------------------------");
                System.out.println("\tLOGIN BERHASIL\t");
                System.out.println("-----------------------------------------");
                System.out.println("Nama Nasabah:\t" + user[i].getNama());
                System.out.println("No. Rekening:\t"+user[i].getNoRekening());
                System.out.println("");
                c = i;
                break;
            }
        }
    }
    public int getCari(){
        return c;
    }
    public int cekSaldo(){
        return user[getCari()].getSaldo();
    }
    public void transfer (int c, int n){
        for (int i = 0; i <3;i++){
            if (user[getCari()].getSaldo() - c < 0){
                System.out.println("Maaf, Saldo Tidak Mencukupi ...");
                break;
            }
            if (user[getCari()].getSaldo() - c >= 0){
                if (user[i].getNoRekening() == n){
                    user[getCari()].setSaldo(user[getCari()].getSaldo() - c);
                    System.out.println("Anda Mengirim Uang Ke\t : " + n);
                    System.out.println("Atas Nama\t\t : " +user[i].getNama());
                    System.out.println("Dengan Nominal\t\t : "+ c);
                    System.out.println("PROSES BERHASIL");
                    System.out.println("");
                    System.out.println("*************************************");
                    break;
                }
            }
        }
    }
    public void penarikan (int a){
        for (int i = 0; i < 3; i++){
            if (user[getCari()].getSaldo() - a < 0){
                System.out.println("Maaf, Saldo Tidak Mencukupi ...");
                break;
            }
            if (user[getCari()].getSaldo() - a >= 0){
                user[getCari()].setSaldo(user[getCari()].getSaldo() - a);
                System.out.println("PROSES BERHASIL");
                break;
            }
        }
    }
}
