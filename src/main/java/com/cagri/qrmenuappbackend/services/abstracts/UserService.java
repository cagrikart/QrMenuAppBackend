package com.cagri.qrmenuappbackend.services.abstracts;

import com.cagri.qrmenuappbackend.core.utilities.results.DataResult;
import com.cagri.qrmenuappbackend.core.utilities.results.Result;
import com.cagri.qrmenuappbackend.entities.User;

import java.util.List;

public interface UserService {
    DataResult<List<User>> getListUser();
    Result addUser();

}