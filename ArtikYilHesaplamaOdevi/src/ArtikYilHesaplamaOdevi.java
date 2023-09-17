import java.util.Scanner;
public class ArtikYilHesaplamaOdevi {
    public static void main(String[] args) {
        int birth;

        Scanner inp = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz: ");
        birth = inp.nextInt();


        switch (birth % 4) {                    // 4 üzerinden 100 ve 400e bölünebilme koşullarını yazalım.
            case 0:
                if (birth % 100 == 0) {
                    if (birth % 400 == 0) {
                        System.out.println(birth + " bir artık yıldır.");
                    } else {
                        System.out.println(birth + " bir artık yıl değildir.");
                    }
                    }else {
                    System.out.println(birth + " bir artık yıldır.");
                    }
                    break;
                        default:
                            System.out.println(birth + " bir artık yıl değildir.");
                            break;
                }


    }
}