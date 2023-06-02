package com.ubo.schoolwebapp.service;

import com.ubo.schoolwebapp.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

@Service
@Slf4j
@RequestScope
public class ContactService {

    public int counter = 0;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public ContactService()
    {
        System.out.println("Contact service bean initialized");
    }


    public boolean saveMessageDetails(Contact contact)
    {
        boolean isSaved = true;

        log.info(contact.toString());
        return isSaved;
    }
}
