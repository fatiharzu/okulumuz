package de.farzu.ui;

import de.farzu.model.Personel;
import de.farzu.settings.AppTexts;
import de.farzu.settings.Commands;

import java.util.Scanner;

public class UiController {
    //region Konstanten
    //endregion

    //region Attribute
    //endregion

    //region Konstruktor
    Scanner scanner = new Scanner(System.in);
    Personel personel  = new Personel();
    //endregion

    //region Methoden

    public void startUi(){
        initialize();
        printApplicationName();
        showMainMenu();

    }

    private void showMainMenu() {
        boolean exitApplication = false;

        do {
            printMainMenu();
            int userCoise = Integer.parseInt(scanner.nextLine());

            switch (userCoise) {
                case Commands.CONTACT_CMD_CREATE -> create();
                case Commands.CONTACT_CMD_SHOW -> show();
                case Commands.CONTACT_CMD_FIND -> find();
                case Commands.CONTACT_CMD_DELETE -> delete();
                case Commands.CONTACT_CMD_SAVE -> save();
                case Commands.CONTACT_CMD_EXIT -> exitApplication = true;
                default -> System.out.println(AppTexts.MSG_INVALID_CHOICE);
            }
        }while (!exitApplication);
    }

    private void save() {
    }

    private void delete() {

    }

    private void find() {

    }

    private void show() {

    }

    private void create() {
    }

    private void printMainMenu() {
        System.out.println(AppTexts.MENU_CHOICE);
        System.out.println(AppTexts.DESIRE);
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
