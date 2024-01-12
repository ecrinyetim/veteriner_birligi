import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
       

       Kedi kedi1=new Kedi("12.01.2013",true,"tekir");
       kedi1.bilgiGoster();

       Kopek kopek1=new Kopek("15.06.2022", false, 5);
       kopek1.bilgiGoster();

       Musteri m1=new Musteri("Helin","11335577156","İzmir");
       Musteri m2=new Musteri("Ayşe","11335577156","İstanbul");
       m1.MusteriyeHayvanEkle(kedi1);
       m1.kendiniTanıt();
    
       
       Veteriner v1= new Veteriner("Beyza", "21232578699", "Hacettepe", 10);
       v1.MusteriEkle(m1);
       v1.MusteriEkle(m2);
       v1.MusterileriListele();
       v1.kendiniTanıt();


       yonetim<hayvan> hayvanYönetimi=new yonetim<>();
       hayvanYönetimi.bilgileriGoster(kopek1);
       yonetim<Kisi> KisiYönetimi=new yonetim<>();
       KisiYönetimi.bilgileriGoster(v1);
       KisiYönetimi.bilgileriGoster(m1);


       
    }
     
}
