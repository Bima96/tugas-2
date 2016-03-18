package Modul_2;

public class Student {

    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int studentCount;

    public Student() {
        studentCount++;
        name = "";
        address = "";
        age = 0;
    }
//nomor 2 constructor

    public Student(double m, double e, double s) {
        studentCount++;
        mathGrade = m;
        englishGrade = e;
        scienceGrade = s;
    }

    public Student(String n, String a, int ag) {
        name = n;
        address = a;
        age = ag;
    }

    public void setName(String n) {
        name = n;
    }

    public void setAddress(String a) {
        address = a;
    }

    public void setAge(int ag) {
        age = ag;
    }

    public void setMath(int math) {
        mathGrade = math;
    }

    public void setEnglish(int english) {
        englishGrade = english;
    }

    public void setScience(int science) {
        scienceGrade = science;
    }
//NOMOR 3 CONSTRUCTOR
    private double getAverage() {
        double result = 0;
        result = (mathGrade + scienceGrade + englishGrade) / 3;
        return result;
    }

    public boolean statusAkhir() {
        boolean hasil;
        if (getAverage() >= 61) {
            hasil = true;
        } else {
            hasil = false;
        }
        return hasil;
    }
//NOMOR 5 CONSTRUCTOR
    public static void jumlahObjek(){
        System.out.println("");
        System.out.println("Jumlah objek adalah " + studentCount);
    }
    public void displayMessage() {
        System.out.println("Siswa dengan nama " + name);
        System.out.println("beramalat di " + address);
        System.out.println("berumur " + age);
        System.out.println("mempunyai nilai rata-rata " + getAverage());
        if (statusAkhir() == true) {
            System.out.println("Selamat anda lolos.");
        } else {
            System.out.println("Anda harus remidi.");
        }

    }
}
