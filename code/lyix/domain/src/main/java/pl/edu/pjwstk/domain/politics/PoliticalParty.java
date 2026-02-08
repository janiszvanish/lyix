package pl.edu.pjwstk.domain.politics;

import pl.edu.pjwstk.domain.common.ContactInfo.Address;
import pl.edu.pjwstk.domain.common.ContactInfo.ContactInfo;
import pl.edu.pjwstk.domain.people.Person;
import pl.edu.pjwstk.domain.people.Politician;
import pl.edu.pjwstk.domain.politics.election.ElectoralDistrict;

import java.util.List;

public class PoliticalParty {
    private String name;
    private String shortCut; //TODO: Name to change
    private ElectoralDistrict electoralDistrict;
    private List<Politician> members;
    private Person president;
    private ContactInfo officialContactInfo;
    private Address officialAddress;

}
