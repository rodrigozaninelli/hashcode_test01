package entities;

public class Usuario {

    private int userNumber;
    private String userName;

    public Usuario(int userNumber, String userName) {
        this.userNumber = userNumber;
        this.userName = userName;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public String getUserName() {
        return userName;
    }

}
