package kalinowski.krzysztof.restservices.api.model;

import lombok.Data;
import org.hibernate.validator.constraints.pl.PESEL;

/**
 * Created by Krzysztof Kalinowski on 17/12/2019.
 */
@Data
public class EndUserDTO {
    private String firstName;
    private String lastName;
    @PESEL
    private String pesel;
}
