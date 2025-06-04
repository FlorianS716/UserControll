package io.UserControll.UserControll.controller;

import io.UserControll.UserControll.model.User;
import io.UserControll.UserControll.repo.UserRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserRepo userRepo;

    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userRepo.save(user);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userRepo.findAll();
    }
}
