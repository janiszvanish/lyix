package pl.edu.pjwstk.domain.company;

import pl.edu.pjwstk.domain.common.ContactInfo.Address;
import pl.edu.pjwstk.domain.common.ContactInfo.ContactInfo;
import pl.edu.pjwstk.domain.people.Person;

import java.util.List;

public class Company {
    private String name;
    private Person owner;
    private List<Person> employees;
    private ContactInfo contactInfo;
    private Address address;
}
