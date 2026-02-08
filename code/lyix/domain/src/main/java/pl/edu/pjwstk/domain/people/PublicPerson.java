package pl.edu.pjwstk.domain.people;

import pl.edu.pjwstk.domain.article.Article;
import pl.edu.pjwstk.domain.common.ContactInfo.Address;
import pl.edu.pjwstk.domain.common.ContactInfo.ContactInfo;
import pl.edu.pjwstk.domain.connection.Connection;

import java.util.Date;
import java.util.List;

public abstract class PublicPerson extends Person {
    private Date dateOfBirth;
    private ContactInfo contactInfo;
    private Address address;

    private List<Article> articles;
    private List<Connection> connections;
}
