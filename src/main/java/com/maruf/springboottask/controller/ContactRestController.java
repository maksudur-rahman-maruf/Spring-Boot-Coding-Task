package com.maruf.springboottask.controller;

import com.maruf.springboottask.entity.Contact;
import com.maruf.springboottask.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactRestController {

    @Autowired
    private ContactRepository contactRepository;

    @PostMapping()
    @RolesAllowed("ADMIN")
    public Contact createContact(@RequestBody Contact contact) {
        return contactRepository.save(contact);
    }

    @GetMapping()
    @RolesAllowed({"ADMIN", "USER"})
    public List<Contact> getContact() {
        return contactRepository.findAll();
    }

}
