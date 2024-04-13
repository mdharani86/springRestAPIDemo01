package com.dharani.demo01;

import java.util.List;

import org.springframework.stereotype.Component;

import com.dharani.demo01.pojo.Coffee;

import jakarta.annotation.PostConstruct;


@Component
public class DataLoader {
    
    private final CoffeeRepository coffeeRepository;

    public DataLoader(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    @PostConstruct
    private void loadData() {
        coffeeRepository.saveAll(List.of(
            new Coffee("Cafe Cereza"),
            new Coffee("CAfe Ganador"),
            new Coffee("Cafe Lareno"),
            new Coffee("Cafe Tres Pontas")
        ));
    }

}
