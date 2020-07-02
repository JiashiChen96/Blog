package com.jason.blog.service;

import com.jason.blog.po.User;

public interface UserService {
    User checkUser(String username, String password);
}
