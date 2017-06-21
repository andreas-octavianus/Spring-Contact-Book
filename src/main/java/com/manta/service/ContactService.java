package com.manta.service;

import com.manta.model.Contact;

import java.util.List;
import java.util.Map;

public interface ContactService {

    Contact save(Contact contact);

    List<Contact> saveAll(List<Contact> contacts);

    List findAllContacts();
}
