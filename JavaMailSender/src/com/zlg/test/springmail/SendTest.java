package com.zlg.test.springmail;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import java.io.File;
import java.nio.file.Files;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Title: SendTest.java
 * @Package: com.zlg.test.springmail
 * @Description: TODO
 * @author: zlg
 * @date: 2017年6月20日 上午10:03:36
 * @version: V1.0
 */
public class SendTest {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mail.xml");
        MailSenderDemo sender = (MailSenderDemo) ac.getBean("MailSenderDemo");
        JavaMailSender javaMailSender = sender.getMailSender();
        MimeMessage mime = javaMailSender.createMimeMessage();
        MimeMessageHelper helper;
        try {
            helper = new MimeMessageHelper(mime, true, "utf-8");
            helper.setTo("530468294@qq.com");// 收件人邮箱地址
            helper.setFrom("704419968@qq.com");// 发件人
            helper.setSubject("【设备声音异常警报】");// 主题
            helper.setText("设备异常声音监测系统提醒您：设备BY1469异常！可能异常原因：负荷过大。请及时安排人工检测。");// 正文
        } catch (MessagingException me) {
            me.printStackTrace();
        }
        javaMailSender.send(mime);
    }

}