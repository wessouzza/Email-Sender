package com.simple_email_sender.email_sender.service;

import com.simple_email_sender.email_sender.record.Email;

public interface EmailService {
    public void sendMessage(Email email);
}