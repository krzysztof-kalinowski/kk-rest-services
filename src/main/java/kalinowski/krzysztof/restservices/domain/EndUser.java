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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    @Column(unique = true, length = 11)
    private String pesel;
}
