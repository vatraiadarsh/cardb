package com.ada.cardatabase;

import com.ada.cardatabase.domain.Car;
import com.ada.cardatabase.domain.CarRepository;
import com.ada.cardatabase.domain.Owner;
import com.ada.cardatabase.domain.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CardatabaseApplication {

    @Autowired
    private CarRepository carRepository;
    @Autowired
    private OwnerRepository ownerRepository;

    public static void main(String[] args) {
        SpringApplication.run(CardatabaseApplication.class, args);
    }

    @Bean
    CommandLineRunner runner() {
        return (args) -> {
            // Add owner objects and save these to db
//            Owner owner1 = new Owner(1, "John", "Johnson");
//            Owner owner2 = new Owner(2, "Mary", "Robinson");
//            ownerRepository.save(owner1);
//            ownerRepository.save(owner2);
//            
//            // Add car object with link to owners and save these to db.
//            carRepository.save(new Car(1, "Ford", "Mustang", "Red",
//                    "ADF-1121", 2017, 59000, owner1));
//            carRepository.save(new Car(2, "Nissan", "Leaf", "White",
//                    "SSJ-3002", 2014, 29000,owner2));
//            carRepository.save(new Car(3, "Toyota", "Prius", "Silver",
//                    "KKO-0212", 2018, 39000,owner1));
        };
    }

}
