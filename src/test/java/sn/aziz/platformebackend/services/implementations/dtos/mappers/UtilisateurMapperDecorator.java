package sn.aziz.platformebackend.services.implementations.dtos.mappers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import sn.aziz.platformebackend.entities.Utilisateur;
import sn.aziz.platformebackend.services.implementations.dtos.messages.responses.AuthenticatedUserInfosDTO;
import sn.aziz.platformebackend.services.implementations.dtos.messages.responses.UtilisateurDTO;
@Slf4j
public class UtilisateurMapperDecorator implements UtilisateurMapper{
    private UtilisateurMapper utilisateurMapper;

    @Autowired
    public UtilisateurMapperDecorator(UtilisateurMapper utilisateurMapper) {
        this.utilisateurMapper = utilisateurMapper;
    }

    @Override
    public AuthenticatedUserInfosDTO utilisateurToAuthenticatedUserInfosDTO(Utilisateur utilisateur) {
        return utilisateurMapper.utilisateurToAuthenticatedUserInfosDTO(utilisateur);
    }

    @Override
    public Utilisateur authenticatedUserInfosDTOToUtilisateurTo(UtilisateurDTO authentificationUserDTO) {
        return utilisateurMapper.authenticatedUserInfosDTOToUtilisateurTo(authentificationUserDTO);
    }
}
