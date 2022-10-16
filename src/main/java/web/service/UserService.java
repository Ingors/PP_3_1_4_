package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    void saveUser(User user);
    void deleteById(Integer id);

    User findByEmail(String email);
    User findById(Integer id);

    void updateUser(User user);


}
