package kalinowski.krzysztof.restservices.controller;

import kalinowski.krzysztof.restservices.api.model.EndUserDTO;
import kalinowski.krzysztof.restservices.service.EndUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Krzysztof Kalinowski on 17/12/2019.
 */

@RestController
public class EndUserController {

    private final EndUserService endUserService;

    public EndUserController(EndUserService endUserService) {
        this.endUserService = endUserService;
    }

    @PostMapping("/put")
    public ResponseEntity addEndUser(@Valid @RequestBody EndUserDTO endUserDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            ObjectError error = bindingResult.getAllErrors().get(0);
            return ResponseEntity.status(400).body(error.getDefaultMessage()+", rejectedValue = "+endUserDTO.getPesel());
        }
        return new ResponseEntity(endUserService.save(endUserDTO), HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<EndUserDTO>> getEndUsers(){
        return ResponseEntity.ok(endUserService.getAll());
    }

    @GetMapping("/find/{pesel}")
    public ResponseEntity findEndUserByPesel(@PathVariable String pesel){
        EndUserDTO endUserDTO = endUserService.findByPesel(pesel);
        if(endUserDTO == null){
            return new ResponseEntity(endUserDTO, HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(endUserService.findByPesel(pesel));
    }

}
