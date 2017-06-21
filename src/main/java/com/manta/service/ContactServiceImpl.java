package com.manta.service;

import com.manta.model.Contact;
import com.manta.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public Contact save(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public List<Contact> saveAll(List<Contact> contacts) {
        return contactRepository.save(contacts);
    }
}
