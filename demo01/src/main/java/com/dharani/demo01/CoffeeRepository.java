package com.dharani.demo01;

import org.springframework.data.repository.CrudRepository;

import com.dharani.demo01.pojo.Coffee;

public interface CoffeeRepository extends CrudRepository<Coffee, String> {

}
