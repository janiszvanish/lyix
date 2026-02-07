package pl.edu.pjwstk.domain.people;

import pl.edu.pjwstk.domain.common.Duration;
import pl.edu.pjwstk.domain.politics.PoliticalParty;
import pl.edu.pjwstk.domain.politics.PoliticalView;
import pl.edu.pjwstk.domain.politics.Promise;
import pl.edu.pjwstk.domain.politics.voting.ParliamentaryVoting;

import java.util.List;
import java.util.Map;

public class Politician extends PublicPerson {
    List<ParliamentaryVoting> parliamentaryVoting;
    Map<Duration, PoliticalParty>  politicalParties;
    String electoralDistrict;
    List<PoliticalView> politicalViews;
    List<Promise> promises;
}
