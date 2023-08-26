package br.edu.ifpb.progdist.hellospring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloSpringController {

    @GetMapping("/hello")
    public String getHello(){
        return "Hello, Maria Rita!";
    }
}
