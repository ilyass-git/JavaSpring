package emsi.ma.javaspring.service;

import emsi.ma.javaspring.domain.entity.UTILISATEURS.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    User create(User user);

    Optional<User> getById(Long id);

    Optional<User> getByEmail(String email);

    List<User> getAll();

    User update(Long id, User user);

    void delete(Long id);
}
