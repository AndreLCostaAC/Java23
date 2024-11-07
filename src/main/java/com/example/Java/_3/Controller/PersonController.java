package com.example.Java._3.Controller;

import com.example.Java._3.Model.Person;
import com.example.Java._3.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/person")
public class PersonController {

    private final PersonService personService;

    @Autowired // the PersonService above should be injected in the constructor
    public PersonController(PersonService  personService){
        this.personService = personService;
    }

    @GetMapping
    public List<Person> getPersons(){

        return personService.getPersons();
    }

    @PostMapping
    public void addPerson(@RequestBody Person person){
        personService.addNewPerson(person);
    }

    @DeleteMapping(path = "{personId}")
    public void deletePerson(@PathVariable("personId") Long id){
        personService.deletePerson(id);

    }

    @PutMapping(path = "{personId}")
    public void updatePerson(@PathVariable("personId") Long personId,
                             @RequestParam(required = false) String name){
        personService.upadatePerson(personId, name);
    }

}
