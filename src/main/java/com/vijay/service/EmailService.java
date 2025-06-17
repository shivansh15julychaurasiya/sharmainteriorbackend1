package com.vijay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendThankYouEmail(String to, String name) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject("Thank You for Visiting Sharma Interiors!");
        message.setText("Dear " + name + ",\n\nThank you for visiting Sharma Interiors. Our team will contact you soon with your quote.\n\nRegards,\nSharma Interiors Team\ndukhahran.sharma36@gmail.com");

        mailSender.send(message);
    }
}