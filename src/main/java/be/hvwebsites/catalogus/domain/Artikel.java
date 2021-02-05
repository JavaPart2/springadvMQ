package be.hvwebsites.catalogus.domain;


import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "artikels")
public class Artikel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String naam;
    private LocalDateTime gemaakt;

    public Artikel(String naam) {
        this.naam = naam;
    }

    protected Artikel() {
    }

    public long getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public LocalDateTime getGemaakt() {
        return gemaakt;
    }
}
