public class CiftlikBank {
    public int gelir;
    public int gider;
    public double degeri;
    public int hayvansayisi;
    String ciftlikAdı;
    public CiftlikBank(int gelir, int gider, int degeri, int hayvansayisi, String ciftlikAdı) {
        this.gelir = gelir;
        this.gider = gider;
        this.degeri = degeri;
        this.hayvansayisi = hayvansayisi;
        this.ciftlikAdı = ciftlikAdı;
        this.hayvansayisi++;
    }


    public CiftlikBank() {
    }
}