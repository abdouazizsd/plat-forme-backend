package sn.aziz.platformebackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.aziz.platformebackend.entities.Entite;


@Repository
public interface EntiteRepository extends JpaRepository<Entite, Long> {

}
