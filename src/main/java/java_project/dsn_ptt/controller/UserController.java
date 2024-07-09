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

    @PostMapping("/login/{id}")
    public ResponseEntity<User> login(@PathVariable Long id){
        userService.login(id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/logout/{user}")
    public ResponseEntity<User> logout(@PathVariable User user){
        userService.logout(user);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/view/{id}")
    public ResponseEntity<User> viewProfile(@PathVariable Long id){
        userService.viewProfile(id);
        return ResponseEntity.ok().build();
    }
}
