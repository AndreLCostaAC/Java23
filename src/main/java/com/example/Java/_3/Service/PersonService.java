package com.example.Java._3.Service;

import com.example.Java._3.Model.Person;
import com.example.Java._3.Repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service // bean
public class PersonService {

    private final PersonRepo personRepo;

    @Autowired
    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public List<Person> getPersons() {
                return personRepo.findAll();
    }

    public void addNewPerson(Person person) {
        Optional<Person> personByName = personRepo.findByName(person.getName());
        if (personByName.isPresent()) {
            throw new IllegalArgumentException("Person already exists");
        }
        System.out.println(person);

        personRepo.save(person);
    }

    public void deletePerson(Long id) {
        Optional<Person> personById = personRepo.findById(id);
        if (personById.isPresent()) {
            personRepo.delete(personById.get());
        }
        else
            throw new IllegalArgumentException("Person with Id number: " + id + " not found");
    }

    @Transactional
    public void upadatePerson(Long personId, String name) {
        Person person = personRepo.findById(personId)
                .orElseThrow(() -> new IllegalArgumentException("Person with Id number: " + personId + " not found"));
        if (!name.isEmpty() && !person.getName().equals(name) ) {
            person.setName(name);
        }
    }
}
