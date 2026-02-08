package pl.edu.pjwstk.domain.politics.election;

import pl.edu.pjwstk.domain.politics.PoliticalLevel;

import java.time.LocalDate;
import java.util.List;

public class Election {
    private int year;
    private String name; //title? "Wybory parlamentarne 2027"
    private ElectionType type;
    private PoliticalLevel level;
    private LocalDate electionDate;
    private List<ElectoralDistrict> districts;

}
