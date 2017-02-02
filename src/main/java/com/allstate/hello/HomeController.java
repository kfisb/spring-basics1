package com.allstate.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by localadmin on 2/2/17.
 */
@RestController
public class HomeController {

    @RequestMapping(value="/", method= RequestMethod.GET)
    public Hello home() {
        Hello h = new Hello("Hello Springs");
        return h;
    }

}
