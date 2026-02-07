package pl.edu.pjwstk.domain.people;

import pl.edu.pjwstk.domain.common.ContactInfo.socialMedia.SocialMediaType;

import java.util.Map;

public class Person {
    private String firstName;
    private String lastName;
    private Map<SocialMediaType, String> socialMediaLinks;

}
