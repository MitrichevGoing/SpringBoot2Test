package com.cjj.service.impl;

import com.cjj.dao.UserMapper;
import com.cjj.domain.bean.User;
import com.cjj.domain.model.UserModel;
import com.cjj.service.UserService;
import com.fasterxml.jackson.databind.util.BeanUtil;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Resource
  private UserMapper userMapper;

  @Override
  public List<UserModel> listUserByExample(UserModel model) {
    return null;
  }

  @Override
  public UserModel getUserById(Long userId) {
    User user = userMapper.selectByPrimaryKey(userId);
    UserModel userModel = new UserModel();
    BeanUtils.copyProperties(user, userModel,UserModel.class);
    return userModel;
  }
}
