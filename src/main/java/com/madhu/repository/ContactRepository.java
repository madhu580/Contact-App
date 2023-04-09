package com.madhu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madhu.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
