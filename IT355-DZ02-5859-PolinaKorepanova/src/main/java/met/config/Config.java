package met.config;
import met.service.OblikServis;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public OblikServis oblikServis() {
        return new OblikServis();
    }
}