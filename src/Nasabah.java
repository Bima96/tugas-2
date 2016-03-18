package Modul_2;
public class Nasabah {
    private int noRekening, pin, saldo;
    private String nama;
    public Nasabah (){
        saldo = 0;
        pin = 0;
        noRekening = 0;
        nama = "";
    }
    public Nasabah (int Saldo, int pin, int noRekening, String nama){
        this.saldo = Saldo;
        this.pin = pin;
        this.noRekening = noRekening;
        this.nama = nama;
    }
    
    public void setSaldo (int saldo){
        this.saldo = saldo;
    }
    public void setNama (String nama){
        this.nama = nama;
    }
    public int getSaldo(){
        return saldo;
    }
    public int getPin(){
        return pin;
    }
    public int getNoRekening() {
        return noRekening;
    }
    public String getNama() {
        return nama;
    }
}
