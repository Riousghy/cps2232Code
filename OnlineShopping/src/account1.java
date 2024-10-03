

import java.util.Scanner;

public class account1 {
    private int userID;
    private String password;
    Scanner input=new Scanner(System.in);
    public account1() {}

    public account1(int userID, String password ) {
        this.userID=userID;
        this.password=password;
    }
    public int getUserID() {
        return userID;
    }
    public String password() {
        return password;
    }
    public void setUserID(int userID) {
        this.userID=userID;
    }
    public void setPassword(String password) {
        this.password=password;
    }




}