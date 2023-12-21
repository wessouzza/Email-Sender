package com.simple_email_sender.email_sender.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simple_email_sender.email_sender.record.Email;
import com.simple_email_sender.email_sender.serviceImp.EmailServiceImp;


@RestController
@RequestMapping("api/v1/email")
public class EmailController {
    private final EmailServiceImp emailServiceImp;

    public EmailController(EmailServiceImp emailServiceImp){
        this.emailServiceImp = emailServiceImp;
    }

    @PostMapping
    public void sendEmail(@RequestBody Email email) {
        emailServiceImp.sendMessage(email);
    }
}