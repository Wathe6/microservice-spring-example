package io.envoi.demo.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="hello")
public class HelloService {

    @GetMapping(value="/{firstName}/{lastName}")
    public String hello( @PathVariable("firstName") String firstName,
                         @PathVariable("lastName") String lastName) {

        return String.format("{\"message\":\"Hello %s %s\"}", firstName, lastName);
    }
}
