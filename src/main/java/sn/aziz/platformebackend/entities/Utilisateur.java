package sn.aziz.platformebackend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import sn.aziz.platformebackend.entities.audit.Auditable;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "TD_Utilisateur")
@Data
public class Utilisateur extends Auditable<Integer> implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "uti_id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "uti_nom")
    private String nom;

    @Column(name = "uti_prenom", nullable = false)
    private String prenom;

    @Column(name = "uti_email")
    private String email;

    @Column(name = "uti_password")
    private String password;

    @Column(name = "uti_first_log")
    private Boolean firstLog;

    @Column(name = "uti_status")
    private Boolean status;


    @Column(name = "uti_telephone")
    private String telephone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "uti_linked_profil")
    private Profil linkedProfil;

    @OneToOne
    private Entite entite;
}
