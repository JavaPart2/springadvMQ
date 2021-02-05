package be.hvwebsites.catalogus.services;

import be.hvwebsites.catalogus.domain.Artikel;
import be.hvwebsites.catalogus.events.ArtikelGemaakt;
import be.hvwebsites.catalogus.repositories.ArtikelRepository;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DefaultArtikelService implements ArtikelService{
    private final ArtikelRepository repository;
    private final AmqpTemplate template;

    public DefaultArtikelService(ArtikelRepository repository, AmqpTemplate template) {
        this.repository = repository;
        this.template = template;
    }

    @Override
    public void create(Artikel artikel) {
        repository.save(artikel);
        template.convertAndSend("catalogus", null, new ArtikelGemaakt(artikel));
    }
}
