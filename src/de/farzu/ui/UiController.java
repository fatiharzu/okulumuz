package de.farzu.ui;

import de.farzu.model.Personel;
import de.farzu.settings.AppTexts;

public class UiController {
    //region Konstanten
    //endregion

    //region Attribute
    //endregion

    //region Konstruktor
    Personel personel  = new Personel();
    //endregion

    //region Methoden

    public void startUi(){
        initialize();
        printApplicationName();
        showMainMenu();

    }

    private void showMainMenu() {
    }

    private void initialize() {
    }

    private void printApplicationName() {
        System.out.println(AppTexts.APLICATION_NAME);
    }
    //endregion
    private int personelSayac(){
        int personelNo = personel.getSayac();
        return personelNo++;


    }
}
