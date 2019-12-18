package kalinowski.krzysztof.restservices.bootstrap;

import kalinowski.krzysztof.restservices.domain.EndUser;
import kalinowski.krzysztof.restservices.repository.EndUserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Krzysztof Kalinowski on 17/12/2019.
 */

//@Component
public class Bootstrap implements CommandLineRunner {

    private final EndUserRepository endUserRepository;

    public Bootstrap(EndUserRepository endUserRepository) {
        this.endUserRepository = endUserRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if(endUserRepository.count() == 0){

            EndUser eu1 = new EndUser();
            eu1.setFirstName("Test");
            eu1.setLastName("User");
            eu1.setPesel("02070803628");
            endUserRepository.save(eu1);

            System.out.println("Data Loaded: "+endUserRepository.count());
        }


    }
}
