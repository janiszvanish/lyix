package pl.edu.pjwstk.domain.politics.voting;

import pl.edu.pjwstk.domain.people.Politician;

import java.util.List;

public class ParliamentaryVoting extends Voting{
    private int sessionNumber; //TODO: String?
    private String term; //kadencja
    List<Politician> politicians;
}
