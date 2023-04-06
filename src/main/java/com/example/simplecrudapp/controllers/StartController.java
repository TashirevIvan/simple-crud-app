package com.example.simplecrudapp.controllers;

import com.example.simplecrudapp.repo.Client;
import com.example.simplecrudapp.services.StartService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
@AllArgsConstructor
public class StartController {

    private final StartService startService;

    @PostMapping
    public String post(@RequestBody Person person) {
        String s = startService.calcAge(person);
        return s;
    }

    @GetMapping
    public List<Client> getAllClients() {
        return startService.getAllClients();
    }



    @GetMapping("/a")
    public Person lalal() {
        return new Person("qqqq", 123);
    }


//    @GetMapping("/hello")
//    public String getGreeting() {
//        return "Hello";
//    }

}
