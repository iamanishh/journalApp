package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/public")
public class PublicController {

    @Autowired
    private UserService userService;


    @PostMapping("/create-user")
    public ResponseEntity<?> createUser(@Valid @RequestBody User user){

//        if(userService.findByUserName(user.getUserName()) != null){
//            return new ResponseEntity<>("Username already exists", HttpStatus.CONFLICT);
//        }
//        try{
//            userService.saveNewUser(user);
//            return new ResponseEntity<>(user, HttpStatus.CREATED);
//        }
//        catch (Exception e){
//            return new ResponseEntity<>("Error saving user", HttpStatus.INTERNAL_SERVER_ERROR);
//        }
        userService.saveNewUser(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);

    }


}
