package be.hvwebsites.catalogus.services;

import be.hvwebsites.catalogus.domain.Artikel;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;

public interface ArtikelService {
    void create(Artikel artikel);

    @Bean
    Jackson2JsonMessageConverter converter(){
        return new Jackson2JsonMessageConverter();
    }
}
