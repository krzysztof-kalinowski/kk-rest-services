package kalinowski.krzysztof.restservices.controller;

import kalinowski.krzysztof.restservices.service.EndUserService;
import org.springframework.stereotype.Controller;

/**
 * Created by Krzysztof Kalinowski on 17/12/2019.
 */

@Controller
public class EndUserController {

    private final EndUserService endUserService;

    public EndUserController(EndUserService endUserService) {
        this.endUserService = endUserService;
    }

//    public void newUser
}
