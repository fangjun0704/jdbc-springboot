package com.company.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @Autowired
  private JdbcTemplate jdbcTemplate;

  @RequestMapping(value = "/user")
  public Object user() {
    return jdbcTemplate.queryForList("SELECT * FROM t_user");
  }

}
