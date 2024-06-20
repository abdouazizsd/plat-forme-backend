package sn.aziz.platformebackend.services.interfaces.utilisateur;

import sn.aziz.platformebackend.entities.Utilisateur;
import sn.aziz.platformebackend.services.implementations.dtos.messages.responses.UtilisateurDTO;

import java.util.List;

public interface UtilisateurService {

    boolean addNewUser(UtilisateurDTO user);
    List<Utilisateur> listUtilisateur();
    UtilisateurDTO getUserById(Long idUser);
    UtilisateurDTO updateUser(UtilisateurDTO user);
    Utilisateur getUtilisateurEmail(String email);
    Utilisateur getUserId(Long id);
    boolean activerDesactiverUser(Long id);
    List<Utilisateur> listUtilisateurByEntiteId(Long entiteId);
}
