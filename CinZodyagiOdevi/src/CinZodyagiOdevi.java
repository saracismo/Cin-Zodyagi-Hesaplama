import java.util.Scanner;

public class CinZodyagiOdevi {
    public static void main(String[] args) {
        int birth;

        Scanner inp = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz: ");
        birth = inp.nextInt();

                if(birth % 12 == 0) {   //
                    System.out.println("Çin Zodyağı Burcunuz: Maymun");
                }
                if(birth % 12 == 1) {
                System.out.println("Çin Zodyağı Burcunuz: Horoz");
                }
                if(birth % 12 == 2) {
                System.out.println("Çin Zodyağı Burcunuz: Köpek");
                }
                if(birth % 12 == 3) {
                    System.out.println("Çin Zodyağı Burcunuz: Domuz");
                }
                if(birth % 12 == 4) {
                    System.out.println("Çin Zodyağı Burcunuz: Fare");
                }
                if(birth % 12 == 5) {
                    System.out.println("Çin Zodyağı Burcunuz: Öküz");
                }
                if(birth % 12 == 6) {
                    System.out.println("Çin Zodyağı Burcunuz: Kaplan");
                }
                if(birth % 12 == 7) {
                    System.out.println("Çin Zodyağı Burcunuz: Tavşan");
                }
                if(birth % 12 == 8) {
                    System.out.println("Çin Zodyağı Burcunuz: Ejderha");
                }
                if(birth % 12 == 9) {
                    System.out.println("Çin Zodyağı Burcunuz: Yılan");
                }
                if(birth % 12 == 10) {
                    System.out.println("Çin Zodyağı Burcunuz: At");
                }
                if(birth % 12 == 11) {
                    System.out.println("Çin Zodyağı Burcunuz: Koyun");
                }

    }
}