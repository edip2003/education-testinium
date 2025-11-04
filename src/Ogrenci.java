public class Ogrenci {
    private String ad;
    private String soyad;

    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }


    static void main(String[] args) {
        Ogrenci ogrenci=new Ogrenci("Edip","İsmail");
        Ogrenci ogrenci1=new Ogrenci("Enes","Albaş");
        System.out.println(ogrenci1.ad);
        System.out.println(ogrenci.soyad);

    }


}
