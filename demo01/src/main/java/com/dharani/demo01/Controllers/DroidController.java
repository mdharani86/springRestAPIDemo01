package com.dharani.demo01.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dharani.demo01.pojo.Droid;

@RestController
@RequestMapping("/droid")
public class DroidController {

    private final Droid droid;

    public DroidController (Droid droid) {
        this.droid = droid;
    }

    @GetMapping
    public Droid getDroid() {
        return droid;
    }
}
