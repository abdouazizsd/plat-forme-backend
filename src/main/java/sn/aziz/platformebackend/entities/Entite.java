package sn.aziz.platformebackend.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;
import sn.aziz.platformebackend.entities.audit.Auditable;

import java.io.Serializable;
import java.util.Objects;
@Entity
@Table(name = "TP_Entite")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Entite extends Auditable<Long> implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ent_id")
    private Long id;

    @Column(name = "ent_libelle", length = 20)
    private String libelle;

    @Column(name = "ent_code", length = 10)
    private String code;

    @Column(name = "ent_description")
    private String description;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Entite entite = (Entite) o;
        return id != null && Objects.equals(id, entite.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
