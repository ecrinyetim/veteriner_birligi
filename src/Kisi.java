import java.util.ArrayList;

abstract public class Kisi{
 private String isim;
 private String tcNo;
 

    public Kisi(String isim, String tcNo) {
        this.isim = isim;
        this.tcNo = tcNo;
    }

    public String getIsim() {
        return this.isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getTcNo() {
        return this.tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    abstract void kendiniTanıt();

   

    @Override
    public String toString() {
        return 
            " isim='" + getIsim() + "'" +
            ", tcNo='" + getTcNo() + "'" ;
    }


}

class Musteri extends Kisi{

    private String adres;
    private ArrayList<hayvan> musteriHayvanları;

    public void MusteriyeHayvanEkle(hayvan h){
        musteriHayvanları.add(h);
    }

    public ArrayList<hayvan> getMusteriHayvanları() {
        return this.musteriHayvanları;
    }

    public void setMusteriHayvanları(ArrayList<hayvan> musteriHayvanları) {
        this.musteriHayvanları = musteriHayvanları;
    }

    public String getAdres() {
        return this.adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

     public Musteri(String isim, String tcNo, String adres) {
       super(isim,tcNo);
       setAdres(adres);
       musteriHayvanları=new ArrayList<>();
    }
    

    @Override
    void kendiniTanıt() {
        System.out.println( super.toString()+this.toString() + "Ben bir müşteriyim");
    }


    @Override
    public String toString() {
        return 
            " adres='" + getAdres() + "'"+ " Hayvanları " +getMusteriHayvanları() 
            ;
    }
    

}


class Veteriner extends Kisi{

    private String okul;
    private Integer calismaSuresi;
    private ArrayList<Musteri> musterileri;
   
    public ArrayList<Musteri> getMusterileri() {
        return this.musterileri;
    }

    public void setMusterileri(ArrayList<Musteri> musterileri) {
        this.musterileri = musterileri;
    }

    public String getOkul() {
        return this.okul;
    }

    public void setOkul(String okul) {
        this.okul = okul;
    }

    public Integer getCalismaSuresi() {
        return this.calismaSuresi;
    }

    public void setCalismaSuresi(Integer calismaSuresi) {
        this.calismaSuresi = calismaSuresi;
    }
    
    
    public void MusteriEkle(Musteri m){

        musterileri.add(m);

    }
    public void MusterileriListele(){
      System.out.println( getMusterileri());
    }

     public Veteriner(String isim, String tcNo,String okul, Integer calismaSuresi) {
       super(isim, tcNo);
       setCalismaSuresi(calismaSuresi);
       setOkul(okul);
       musterileri=new ArrayList<>();

    }


    @Override
    public String toString() {
        return 
            " okul='" + getOkul() + "'" +
            " calismaSuresi='" + getCalismaSuresi() + "'";
    }


    @Override
    void kendiniTanıt() {
        System.out.println(super.toString()+this.toString()+ " Ben bir Veterinerim");
    }
}