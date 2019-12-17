package kalinowski.krzysztof.restservices.repository;

import kalinowski.krzysztof.restservices.domain.EndUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by Krzysztof Kalinowski on 17/12/2019.
 */

public interface EndUserRepository extends JpaRepository<EndUser, Long> {

    Optional<EndUser> findByPesel(String pesel);
}
