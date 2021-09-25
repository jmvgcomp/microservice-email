package dev.jmvg.mssendingemail.services;

import dev.jmvg.mssendingemail.repositories.EmailRepository;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private EmailRepository emailRepository;

    public EmailService(EmailRepository emailRepository) {
        this.emailRepository = emailRepository;
    }

}
