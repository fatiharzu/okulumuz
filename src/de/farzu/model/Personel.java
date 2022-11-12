package de.farzu.model;

public class Personel {
    //region Konstanten
    //endregion

    //region Attribute
    protected String isim;
    protected String soyIsim;
    protected String telNo;
    protected String adres;
    protected String tcNo;
    protected String sigortaNo;
    protected String personelNo;


    protected int sayac = 1000;
    //endregion

    //region Konstruktor

    public Personel(String isim, String soyIsim, String telNo, String adres, String tcNo) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.telNo = telNo;
        this.adres = adres;
        this.tcNo = tcNo;
    }

    public Personel(String isim, String soyIsim, String telNo, String adres, String tcNo, String sigortaNo, String personelNo, int sayac) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.telNo = telNo;
        this.adres = adres;
        this.tcNo = tcNo;
        this.sigortaNo = sigortaNo;
        this.personelNo = personelNo;
        this.sayac = sayac;
    }

    public Personel() {

    }

    //endregion

    //region Methoden

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getSigortaNo() {
        return sigortaNo;
    }

    public void setSigortaNo(String sigortaNo) {
        this.sigortaNo = sigortaNo;
    }

    public String getPersonelNo() {
        return personelNo;
    }

    public void setPersonelNo(String personelNo) {
        this.personelNo = personelNo;
    }

    public int getSayac() {
        return sayac;
    }

    public void setSayac(int sayac) {
        this.sayac = sayac;
    }

    @Override
    public String toString() {
        return "Personel{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", telNo='" + telNo + '\'' +
                ", adres='" + adres + '\'' +
                ", tcNo='" + tcNo + '\'' +
                ", sigortaNo='" + sigortaNo + '\'' +
                ", personelNo='" + personelNo + '\'' +
                ", sayac=" + sayac +
                '}';
    }
//endregion
}
