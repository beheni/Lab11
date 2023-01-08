package org.example.strategy;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private final List<MailInfo> Infos = new ArrayList<>();

    public void addMailInfo(MailInfo maiInfo){
        Infos.add(maiInfo);
    }

    public void sendAll(){
        for (MailInfo mailInfo: Infos) {
            MailSender.sendMail(mailInfo);
        }
    }
}
