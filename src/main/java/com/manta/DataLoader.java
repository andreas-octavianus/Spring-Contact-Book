package com.manta;

import com.manta.model.Contact;
import com.manta.model.Phone;
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

    private List<Phone> phones = new ArrayList<>();

    private List<Contact> contacts = new ArrayList<>();

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        createContacts();
        createPhones();
        contactService.saveAll(contacts);
    }

    private void createPhones() {
        phones.add(createPhone("Home", "+1 789 23426372"));
        phones.add(createPhone("Office", "+1 789 2738262"));
    }

    private Phone createPhone(String type, String number) {
        Phone phone = new Phone();
        phone.setType(type);
        phone.setNumber(number);
        return phone;
    }

    private void createContacts() {
        contacts.add(createContact("Michael", null, "Jordan", "Charlotte Hornets", null, null, phones));
        contacts.add(createContact("LeBron", null, "James", "Cleveland Cavaliers", null, null, null));
        contacts.add(createContact("Kevin", null, "Durant", "Golden State Warriors", null, null, null));
        contacts.add(createContact("Stephen", null, "Curry", "Golden State Warriors", null, null, null));
        contacts.add(createContact("Jason", null, "Kidd", null, null, null, null));
        contacts.add(createContact("Anfernee", "Penny", "Hardaway", null, null, null, null));
        contacts.add(createContact("Vince", null, "Carter", "Memphis Grizzlies", null, null, null));
        contacts.add(createContact("Patrick", null, "Ewing", null, null, null, null));
        contacts.add(createContact("Kyrie", null, "Irving", "Cleveland Cavaliers", null, null, null));
        contacts.add(createContact("James", null, "Harden", "Houston Rockets", null, null, null));
        contacts.add(createContact("Kobe", null, "Bryant", null, null, null, null));
        contacts.add(createContact("Dwayne", null, "Wade", "Chicago Bulls", null, null, null));
        contacts.add(createContact("Russell", null, "Westbrook", "Oklahoma City Thunder", null, null, null));
        contacts.add(createContact("Chris", null, "Paul", "Los Angeles Clippers", null, null, null));
        contacts.add(createContact("Timothy", "Theodore", "Duncan", null, null, null, null));
        contacts.add(createContact("Seth", null, "Curry", "Dallas Mavericks", null, null, null));
        contacts.add(createContact("Dirk", null, "Nowitzki", "Dallas Mavericks", null, null, null));
    }

    private Contact createContact(String firstName, String middleName, String lastName, String company, Calendar birthDate, String notes, List<Phone> phones) {
        Contact contact = new Contact();
        contact.setFirstName(firstName);
        contact.setMiddleName(middleName);
        contact.setLastName(lastName);
        contact.setCompany(company);
        contact.setBirthDate(birthDate);
        contact.setNotes(notes);
        if (phones != null)
            contact.setPhones(phones);
        return contact;
    }

}
