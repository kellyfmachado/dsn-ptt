package java_project.dsn_ptt.controller;

import java_project.dsn_ptt.model.User;
import java_project.dsn_ptt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {
    
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user){
        userService.register(user);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/login/{user}")
    public ResponseEntity<User> login(@PathVariable User user,String email, String password){
        userService.login(email,password);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/logout/{user}")
    public ResponseEntity<User> logout(@PathVariable User user,String email, String password){
        userService.logout(email,password);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/view/{user}")
    public ResponseEntity<User> viewProfile(@PathVariable User user){
        userService.viewProfile(user);
        return ResponseEntity.ok(user);
    }
}
