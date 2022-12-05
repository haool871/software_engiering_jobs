//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package code;

import java.util.ArrayList;
import java.util.List;

public class GroupSession {
    public static List<Session> sessionsList = new ArrayList();

    public GroupSession() {
        this.setSessionsList();
    }

    public void setSessionsList() {
        sessionsList.add(new Session("1", "群聊KFC"));
        sessionsList.add(new Session("2", "群聊BBQ"));
    }

    public List<Session> getSessionsList() {
        return sessionsList;
    }
}
