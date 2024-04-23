package org.example.controller;

import org.example.conpontent.Man;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerTest {

    @Autowired
    Man man;

    @RequestMapping(value = "/getMan", method = {RequestMethod.GET})
    public String test(){
        return man.printMan();
    }
}
