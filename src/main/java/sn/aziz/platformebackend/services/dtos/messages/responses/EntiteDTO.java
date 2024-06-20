package sn.aziz.platformebackend.services.dtos.messages.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@ToString
//exclure les propriétés ayant des valeurs nulles / vides ou par défaut.
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EntiteDTO implements Serializable {

    private static final long serialVersionUID = -7533801549141608001L;
    private Integer id;
    private String libelle;
    private String code;
    private String iconLock;
    private String iconUnlock;
    private String ab;
    private String type;
    private String collapse;
    private String route;
    private Integer parentID;
    private Integer priorite;
    private List<MenuDTO> enfants = new ArrayList<>();

}
