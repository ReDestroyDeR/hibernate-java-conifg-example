package org.example;


import org.example.domain.Car;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@SpringBootApplication
public class Application {
    private final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Application.class);
    }

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @PostConstruct
    public void testCreate() {uu
        var car = new Car();
        car.setName("Toyota Corolla");
        log.info("Saving car {}", car);
        entityManager.persist(car);
        log.info("Saved {}", car);
    }
}
