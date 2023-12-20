package com.simple_email_sender.email_sender.serviceImp;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.simple_email_sender.email_sender.record.Email;
import com.simple_email_sender.email_sender.service.EmailService;

@Service
public class EmailServiceImp implements EmailService{
    private JavaMailSender javaMailSender;

    public EmailServiceImp(JavaMailSender javaMailSender){
        this.javaMailSender = javaMailSender;
    }

    @Override
    public void sendMessage(Email email) {
        var message = new SimpleMailMessage();
        message.setFrom(email.from());
        message.setTo(email.to());
        message.setSubject(email.subject());
        message.setText(email.body());

        javaMailSender.send(message);
    }


}