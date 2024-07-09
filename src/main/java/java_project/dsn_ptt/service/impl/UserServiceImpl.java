package java_project.dsn_ptt.service.impl;

import java_project.dsn_ptt.model.User;
import java_project.dsn_ptt.repository.UserRepository;
import java_project.dsn_ptt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void register(User user){
        userRepository.save(user);
    }
    @Override
    public boolean login(Long id){
        return userRepository.existsById(id);
    }
    @Override
    public void logout(User user){
        userRepository.delete(user);
    }
    @Override
    public Optional<User> viewProfile(Long id){
        return userRepository.findById(id);
    }
}
