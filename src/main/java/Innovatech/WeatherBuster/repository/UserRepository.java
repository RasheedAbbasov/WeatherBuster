package Innovatech.WeatherBuster.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Innovatech.WeatherBuster.model.User;


public interface UserRepository extends JpaRepository<User, Integer> {
    
}