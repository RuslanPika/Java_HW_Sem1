package ru.itis.users.models;

/**
 * Lesson_4
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class User {

    private final String uuid;

    private final String phone;

    private final String email;

    private final String password;

    public User(String uuid, String email, String phone, String password) {
        this.uuid = uuid;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }

    public String getUuid() {
        return uuid;
    }

    public String getPhone() {return phone;}

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
