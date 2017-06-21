package com.manta.controller;

import com.manta.model.Contact;
import com.manta.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContactController {

    @Autowired
    private ContactService contactService;

    @RequestMapping("/contacts")
    protected List<String> findAll() {
        return contactService.findAllContacts();
    }

    @RequestMapping("/contacts/new")
    protected Contact save(@RequestBody Contact contact) {
        return contactService.save(contact);
    }

}
