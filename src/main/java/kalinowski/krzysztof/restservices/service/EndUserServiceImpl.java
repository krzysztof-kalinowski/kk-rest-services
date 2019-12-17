package kalinowski.krzysztof.restservices.service;

import kalinowski.krzysztof.restservices.domain.EndUser;
import kalinowski.krzysztof.restservices.repository.EndUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Krzysztof Kalinowski on 17/12/2019.
 */
@Service
public class EndUserServiceImpl implements EndUserService {

    private final EndUserRepository endUserRepository;

    public EndUserServiceImpl(EndUserRepository endUserRepository) {
        this.endUserRepository = endUserRepository;
    }

    @Override
    public List<EndUser> getUsers() {
        return endUserRepository.findAll();
    }

    @Override
    public EndUser findByPesel(String pesel) {
        return endUserRepository.findByPesel(pesel).get();
    }
}
