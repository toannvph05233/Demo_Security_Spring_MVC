package codegym.repository;

import codegym.model.AppUser;
import org.springframework.data.repository.CrudRepository;

public interface IAppUserRepo extends CrudRepository<AppUser,Long> {
    AppUser findByUsername(String username);
}
