package com.manta.service;

import com.manta.model.Contact;

import java.util.List;

public interface ContactService {

    Contact save(Contact contact);

    List<Contact> saveAll(List<Contact> contacts);

    List<Contact> findAll();
}
