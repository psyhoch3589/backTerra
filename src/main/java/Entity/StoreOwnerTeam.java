package Entity;

import java.time.LocalDate;

public class StoreOwnerTeam extends User {
    public StoreOwnerTeam(long id, String username, String firstName, String lastName, LocalDate birthday, String phone, String email, String password) {
        super(id, username, firstName, lastName, birthday, phone, email, password);
    }
}
