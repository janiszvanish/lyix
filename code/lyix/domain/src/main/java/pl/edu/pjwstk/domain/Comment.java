package pl.edu.pjwstk.domain;

import pl.edu.pjwstk.domain.user.User;

import java.time.LocalDateTime;

public class Comment {
    private LocalDateTime timestamp;
    private User user;
    private String text;
}
