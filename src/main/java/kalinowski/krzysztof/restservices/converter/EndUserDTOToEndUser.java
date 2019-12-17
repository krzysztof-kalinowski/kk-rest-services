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
public class EndUserDTOToEndUser implements Converter<EndUserDTO, EndUser> {

    @Synchronized
    @Nullable
    @Override
    public EndUser convert(EndUserDTO source) {
        if(source == null){
            return null;
        }
        final EndUser endUser = new EndUser();
        endUser.setFirstName(source.getFirstName());
        endUser.setLastName(source.getLastName());
        endUser.setPesel(source.getPesel());

        return endUser;
    }
}
