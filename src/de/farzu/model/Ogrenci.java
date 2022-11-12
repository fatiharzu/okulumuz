package de.farzu.model;

public class Ogrenci extends Personel{
    //region Konstanten
    //endregion

    //region Attribute
    protected String sinifi;
    protected String ogrenciNo;

    //endregion

    //region Konstruktor

    public Ogrenci() {
    }

    public Ogrenci(String isim, String soyIsim, String telNo, String adres, String tcNo, String sinifi, String ogrenciNo) {
        super(isim, soyIsim, telNo, adres, tcNo);
        this.sinifi = sinifi;
        this.ogrenciNo = ogrenciNo;
    }
    //endregion

    //region Methoden

    public String getSinifi() {
        return sinifi;
    }

    public void setSinifi(String sinifi) {
        this.sinifi = sinifi;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "sinifi='" + sinifi + '\'' +
                ", ogrenciNo='" + ogrenciNo + '\'' +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", telNo='" + telNo + '\'' +
                ", adres='" + adres + '\'' +
                ", tcNo='" + tcNo + '\'' +
                '}';
    }
    //endregion
}
