package kalinowski.krzysztof.restservices.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Krzysztof Kalinowski on 17/12/2019.
 */

@Data
@Entity
public class EndUser {

    @NotNull
    @Column(length = 50)
    private String firstName;

    @NotNull
    @Column(length = 50)
    private String lastName;

    @Id
    @NotNull
    @Column(unique = true, length = 11)
    private String pesel;
}
