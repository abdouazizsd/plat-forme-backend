package sn.aziz.platformebackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.aziz.platformebackend.entities.Utilisateur;

import java.util.List;
import java.util.Optional;
@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    Optional<Utilisateur> findUtilisateurByEmail(String username);
    Optional<Utilisateur> findUtilisateurByEmailAndPassword(String username, String password);
    Boolean existsByEmail(String email);
    List<Utilisateur> findUtilisateurByEntite_Id(Long entieId);
}
