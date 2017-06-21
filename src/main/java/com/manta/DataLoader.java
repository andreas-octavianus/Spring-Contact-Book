package com.manta;

import com.manta.model.Contact;
import com.manta.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private ContactService contactService;

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        createContacts();
        System.out.println("DataLoader was invoked");
    }

    private void createContacts() {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(createContact("Michael", null, "Jordan", "Charlotte Hornets", null, null));
        contacts.add(createContact("LeBron", null, "James", "Cleveland Cavaliers", null, null));
        contacts.add(createContact("Kevin", null, "Durant", "Golden State Warriors", null, null));
        contacts.add(createContact("Stephen", null, "Curry", "Golden State Warriors", null, null));
        contacts.add(createContact("Jason", null, "Kidd", null, null, null));
        contacts.add(createContact("Anfernee", "Penny", "Hardaway", null, null, null));
        contacts.add(createContact("Vince", null, "Carter", "Memphis Grizzlies", null, null));
        contacts.add(createContact("Patrick", null, "Ewing", null, null, null));
        contacts.add(createContact("Kyrie", null, "Irving", "Cleveland Cavaliers", null, null));
        contacts.add(createContact("James", null, "Harden", "Houston Rockets", null, null));
        contacts.add(createContact("Kobe", null, "Bryant", null, null, null));
        contacts.add(createContact("Dwayne", null, "Wade", "Chicago Bulls", null, null));
        contacts.add(createContact("Russell", null, "Westbrook", "Oklahoma City Thunder", null, null));
        contacts.add(createContact("Chris", null, "Paul", "Los Angeles Clippers", null, null));
        contacts.add(createContact("Timothy", "Theodore", "Duncan", null, null, null));
        contacts.add(createContact("Seth", null, "Curry", "Dallas Mavericks", null, null));
        contacts.add(createContact("Dirk", null, "Nowitzki", "Dallas Mavericks", null, null));
        contactService.saveAll(contacts);
    }

    private Contact createContact(String firstName, String middleName, String lastName, String company, Calendar birthDate, String notes) {
        Contact contact = new Contact();
        contact.setFirstName(firstName);
        contact.setMiddleName(middleName);
        contact.setLastName(lastName);
        contact.setCompany(company);
        contact.setBirthDate(birthDate);
        contact.setNotes(notes);
        return contact;
    }

}
