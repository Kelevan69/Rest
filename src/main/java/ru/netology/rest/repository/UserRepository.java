package ru.netology.rest.repository;

import org.springframework.stereotype.Repository;
import ru.netology.rest.model.Authorities;

import java.util.List;
import java.util.Collections;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        // Замените условие на свою логику проверки
        if ("testUser".equals(user) && "testPassword".equals(password)) {
            return List.of(Authorities.READ, Authorities.WRITE);
        }
        return Collections.emptyList();
    }
}
