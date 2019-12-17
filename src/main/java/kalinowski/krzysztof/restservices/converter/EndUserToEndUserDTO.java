package kalinowski.krzysztof.restservices.converter;

import com.sun.istack.Nullable;
import kalinowski.krzysztof.restservices.api.model.EndUserDTO;
import kalinowski.krzysztof.restservices.domain.EndUser;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


/**
 * Created by Krzysztof Kalinowski on 17/12/2019.
 */

@Component
public class EndUserToEndUserDTO implements Converter<EndUser, EndUserDTO> {

    @Synchronized
    @Nullable
    @Override
    public EndUserDTO convert(EndUser source) {
        if(source == null){
            return null;
        }
        final EndUserDTO endUserDTO = new EndUserDTO();
        endUserDTO.setUserId(source.getUserId());
        endUserDTO.setFirstName(source.getFirstName());
        endUserDTO.setLastName(source.getLastName());
        endUserDTO.setPesel(source.getPesel());

        return endUserDTO;
    }
}
