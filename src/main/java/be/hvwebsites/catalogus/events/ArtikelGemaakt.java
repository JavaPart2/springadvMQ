package be.hvwebsites.catalogus.events;

import be.hvwebsites.catalogus.domain.Artikel;

public class ArtikelGemaakt {
    private final long id;
    private final String naam;

    public ArtikelGemaakt(Artikel artikel) {
        this.naam = artikel.getNaam();
        this.id = artikel.getId();
    }

    public long getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }
}
