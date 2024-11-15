package Controller;

import Connection.Connect;
import Entities.User;
public class CtrlLogIn {

    public static boolean logIn(User user) {
        return Connect.connect(user) != null;
    }
}
