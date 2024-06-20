package sn.aziz.platformebackend.services.implementations.dtos.messages.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;
import sn.aziz.platformebackend.entities.Entite;
import sn.aziz.platformebackend.entities.Profil;

import java.io.Serializable;
@Data
@Accessors(chain = true)
@NoArgsConstructor
@ToString
//exclure les propriétés ayant des valeurs nulles / vides ou par défaut.
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthenticatedUserInfosDTO implements Serializable {
    private static final long serialVersionUID = 7303407340028986510L;

    private Integer id;
    private String nom;
    private String prenom;
    private String telephone;
    private String email;
    private String login;
    private Profil linkedProfil;
    private Boolean status;
    private Entite entite;
}
