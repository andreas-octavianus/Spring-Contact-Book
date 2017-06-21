package com.manta.service;

import com.manta.model.Contact;
import com.manta.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.*;

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

    @Override
    public List findAllContacts() {
        List result = new ArrayList();
        List<Object[]> contacts = contactRepository.findContactList(new Sort(Sort.Direction.ASC, "name"));
        for (Object[] contact: contacts) {
            Map<String, Object> map = new HashMap<>();
            map.put("id", contact[0]);
            map.put("name", contact[1]);
            result.add(map);
        }
        return result;
    }

    @Override
    public Contact findContactById(Long id) {
        return contactRepository.findOne(id);
    }
}
