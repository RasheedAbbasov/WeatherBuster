package Innovatech.WeatherBuster.service;

import org.springframework.stereotype.Service;

import Innovatech.WeatherBuster.repository.UserRepository;
import Innovatech.WeatherBuster.model.User;
import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;
    private User user;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Integer id) {
        return userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("User with id " + id + " not found"));
    }
}
