package de.farzu.model;

public class Ogretmen extends Personel{
    //region Konstanten
    //endregion

    //region Attribute
    protected String brans;


    //endregion

    //region Konstruktor

    public Ogretmen() {
    }

    public Ogretmen(String isim, String soyIsim, String telNo, String adres, String tcNo, String sigortaNo, String personelNo, int sayac, String brans) {
        super(isim, soyIsim, telNo, adres, tcNo, sigortaNo, personelNo, sayac);
        this.brans = brans;
    }
    //endregion

    //region Methoden

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "brans='" + brans + '\'' +
                ", isim='" + isim + '\'' +
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
