package sn.aziz.platformebackend.services.implementations.dtos.mappers;

import org.springframework.stereotype.Component;
import org.modelmapper.ModelMapper;
import sn.aziz.platformebackend.entities.Utilisateur;
import sn.aziz.platformebackend.services.implementations.dtos.messages.responses.UtilisateurDto;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class UtilisateurMapperDto {
    public static UtilisateurDto toUtilisateurDTO(Utilisateur utilisateur){
        return new ModelMapper().map(utilisateur, UtilisateurDto.class);
    }

    public static Utilisateur toUtilisateur(UtilisateurDto utilisateurDTO){
        return new ModelMapper().map(utilisateurDTO, Utilisateur.class);
    }

    public List<UtilisateurDto> utilisateurToUtilisateurDTO(List<Utilisateur> utilisateurs){
        return utilisateurs.stream()
                .filter(Objects::nonNull)
                .map(UtilisateurMapperDto::toUtilisateurDTO)
                .collect(Collectors.toList());
    }

    public List<Utilisateur>  utilisateurDTOToutilisateur(List<UtilisateurDto> utilisateurDTOS){
        return utilisateurDTOS.stream()
                .filter(Objects::nonNull)
                .map(UtilisateurMapperDto::toUtilisateur)
                .collect(Collectors.toList());
    }

}
