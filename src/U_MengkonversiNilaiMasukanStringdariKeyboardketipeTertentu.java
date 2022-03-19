import java.io.IOException;
import java.util.Scanner;

public class U_MengkonversiNilaiMasukanStringdariKeyboardketipeTertentu {
    public static void main(String[] args) throws IOException{
        Scanner input=new Scanner(System.in);
        System.out.println("masukkan nama : ");
        String nama = input.nextLine();
        System.out.println("masukkan umur : ");
        String age = input.nextLine();
        System.out.println("masukkan tinggi badan : ");
        String height= input.nextLine();
        System.out.println("sudah menikah(true/false) : ");
        String married = input.nextLine();
        System.out.println("Nama : "+ nama);
        System.out.println("Umur : "+ Integer.parseInt(age));
        System.out.println("Tinggi Badan : "+ Double.parseDouble(height));
        System.out.println("Sudah Menikah : "+ Boolean.parseBoolean(married));


    }
}
