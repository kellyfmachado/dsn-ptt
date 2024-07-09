package java_project.dsn_ptt.service;

import java_project.dsn_ptt.model.User;

public interface UserService {
    void register(User user);
    void login(String email, String password);
    void logout(String email, String password);
    User viewProfile(User user);
}
