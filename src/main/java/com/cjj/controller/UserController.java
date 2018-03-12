package com.cjj.controller;

import com.cjj.domain.model.UserModel;
import com.cjj.service.UserService;
import com.cjj.utils.web.Result;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
public class UserController {

  @Resource
  private UserService userService;

  @GetMapping("/{userId}")
  public Result getUserById(@PathVariable Long userId){
    UserModel userModel = userService.getUserById(userId);

    return Result.builder().ok("ok").data(userModel).build();
  }

  @GetMapping("/flux/{user}")
  public Mono<UserModel> getUser(@PathVariable Long user) {
    UserModel userModel = userService.getUserById(user);
    return Mono.just(userModel);
  }

}
