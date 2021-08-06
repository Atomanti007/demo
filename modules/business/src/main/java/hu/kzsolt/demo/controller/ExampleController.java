package hu.kzsolt.demo.controller;

import hu.kzsolt.demo.dto.ExampleDto;
import hu.kzsolt.demo.service.ExampleRest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
public class ExampleController implements ExampleRest {


    @Override
    public ExampleDto check() {
        
        return new ExampleDto("OK");
    }
}
