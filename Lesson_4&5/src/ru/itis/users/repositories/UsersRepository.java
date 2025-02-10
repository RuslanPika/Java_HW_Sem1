package ru.itis.users.repositories;

import ru.itis.users.models.User;

import java.util.Arrays;

/**
 * Lesson_4
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class UsersRepository {
    private static final int MAX_USERS_COUNT = 10;

    public final User[] users;
    public int count;

    public UsersRepository() {
        this.users = new User[MAX_USERS_COUNT];
        this.count = 0;
    }

    public void save(User user) {
        if (count < MAX_USERS_COUNT) {
            this.users[count] = user;
            count++;
        } else {
            System.err.println("Хранилище переполнено");
        }
    }
}
