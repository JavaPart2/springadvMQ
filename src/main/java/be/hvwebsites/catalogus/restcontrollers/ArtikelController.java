package be.hvwebsites.catalogus.restcontrollers;

import be.hvwebsites.catalogus.domain.Artikel;
import be.hvwebsites.catalogus.services.ArtikelService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/artikels")
public class ArtikelController {
    private final ArtikelService service;

    public ArtikelController(ArtikelService service) {
        this.service = service;
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    void post(@RequestBody String naam){
        service.create(new Artikel(naam));
    }
}
