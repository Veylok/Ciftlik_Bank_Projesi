import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        String islem = null;
        Scanner scan = new Scanner(System.in);
        Ciftlik1 ciftlik1 = new Ciftlik1();
        Ciftlik2 ciftlik2 = new Ciftlik2();
        Ciftlik3 ciftlik3 = new Ciftlik3();


        while (0<1){
            System.out.println("");
            System.out.println("Yapmak istediğiniz işlem nedir");
            System.out.println("Yapabileceğiniz işlemler: ");
            System.out.println("çiftlik1aç-çiftlik2aç-çiftlik3aç");
            System.out.println("Devam etmek istiyorsanız 1 çıkış yapmak istiyorsanız 0 yazınız");
            int i = scan.nextInt();
            if (i == 0)  {
                System.out.println("Çiftlik Bank Sisteminden Çıkış Yaptınız ");
                System.out.println("       ÇİFTLİK BANK ayrıcalıktır...      ");
                break;
            }
            else
            islem = scan.next();

            switch (islem) {
                case "çiftlik1aç" :
                    ciftlik1.calistir();
                    break;
                case "çiftlik2aç" :
                    ciftlik2.calistir();
                    break;
                case "çiftlik3aç" :
                    ciftlik3.calistir();
                    break;
            }
        }
        System.out.println("Sistemden Çıkış Yaptınız");
    }
}




