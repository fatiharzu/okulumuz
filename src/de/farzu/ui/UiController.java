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
    Commands commands = new Commands();
    //endregion

    //region Methoden


    private void personelLogin() { boolean exitApplication = false;
//
//        do {
//            printAdminMenu();
//            int userCoise = Integer.parseInt(scanner.nextLine());
//
//            switch (userCoise) {
//                case Commands.CONTACT_CMD_CREATE -> create();
//                case Commands.CONTACT_CMD_SHOW -> show();
//                case Commands.CONTACT_CMD_FIND -> find();
//                case Commands.CONTACT_CMD_DELETE -> delete();
//                case Commands.CONTACT_CMD_SAVE -> save();
//                case Commands.CONTACT_CMD_EXIT -> exitApplication = true;
//                default -> System.out.println(AppTexts.MSG_INVALID_CHOICE);
//            }
//        }while (!exitApplication);


    }

    private void studentLogin() {
    }

    private void printLoginMenu() {
        System.out.println("Lütfen önce Kullanici adinizi girip enter tusuna basiniz ardindan Parolanizi girip enter tusuna basiniz!!" +
                                "Programdan cikmak isterseniz x tusuna basiniz");
    }

    private void adminLogin() {
        boolean exitApplication = false;
        System.out.println("Kullanici adinizi girip enter tusuna");
        String enterUsername = scanner.next();
        System.out.println("Sifrenizi girip enter tusuna");
        String enterPassword = scanner.next();
       if (enterPassword.contains(Commands.ADMIN_PASSWORD) && enterUsername.contains(Commands.ADMIN_USERNAME) ){
           do {
               printAdminMenu();
               int userCoise = scanner.nextInt();

               switch (userCoise) {
                   case Commands.CONTACT_CMD_CREATE -> create();
                   case Commands.CONTACT_CMD_SHOW -> show();
                   case Commands.CONTACT_CMD_FIND -> find();
                   case Commands.CONTACT_CMD_DELETE -> delete();
                   case Commands.CONTACT_CMD_SAVE -> save();
                   case Commands.CONTACT_CMD_EXIT -> showMainMenu();
                   default -> System.out.println(AppTexts.MSG_INVALID_CHOICE);
               }
           }while (!exitApplication);
       }else {
           System.out.println("Lütfen dogru kullanici adi ve sifre giriniz");
           adminLogin();
       }

    }

    public void startUi(){
        initialize();
        printApplicationName();
        showMainMenu();

    }

    private void showMainMenu() {
        boolean exitApplication = false;

        do {
            printMainMenu();
            int userCoise = scanner.nextInt();

            switch (userCoise) {
                case Commands.CONTACT_CMD_ADMIN -> adminLogin();
                case Commands.CONTACT_CMD_PERSONEL -> personelLogin();
                case Commands.CONTACT_CMD_STUDENT -> studentLogin();
                case Commands.CONTACT_MAIN_EXIT -> exitApplication = true;
                default -> System.out.println(AppTexts.MSG_INVALID_CHOICE);
            }
        }while (!exitApplication);
    }

    private void printMainMenu() {
        System.out.println(AppTexts.MAIN_MENU_CHOICE);
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

    private void printAdminMenu() {
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
