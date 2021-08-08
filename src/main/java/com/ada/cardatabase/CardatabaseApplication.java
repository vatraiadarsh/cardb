package com.ada.cardatabase;

import com.ada.cardatabase.domain.Car;
import com.ada.cardatabase.domain.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CardatabaseApplication {

    @Autowired
    private CarRepository carRepository;

    public static void main(String[] args) {
        SpringApplication.run(CardatabaseApplication.class, args);
    }

    @Bean
    CommandLineRunner runner() {
        return (args) -> {
            carRepository.save(new Car(1, "Ford", "Mustang", "Red",
                    "ADF-1121", 2017, 59000));
            carRepository.save(new Car(2, "Nissan", "Leaf", "White",
                    "SSJ-3002", 2014, 29000));
            carRepository.save(new Car(3, "Toyota", "Prius", "Silver",
                    "KKO-0212", 2018, 39000));
        };
    }

}
