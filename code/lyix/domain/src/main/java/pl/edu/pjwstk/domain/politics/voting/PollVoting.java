package pl.edu.pjwstk.domain.politics.voting;

import pl.edu.pjwstk.domain.user.User;

import java.util.List;

public class PollVoting extends Voting {
    List<User> users;
    List<String> tags;
}
