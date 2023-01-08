package org.example;

import com.mailjet.client.ClientOptions;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.resource.Emailv31;
import lombok.SneakyThrows;
import org.json.JSONArray;
import org.json.JSONObject;

public class MailSender {
    @SneakyThrows
    public static void sendMail(MailInfo mailInfo) {
            MailjetClient client;
            MailjetRequest request;
            MailjetResponse response;
            client = new MailjetClient(System.getenv("****************************1234"), System.getenv("****************************abcd"), new ClientOptions("v3.1"));
            request = new MailjetRequest(Emailv31.resource)
                    .property(Emailv31.MESSAGES, new JSONArray()
                            .put(new JSONObject()
                                    .put(Emailv31.Message.FROM, new JSONObject()
                                            .put("Email", "anastasiia.beheni@ucu.edu.ua")
                                            .put("Name", "Anastasiia"))
                                    .put(Emailv31.Message.TO, new JSONArray()
                                            .put(new JSONObject()
                                                    .put("Email", mailInfo.getClient().getEmail())
                                                    .put("Name", mailInfo.getClient().getName())))
                                    .put(Emailv31.Message.SUBJECT, "Greetings from Mailjet.")
                                    .put(Emailv31.Message.TEXTPART, "My first Mailjet email")
                                    .put(Emailv31.Message.HTMLPART, mailInfo.getMailCode())
                                    .put(Emailv31.Message.CUSTOMID, "AppGettingStartedTest")));
            response = client.post(request);
            System.out.println(response.getStatus());
            System.out.println(response.getData());
        }
}
