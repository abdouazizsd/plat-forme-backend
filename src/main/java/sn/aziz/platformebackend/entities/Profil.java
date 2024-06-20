package sn.aziz.platformebackend.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
//@RequiredArgsConstructor
@Entity
@Table(name = "TP_Profil")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Profil implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pro_id", updatable = false, nullable = false)
    private Long id;


    @Column(name = "pro_code")
    private String code;

    @Column(name = "pro_libelle")
    private String libelle;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Profil profil = (Profil) o;
        return id != null && Objects.equals(id, profil.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
