package sn.aziz.platformebackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.aziz.platformebackend.entities.Menu;
import sn.aziz.platformebackend.entities.Profil;

import java.util.List;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {
    List<Menu> findByProfilsContains(Profil profil);
    List<Menu> findByParentID(Integer parentID);
}
