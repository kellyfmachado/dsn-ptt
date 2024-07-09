package java_project.dsn_ptt.service;

import java_project.dsn_ptt.model.User;

import java.util.Optional;

public interface UserService {
    void register(User user);
    boolean login(Long id);
    void logout(User user);
    Optional<User> viewProfile(Long id);
}
