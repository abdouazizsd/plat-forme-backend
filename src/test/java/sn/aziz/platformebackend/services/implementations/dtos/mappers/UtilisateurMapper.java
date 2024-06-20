package sn.aziz.platformebackend.services.implementations.dtos.mappers;

import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;
import org.springframework.web.bind.annotation.Mapping;
import sn.aziz.platformebackend.entities.Utilisateur;
import sn.aziz.platformebackend.services.implementations.dtos.messages.responses.AuthenticatedUserInfosDTO;
import sn.aziz.platformebackend.services.implementations.dtos.messages.responses.UtilisateurDTO;
@Mapper
@DecoratedWith(UtilisateurMapperDecorator.class)
public interface UtilisateurMapper {
    AuthenticatedUserInfosDTO utilisateurToAuthenticatedUserInfosDTO(Utilisateur utilisateur);
    Utilisateur authenticatedUserInfosDTOToUtilisateurTo(UtilisateurDTO utilisateurDTO);
}
