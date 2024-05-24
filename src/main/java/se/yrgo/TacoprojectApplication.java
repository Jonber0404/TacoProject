package se.yrgo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import se.yrgo.data.TacoRepository;
import se.yrgo.domain.Taco;
import se.yrgo.domain.Tortilla;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class TacoprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(TacoprojectApplication.class, args);
    }

    @Bean
    public CommandLineRunner dataLoader(TacoRepository tacoRepo) {
        return args -> {
            if (tacoRepo.count() == 0) {
                Taco taco1 = new Taco();
                taco1.setName("FishTaco");
                taco1.setMeat(0);
                taco1.setChicken(0);
                taco1.setFish(100);
                taco1.setBeans(0);
                taco1.setCheese(20);
                taco1.setCucumber(15);
                taco1.setSauce(10);
                taco1.setCorn(5);
                taco1.setTortillaSize(Tortilla.LARGE);
                taco1.setSize(100);
                taco1.calculateWeight();
                tacoRepo.save(taco1);

                Taco taco2 = new Taco();
                taco2.setName("MeatTaco");
                taco2.setMeat(100);
                taco2.setChicken(0);
                taco2.setFish(0);
                taco2.setBeans(0);
                taco2.setCheese(55);
                taco2.setCucumber(0);
                taco2.setSauce(50);
                taco2.setCorn(0);
                taco2.setTortillaSize(Tortilla.LARGE);
                taco2.setSize(100);
                taco2.calculateWeight();
                tacoRepo.save(taco2);

                Taco taco3 = new Taco();
                taco3.setName("BeanTaco");
                taco3.setMeat(0);
                taco3.setChicken(0);
                taco3.setFish(0);
                taco3.setBeans(50);
                taco3.setCheese(30);
                taco3.setCucumber(10);
                taco3.setSauce(15);
                taco3.setCorn(20);
                taco3.setTortillaSize(Tortilla.MEDIUM);
                taco3.setSize(100);
                taco3.calculateWeight();
                tacoRepo.save(taco3);

                Taco taco4 = new Taco();
                taco4.setName("MixedTaco");
                taco4.setMeat(25);
                taco4.setChicken(25);
                taco4.setFish(25);
                taco4.setBeans(25);
                taco4.setCheese(10);
                taco4.setCucumber(10);
                taco4.setSauce(10);
                taco4.setCorn(10);
                taco4.setTortillaSize(Tortilla.LARGE);
                taco4.setSize(100);
                taco4.calculateWeight();
                tacoRepo.save(taco4);
            };
        };
    }

}