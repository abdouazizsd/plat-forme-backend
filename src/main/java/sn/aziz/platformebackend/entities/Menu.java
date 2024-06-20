package sn.aziz.platformebackend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "TP_Menu")
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    private static final long serialVersionUID = 1071795283000704295L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Men_Id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "Men_Libelle")
    private String libelle;


    @Column(name = "Men_Code")
    private String code;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "tr_profil_menu",
            joinColumns = @JoinColumn(name = "menu_id"),
            inverseJoinColumns = @JoinColumn(name = "profil_id"))
    private Set<Profil> profils = new HashSet<>();

    @Column(name = "Men_Icon_Lock")
    private String iconLock;

    @Column(name = "Men_Icon_Unlock")
    private String iconUnlock;

    @Column(name = "Men_Route")
    private String route;

    @Column(name = "Men_ParentId")
    private Integer parentID;

    @Column(name = "Men_Priorite")
    private Integer priorite;

    @Column(name = "Men_Pro_Id")
    private Integer profil;

    @Column(name = "Men_Type")
    private String type;

    @Column(name = "Men_Ab")
    private String ab;

    @Column(name = "Men_Collapse")
    private String collapse;




    public Menu(Long id, String libelle, String code, Integer parendId, Integer profilId) {
        this.id = id;
        this.libelle = libelle;
        this.code = code;
        this.parentID = parendId;
        this.profil = profilId;

    }

    public  void addProfil(Profil profil){
        this.profils.add(profil);
    }
}
