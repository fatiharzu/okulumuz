package de.farzu.model;

public class Login {
//    region Konstanten
//    endregion

//    region Attribute
    protected String adminUsername;
    protected String adminPassword;
    protected String personalUsername;
    protected String personalPassword;
//    endregion

//    regionKonstruktor

    public Login() {
    }

    public Login(String adminUsername, String adminPassword, String personalUsername, String personalPassword) {
        this.adminUsername = adminUsername;
        this.adminPassword = adminPassword;
        this.personalUsername = personalUsername;
        this.personalPassword = personalPassword;
    }


    //    endregion

//    regionMethoden

    public String getAdminUsername() {
        return adminUsername;
    }

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getPersonalUsername() {
        return personalUsername;
    }

    public void setPersonalUsername(String personalUsername) {
        this.personalUsername = personalUsername;
    }

    public String getPersonalPassword() {
        return personalPassword;
    }

    public void setPersonalPassword(String personalPassword) {
        this.personalPassword = personalPassword;
    }

    @Override
    public String toString() {
        return "Login{" +
                "adminUsername='" + adminUsername + '\'' +
                ", adminPassword='" + adminPassword + '\'' +
                ", personalUsername='" + personalUsername + '\'' +
                ", personalPassword='" + personalPassword + '\'' +
                '}';
    }

    //    endregion

}
