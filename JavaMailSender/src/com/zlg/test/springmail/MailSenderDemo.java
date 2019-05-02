package com.zlg.test.springmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

/**
 * @Title: MailSenderDemo.java
 * @Package: com.zlg.test.springmail
 * @Description: spring mail 测试
 * @author: zlg
 * @date: 2017年6月20日 上午9:43:45
 * @version: V1.0
 */
public class MailSenderDemo {

    @Autowired
    private JavaMailSender mailSender;

    public void send(SimpleMailMessage mail) {
        mailSender.send(mail);
    }

    public JavaMailSender getMailSender(){
        return this.mailSender;
    }

}
