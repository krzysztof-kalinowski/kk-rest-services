package kalinowski.krzysztof.restservices.controller;

import kalinowski.krzysztof.restservices.api.model.EndUserDTO;
import kalinowski.krzysztof.restservices.service.EndUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Krzysztof Kalinowski on 17/12/2019.
 */

@RestController
@CrossOrigin(origins = "*")
public class EndUserController {

    private final EndUserService endUserService;

    public EndUserController(EndUserService endUserService) {
        this.endUserService = endUserService;
    }

    @PostMapping("/add")
    public ResponseEntity addEndUser(@RequestBody EndUserDTO endUserDTO){
        return (ResponseEntity.ok(endUserService.save(endUserDTO)));
    }

    @GetMapping("/list")
    public ResponseEntity<List<EndUserDTO>> getEndUsers(){
        return ResponseEntity.ok(endUserService.getAll());
    }

    @GetMapping("/find/{pesel}")
    public ResponseEntity findEndUserByPesel(@PathVariable String pesel){
        return ResponseEntity.ok(endUserService.findByPesel(pesel));
    }

}
