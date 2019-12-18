package kalinowski.krzysztof.restservices.service;

import kalinowski.krzysztof.restservices.api.model.EndUserDTO;

import java.util.List;

/**
 * Created by Krzysztof Kalinowski on 17/12/2019.
 */

public interface EndUserService {

    List<EndUserDTO> getAll();

    EndUserDTO findByPesel(String pesel);

    EndUserDTO save(EndUserDTO endUserDTO);
}
