package service;

import model.User;

import java.util.List;

public interface IUserService {
    List<User> selectAllUsers();
    void addUserTransaction(User user, int[] permision);

}
