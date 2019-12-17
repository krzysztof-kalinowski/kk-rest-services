package kalinowski.krzysztof.restservices.api.model;

import lombok.Data;

/**
 * Created by Krzysztof Kalinowski on 17/12/2019.
 */
@Data
public class EndUserDTO {
    private Long userId;
    private String firstName;
    private String lastName;
    private String pesel;
}
