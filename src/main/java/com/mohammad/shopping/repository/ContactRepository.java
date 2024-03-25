package com.mohammad.shopping.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mohammad.shopping.model.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {


}