package com.vn.htl.back_end.service;

import com.vn.htl.back_end.model.User;

import java.util.List;

public class UserService implements IUserService{
    @Override
    public User registerUser(User user) {
        return null;
    }

    @Override
    public List<User> getUsers() {
        return List.of();
    }

    @Override
    public void deleteUser(String email) {

    }

    @Override
    public User getUser(String email) {
        return null;
    }
}
