package web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.model.Role;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

    @Override
    <S extends Role> List<S> saveAll(Iterable<S> entities);

    Role findByName(String name);
}
