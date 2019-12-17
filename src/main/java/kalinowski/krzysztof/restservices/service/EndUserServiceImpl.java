package kalinowski.krzysztof.restservices.service;

import kalinowski.krzysztof.restservices.api.model.EndUserDTO;
import kalinowski.krzysztof.restservices.converter.EndUserDTOToEndUser;
import kalinowski.krzysztof.restservices.converter.EndUserToEndUserDTO;
import kalinowski.krzysztof.restservices.domain.EndUser;
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
    private final EndUserDTOToEndUser endUserDTOToEndUser;

    public EndUserServiceImpl(EndUserRepository endUserRepository, EndUserToEndUserDTO endUserToEndUserDTO, EndUserDTOToEndUser endUserDTOToEndUser) {
        this.endUserRepository = endUserRepository;
        this.endUserToEndUserDTO = endUserToEndUserDTO;
        this.endUserDTOToEndUser = endUserDTOToEndUser;
    }

    @Override
    public List<EndUserDTO> getAll() {
        return endUserRepository.findAll()
                .stream()
                .map(endUserToEndUserDTO::convert)
                .collect(Collectors.toList());
    }

    @Override
    public EndUserDTO findByPesel(String pesel) {
        return endUserToEndUserDTO.convert(endUserRepository.findByPesel(pesel));
    }

    @Override
    public EndUserDTO save(EndUserDTO endUserDTO) {
        EndUser endUser = endUserDTOToEndUser.convert(endUserDTO);
        EndUser savedUser = endUserRepository.save(endUser);
        return endUserToEndUserDTO.convert(savedUser);
    }
}
