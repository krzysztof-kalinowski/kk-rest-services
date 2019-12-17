package kalinowski.krzysztof.restservices.bootstrap;

import kalinowski.krzysztof.restservices.domain.EndUser;
import kalinowski.krzysztof.restservices.repository.EndUserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Krzysztof Kalinowski on 17/12/2019.
 */

@Component
public class Bootstrap implements CommandLineRunner {

    private EndUserRepository endUserRepository;

    public Bootstrap(EndUserRepository endUserRepository) {
        this.endUserRepository = endUserRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if(endUserRepository.count() == 0){

            EndUser eu1 = new EndUser();
            eu1.setFirstName("Krzysztof");
            eu1.setLastName("Kalinowski");
            eu1.setPesel("555");

            EndUser eu2 = new EndUser();
            eu2.setFirstName("Marek");
            eu2.setLastName("Kalinowski");
            eu2.setPesel("666");

            EndUser eu3 = new EndUser();
            eu3.setFirstName("Sabina");
            eu3.setLastName("Hrabina");
            eu3.setPesel("777");

            endUserRepository.save(eu1);
            endUserRepository.save(eu2);
            endUserRepository.save(eu3);

            System.out.println("Data Loaded: "+endUserRepository.count());
        }


    }
}
