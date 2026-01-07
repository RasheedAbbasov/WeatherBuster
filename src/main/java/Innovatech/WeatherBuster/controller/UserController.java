package Innovatech.WeatherBuster.controller;

import Innovatech.WeatherBuster.model.User;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Innovatech.WeatherBuster.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

   private UserService userService;

   public UserController (UserService userService) {
      this.userService = userService;
   }

   @GetMapping
   public List<User> getAllUsers() {
      return userService.getAllUsers();
   }

   @GetMapping("{id}")
   public User getUserByid(@PathVariable Integer id) {
      return userService.getUserById(id);
   }

   
   
}
