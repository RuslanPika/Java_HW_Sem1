package ru.itis.users.services;

import ru.itis.users.models.User;
import ru.itis.users.repositories.UsersRepository;

import java.util.Arrays;
import java.util.UUID;

/**
 * Lesson_4
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class UsersService {

    private final UsersRepository repository;

    public UsersService() {
        this.repository = new UsersRepository();
    }

    public void addUser(String email, String phone, String password) {
        User user = new User(UUID.randomUUID().toString(), email, phone, password);

        repository.save(user);
        System.out.println(email);
        ;
    }

    public void removeUser(String email, String password) {
        for (int i = 0; i < repository.count; i ++ ) {
            if (repository.users[i].getEmail().equals(email) & repository.users[i].getPassword().equals(password)) {
                for (int j = i; j < repository.count; j ++ ) {
                    repository.users[j]  = repository.users[j + 1];
                }
                repository.users[repository.count - 1] = null;
                repository.count --;
                System.out.println("Пользователь с email " + email + " был удалён");
                return;
            }
        }
        System.out.println(repository.users[0].getEmail());
        System.out.println("Пользователь с email " + email + " не был найден или пароль неверный");
    }

}
