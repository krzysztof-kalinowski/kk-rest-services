package kalinowski.krzysztof.restservices.service;

import kalinowski.krzysztof.restservices.api.model.EndUserDTO;
import kalinowski.krzysztof.restservices.converter.EndUserToEndUserDTO;
import kalinowski.krzysztof.restservices.repository.EndUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Krzysztof Kalinowski on 17/12/2019.
 */
@Service
public class EndUserServiceImpl implements EndUserService {

    private final EndUserRepository endUserRepository;
    private final EndUserToEndUserDTO endUserToEndUserDTO;

    public EndUserServiceImpl(EndUserRepository endUserRepository, EndUserToEndUserDTO endUserToEndUserDTO) {
        this.endUserRepository = endUserRepository;
        this.endUserToEndUserDTO = endUserToEndUserDTO;
    }

    @Override
    public List<EndUserDTO> getUsers() {
        return endUserRepository.findAll().stream()
                .map(endUserToEndUserDTO::convert)
                .collect(Collectors.toList());
    }

    @Override
    public EndUserDTO findByPesel(String pesel) {
        return endUserToEndUserDTO.convert(endUserRepository.findByPesel(pesel));
    }
}
