package Modul_2;
import java.util.Scanner;
public class MainStudent {
    public static void main(String[] args) {
//        Student anna = new Student();
//        anna.setName("Anna");
//        anna.setAddress("Malang");
//        anna.setAge(20);
//        anna.setMath(100);
//        anna.setScience(89);
//        anna.setEnglish(80);
//        anna.displayMessage();
//    //menggunakan constructor lain
//        System.out.println("===================");
//        Student chris = new Student("Chris", "Kediri", 21);
//        chris.setMath(70);
//        chris.setScience(60);
//        chris.setEnglish(90);
//        chris.displayMessage();
//    //siswa dengan nama anna dirubah informasi alamat dan umurnya melalui constructor 
//        System.out.println("===================");
//        anna = new Student("anna", "Batu", 18);
//        anna.displayMessage();
//    //siswa denagan nama chris dirubah informasi alamat dan umurnya melalui method 
//        System.out.println("===================");
//        chris.setAddress("Surabaya");
//        chris.setAge(22);
//        chris.displayMessage();
//    //nomor 2 constructor
//        System.out.println("===================");
//        Student rahmi = new Student(90, 85, 93);
//        rahmi.setName("Rahmi");
//        rahmi.setAddress("Malang");
//        rahmi.setAge(17);
//        rahmi.displayMessage();

//Nomor 4 Constructor student input
    Scanner input = new Scanner (System.in);
    Student siswa []=new Student[3];
        for( int i=0; i<siswa.length;i++){
            siswa[i]=new Student();
            System.out.println("Data Mahasiswa ke- "+(i+1));
            System.out.print("Masukkan Nama Siswa: ");
            String nama=input.next();
            siswa[i].setName(nama);
            System.out.print("Masukkan Umur: ");
            int umur=input.nextInt();
            siswa[i].setAge(umur);
            System.out.print("Masukkan Alamat: ");
            String alamat=input.next();
            siswa[i].setAddress(alamat);
            System.out.print("Masukkan Nilai Matematika:");
            int mtk=input.nextInt();
            siswa[i].setMath(mtk);
            System.out.print("Masukkan Nilai Science: ");
            int s=input.nextInt();
            siswa[i].setScience(s);
            System.out.print("Masukkan Nilai Bahasa Inggris: ");
            int big=input.nextInt();
            siswa[i].setEnglish(big);
            System.out.println("");
            System.out.println("----------------------------------------------");
            siswa[i].displayMessage();
            System.out.println("----------------------------------------------");
            Student.jumlahObjek();
            System.out.println("----------------------------------------------");
        }
                
    }
}
