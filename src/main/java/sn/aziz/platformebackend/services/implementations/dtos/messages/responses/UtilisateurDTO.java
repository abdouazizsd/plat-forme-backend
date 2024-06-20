package sn.aziz.platformebackend.services.implementations.dtos.messages.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;
import sn.aziz.platformebackend.entities.Entite;
import sn.aziz.platformebackend.entities.Profil;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@ToString
//exclure les propriétés ayant des valeurs nulles / vides ou par défaut.
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UtilisateurDTO {

    private Long id;
    private String nom;
    private String prenom;
    private String telephone;
    private String email;
    private String login;
    private Profil linkedProfil;
    private Boolean status;
    private Entite entite;
}
