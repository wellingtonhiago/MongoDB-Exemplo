package com.cadastro.GIP.controller;


import com.cadastro.GIP.Service.UserService;
import com.cadastro.GIP.model.User;
import com.cadastro.GIP.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private UserRepository users;

    @PostMapping
    public ResponseEntity<User> register(@RequestBody User client) {
        return ResponseEntity.ok(users.save(client));
    }

    @GetMapping("/{idGip}")
    public ResponseEntity<User> getUser(@PathVariable String idGip){
        return ResponseEntity.ok(users.findByIdGip(idGip));
    }

    @PutMapping("/{idGip}")
    public ResponseEntity<User> updateUser(@PathVariable String idGip, @RequestBody Map<String, Object> updates) {
        User user = users.findByIdGip(idGip);
        if (user == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(users.save(UserService.update(user, updates)));
    }


}



