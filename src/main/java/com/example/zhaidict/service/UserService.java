package com.example.zhaidict.service;

import com.example.zhaidict.pojo.User;

public interface UserService {
    User get(int id);
    void update(User user);
}
