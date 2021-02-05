package be.hvwebsites.catalogus.repositories;

import be.hvwebsites.catalogus.domain.Artikel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtikelRepository extends JpaRepository<Artikel, Long> {
}
