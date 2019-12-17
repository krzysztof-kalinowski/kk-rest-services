package kalinowski.krzysztof.restservices.service;

import kalinowski.krzysztof.restservices.domain.EndUser;

import java.util.List;

/**
 * Created by Krzysztof Kalinowski on 17/12/2019.
 */

public interface EndUserService {
    List<EndUser> getUsers();
    EndUser findByPesel(String pesel);
}
