package pl.javastart;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsersList {

    private List<User> users;

    public UsersList () {

        users = new ArrayList<>();

        User user1 = new User("Jan", "Kowalski", 23);
        User user2 = new User("Anna", "Nowak", 31);
        User user3 = new User("Karolina", "Kruk", 11);

        users.add(user1);
        users.add(user2);
        users.add(user3);
    }

    public List<User> getUsers() {
        return users;
    }

    public void add (User user) {

        users.add(user);

    }


}
