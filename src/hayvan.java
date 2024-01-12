abstract class hayvan {
private String dogumT;
private boolean kayitli;

    public String getDogumT() {
        return this.dogumT;
    }

    public void setDogumT(String dogumT) {
        this.dogumT = dogumT;
    }

    public boolean isKayitli() {
        return this.kayitli;
    }

    public boolean getKayitli() {
        return this.kayitli;
    }

    public void setKayitli(boolean kayitli) {
        this.kayitli = kayitli;
    }

    public hayvan(String dogumT, boolean kayitli) {
        this.dogumT = dogumT;
        this.kayitli = kayitli;
    }

 @Override
 public String toString() {

     return  " doğum tarihi: "+ dogumT+ " Kayıtlı mı? "+ kayitli;
 }

 abstract void bilgiGoster();
}
class Kedi extends hayvan{

    private String tur;
    private String cins;
    public Kedi(String dogumT,boolean kayitli, String cins) {
        super(dogumT, kayitli);
        this.tur="Kedi";
        this.cins=cins;

    }


    @Override
    void bilgiGoster(){
     System.out.println(toString()+ super.toString());
    }
     @Override
 public String toString() {

     return  " tur: "+ tur+ " cinsi "+ cins;
 }
    
}

class Kopek extends hayvan{

    private String tur;
   private Integer asiSayısı;

    public Integer getAsiSayısı() {
        return this.asiSayısı;
    }

    public void setAsiSayısı(Integer asiSayısı) {
        this.asiSayısı = asiSayısı;
    }


    public Kopek(String dogumT,boolean kayitli, Integer asiSayısı) {
        super(dogumT, kayitli);
        this.tur="Köpek";
        setAsiSayısı(asiSayısı);
    }


    @Override
    void bilgiGoster(){
     System.out.println(toString()+ super.toString());
    }
     @Override
 public String toString() {

     return  " tur: "+ tur + " aşı Sayısı  "+ getAsiSayısı();
 }
    
}


