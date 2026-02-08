package pl.edu.pjwstk.domain.user;

import java.util.List;

public class User {
    private String login;
    private String nickname; // TODO: Think if you want login == email and nickname == whatever is shown in service
    private String password;
    private String email;
    private String photoUri;
    private List<Role> roles;
}
