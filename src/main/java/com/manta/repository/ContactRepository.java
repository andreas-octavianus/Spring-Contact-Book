package com.manta.repository;

import com.manta.model.Contact;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact, Long> {

    @Query("SELECT t.id, CONCAT(t.lastName, ', ', t.firstName) AS name FROM Contact t")
    List<Object[]> findContactList(Sort sort);

}
