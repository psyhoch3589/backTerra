package Entity.user;

import Entity.user.User;

import java.time.LocalDate;

public class FinalClient extends User {


    public FinalClient(long id, String username, String firstName, String lastName, LocalDate birthday, String phone, String email, String password) {
        super(id, username, firstName, lastName, birthday, phone, email, password);
    }
}
