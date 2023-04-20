package com.cagri.qrmenuappbackend.services.concrete;

import com.cagri.qrmenuappbackend.core.utilities.results.DataResult;
import com.cagri.qrmenuappbackend.core.utilities.results.Result;
import com.cagri.qrmenuappbackend.entities.User;
import com.cagri.qrmenuappbackend.repository.UserRepository;
import com.cagri.qrmenuappbackend.services.abstracts.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceİmpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public DataResult<List<User>> getListUser() {
        return null;
    }

    @Override
    public Result addUser() {
        return null;
    }
}
