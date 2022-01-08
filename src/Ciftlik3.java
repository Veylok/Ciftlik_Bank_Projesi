import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ciftlik3 implements Interface{
    @Override
    public void calistir() {
        Ciftlik ciftlik = new Ciftlik(0, 0, 0, 8, "AliBaba");
        int i = 1;


        ciftlik.seriNumarasi.add(i);
        ciftlik.hayvanTipi.add("tavuk");
        ciftlik.yas.add(1);
        ciftlik.kilo.add(5);
        i++;
        ciftlik.seriNumarasi.add(i);
        ciftlik.hayvanTipi.add("tnek");
        ciftlik.yas.add(1);
        ciftlik.kilo.add(4);
        i++;
        ciftlik.seriNumarasi.add(i);
        ciftlik.hayvanTipi .add("tavuk");
        ciftlik.yas.add(1);
        ciftlik.kilo.add(3);
        i++;
        ciftlik.seriNumarasi.add(i);
        ciftlik.hayvanTipi.add("tavuk");
        ciftlik.yas.add(1);
        ciftlik.kilo.add(4);
        i++;
        ciftlik.seriNumarasi.add(i);
        ciftlik.hayvanTipi.add("tavuk");
        ciftlik.yas.add(1);
        ciftlik.kilo.add(3);
        i++;
        ciftlik.seriNumarasi.add(i);
        ciftlik.hayvanTipi.add("tavuk");
        ciftlik.yas.add(1);
        ciftlik.kilo.add(2);
        i++;
        ciftlik.seriNumarasi.add(i);
        ciftlik.hayvanTipi.add("tavuk");
        ciftlik.yas.add(1);
        ciftlik.kilo.add(3);
        i++;
        ciftlik.seriNumarasi.add(i);
        ciftlik.hayvanTipi.add("tavuk");
        ciftlik.yas.add(1);
        ciftlik.kilo.add(2);


        ciftlik.davukDegeri();
        ciftlik.davukYemMaliyetiGünlük();
        ciftlik.yumurtaÜretimiGünlük();


        String islem = null;
        Scanner scan = new Scanner(System.in);


        while (1 > 0) {
            System.out.println("");
            System.out.println("Yapmak istediğiniz işlem nedir");
            System.out.println("Yapabileceğiniz işlemler: ");
            System.out.println("hayvanekle-hayvançıkar-hayvanbilgilerinideğiştir");
            System.out.println("çiftlikbilgileriniyazdır-bütünhayvanlarınbilgileriniyazdır");
            System.out.println("Devam etmek istiyorsanız 1 çıkış yapmak istiyorsanız 0 yazınız");
            int j = scan.nextInt();
            if (j == 0)  {
                System.out.println("Çiftlik2 Sisteminden çıkış yaptınız");
                break;
            }
            else
            islem = scan.next();

            switch (islem) {
                case "hayvanekle":
                    ciftlik.hayvanEkle();
                    break;
                case "hayvançıkar":
                    ciftlik.hayvanCıkar();
                    break;
                case "bütünhayvanlarınbilgileriniyazdır":
                    Collections.sort(ciftlik.seriNumarasi);
                    ciftlik.bütünHayvanBilgileriniYazdır();
                    break;
                case "inekYemmaliyeti":
                    ciftlik.davukYemMaliyetiGünlük();

                    break;
                case "çiftlikbilgileriniyazdır":
                    ciftlik.ciflikBilgileriniYazdir();
                    break;
                case "hayvanbilgilerinideğiştir":
                    ciftlik.hayvanBilgileriniDegistir();
                    break;

            }
        }
    }
    public class Ciftlik extends CiftlikBank {


        ArrayList<Integer> seriNumarasi = new ArrayList<Integer>();
        ArrayList<String> hayvanTipi = new ArrayList<String>();
        ArrayList<Integer> yas = new ArrayList<Integer>();
        ArrayList<Integer> kilo = new ArrayList<Integer>();

        static int davukYumurtaÜretimMiktari=1;
        final int davukYemMaliyeti=1; //günlük
        final int davukDegeri=35;

        public Ciftlik(int gelir, int gider, int degeri, int hayvansayisi , String ciftlikAdı) {
            super(gelir, gider, degeri, hayvansayisi, ciftlikAdı);
        }


        public Ciftlik(ArrayList<String> hayvanTipi, ArrayList<Integer> seriNumarasi, ArrayList<Integer> yas, ArrayList<Integer> kilo) {
            this.hayvanTipi = hayvanTipi;
            this.seriNumarasi = seriNumarasi;
            this.yas = yas;
            this.kilo = kilo;
        }

        public void hayvanEkle() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Hayvan eklemek için bilgilerini giriniz");
            System.out.println("Hayvanın Seri numarasi");
            int numara = scan.nextInt();
            seriNumarasi.add(numara);

            System.out.println("Hayvanın tipi");
            String tipi = scan.next();
            hayvanTipi.add(tipi);

            System.out.println("Hayvanın yasi");
            int yasi = scan.nextInt();
            yas.add(yasi);

            System.out.println("Hayvanın kilosu");
            int kilosu = scan.nextInt();
            kilo.add(kilosu);

            hayvansayisi++;

        }


        public void hayvanCıkar(){
            Scanner scan = new Scanner(System.in);
            bütünHayvanBilgileriniYazdır();
            System.out.println("Çıkarmak istediğiniz hayvanı liste sırasına göre seçiniz");
            int numara = scan.nextInt();
            numara--;
            seriNumarasi.remove(numara);
            hayvanTipi.remove(numara);
            kilo.remove(numara);
            yas.remove(numara);
            hayvansayisi--;

        }
        public void bütünHayvanBilgileriniYazdır(){
            for (int i=0; i<seriNumarasi.size();i++) {
                System.out.println("Hayvanın seri numarası: " + seriNumarasi.get(i));
                System.out.println("Hayvann tipi: " + hayvanTipi.get(i));
                System.out.println("Hayvanın kilosu: " + kilo.get(i));
                System.out.println("Hayvanın yaşı: " + yas.get(i));
            }
        }
        public void hayvanBilgileriniDegistir(){
            System.out.println("Değiştirmek istediğiniz hayvanı liste sırasına göre seçiniz");
            bütünHayvanBilgileriniYazdır();
            Scanner scan = new Scanner(System.in);
            int numara = scan.nextInt();
            numara--;
            System.out.println("Hayvanın Seri numarasi");
            int serino= scan.nextInt();
            seriNumarasi.set(numara,serino);

            System.out.println("Hayvanın tipi");
            String tipi = scan.next();
            hayvanTipi.set(numara,tipi);

            System.out.println("Hayvanın yasi");
            int yasi = scan.nextInt();
            yas.set(numara,yasi);

            System.out.println("Hayvanın kilosu");
            int kilosu = scan.nextInt();
            kilo.set(numara,kilosu);

        }

        public void ciflikBilgileriniYazdir() {
            hayvansayisi = seriNumarasi.size();
            gelir =hayvansayisi*davukYumurtaÜretimMiktari*2;
            gider = hayvansayisi*davukYemMaliyeti;
            degeri = hayvansayisi*davukDegeri;
            System.out.println("Çifliğin geliri: " + this.gelir);
            System.out.println("Çifliğin gideri: " + this.gider);
            System.out.println("Çifliğin değeri: " + this.degeri);
            System.out.println("Çiflikliğin hayvan sayisi: " + this.hayvansayisi);
            System.out.println("Çiftliğin adı: " + this.ciftlikAdı);
        }
        public int yumurtaÜretimiGünlük(){
            // bir ineğin günlük süt üretimi 20TL'dir (500kg inekler için )
            int davukSayisi=seriNumarasi.size();
            // çiğ sütün satış fiyatı 5TL'dir
            return gelir= (int) (gelir+ davukSayisi*davukYumurtaÜretimMiktari); // 1 hayvanın günlük ürettiği süt ile 100Tl kazanç sağlanıyor
        }
        public int davukYemMaliyetiGünlük(){
            int davukSayisi= seriNumarasi.size();
            // bir ineğin günlük yem maliyeti 23tldir.
            return this.gider = (int) (this.gider+ davukSayisi*davukYemMaliyeti);
        }
        public double davukDegeri(){
            int davukSayisi= seriNumarasi.size();
            // bir ineğin değeri 20.000Tldir

            return  (this.degeri =  davukSayisi*davukDegeri);
        }

    }
}