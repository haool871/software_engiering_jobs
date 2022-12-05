//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.skb.searchandorder;

import java.util.Iterator;
import java.util.List;

public class Group {
    public Group() {
        this.visit();
    }

    public void visit() {
        List<Session> sessionsList = GroupSession.sessionsList;
        if (sessionsList == null) {
            System.out.println("您还没有群聊，快去添加群聊吧\n");
        } else {
            System.out.println("群聊如下：");
            Iterator var2 = sessionsList.iterator();

            while(var2.hasNext()) {
                Session session = (Session)var2.next();
                System.out.printf("id：%s\t群聊昵称：%s\n", session.getId(), session.getSessionName());
            }
        }

        try {
            System.out.println("按任意键继续。。。");
            System.in.read();
        } catch (Exception var4) {
        }

    }
}
