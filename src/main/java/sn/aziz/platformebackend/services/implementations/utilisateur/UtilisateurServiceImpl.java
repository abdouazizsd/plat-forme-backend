package sn.aziz.platformebackend.services.implementations.utilisateur;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import sn.aziz.platformebackend.entities.Utilisateur;
import sn.aziz.platformebackend.repositories.EntiteRepository;
import sn.aziz.platformebackend.repositories.ProfilRepository;
import sn.aziz.platformebackend.repositories.UtilisateurRepository;
import sn.aziz.platformebackend.services.implementations.dtos.messages.responses.UtilisateurDTO;
import sn.aziz.platformebackend.services.interfaces.utilisateur.UtilisateurService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UtilisateurServiceImpl implements UtilisateurService {
    private static final Logger logger = LoggerFactory.getLogger(UtilisateurServiceImpl.class);
    private final UtilisateurRepository utilisateurRepository;
    private final EntiteRepository entiteRepository;
    private final ProfilRepository profilRepository;
    @Override
    public boolean addNewUser(UtilisateurDTO user) {
        return false;
    }

    @Override
    public List<Utilisateur> listUtilisateur() {
        return null;
    }

    @Override
    public UtilisateurDTO getUserById(Long idUser) {
        return null;
    }

    @Override
    public UtilisateurDTO updateUser(UtilisateurDTO user) {
        return null;
    }

    @Override
    public Utilisateur getUtilisateurEmail(String email) {
        return null;
    }

    @Override
    public Utilisateur getUserId(Long id) {
        return null;
    }

    @Override
    public boolean activerDesactiverUser(Long id) {
        return false;
    }

    @Override
    public List<Utilisateur> listUtilisateurByEntiteId(Long entiteId) {
        return null;
    }
}
