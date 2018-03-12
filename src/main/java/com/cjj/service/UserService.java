package com.cjj.service;

import com.cjj.dao.UserMapper;
import com.cjj.domain.model.UserModel;
import java.util.List;

public interface UserService {

  List<UserModel> listUserByExample(UserModel model);

  UserModel getUserById(Long userId);

}
