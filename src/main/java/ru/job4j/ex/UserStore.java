package ru.job4j.ex;

import java.util.Objects;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (int i = 0; i < users.length; i++) {
            if (String.valueOf(users[i]).equals(login)) {
                return users[i];
            } else {
                    throw new UserNotFoundException("User is not found.");
                }
        }
        return null;
    }

    public static boolean validate(User user) throws UserInvalidException {
        return true;
    }

    public static void main(String[] args) {
        try {
            User[] users = {
                    new User("Petr", true)
            };
            User user = findUser(users, "Petr");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}
