package java_project.dsn_ptt.service.impl;

import java_project.dsn_ptt.model.User;
import java_project.dsn_ptt.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void register(User user){}
    @Override
    public void login(String email, String password){}
    @Override
    public void logout(String email, String password){}
    @Override
    public User viewProfile(User user){
        return null;
    }
}
