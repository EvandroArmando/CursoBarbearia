/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;
import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Evandro Armando
 */
public class JavaMailApp {
    
    
  public static void main(String[] args) {
    Properties props = new Properties();
    /** Parâmetros de conexão com servidor Gmail */
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.socketFactory.port", "465");
    props.put("mail.smtp.socketFactory.class",
    "javax.net.ssl.SSLSocketFactory");
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.port", "465");

    Session session = Session.getDefaultInstance(props,
      new javax.mail.Authenticator() {
           protected PasswordAuthentication getPasswordAuthentication()
           {
                 return new PasswordAuthentication("otalarmando@gmail.com",
                 "Amadeu-2019");
           }
      });

    /** Ativa Debug para sessão */
    session.setDebug(true);
        try {

      Message message = new MimeMessage(session);
      message.setFrom(new InternetAddress("otalarmando@gmail.com"));
      //Remetente

      Address[] toUser = InternetAddress //Destinatário(s)
                 .parse("juniorlena508@gmail.com");

      message.setRecipients(Message.RecipientType.TO, toUser);
      message.setSubject("Enviando email com JavaMail");//Assunto
      message.setText("Enviei este email utilizando JavaMail com");
      
      /**Método para enviar a mensagem criada*/
      Transport.send(message);

      System.out.println("Feito!!!");

     } catch (MessagingException e) {
        throw new RuntimeException(e);
    }

    
    
    
    
    

  }

    
    
    
}
