package com.example.application;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample")
public class SampleController {

  private final JdbcTemplate jdbcTemplate; //final：クラスが派生しないようにする修飾子（元のクラスをいじれないように設定）

  @Autowired
  public SampleController(JdbcTemplate jdbcTemplate) { //JdbcTemplate：JDBCの使用を簡素化し、一般的なエラーの回避に役立つ
    this.jdbcTemplate = jdbcTemplate;
  }

  @GetMapping("/test")
  public String test(Model m) {

    String sql = "SELECT id, name, email FROM inquiry WHERE id = 1";

    Map<String, Object> map = jdbcTemplate.queryForMap(sql); //Map：キーと値の2つの要素をペアにして格納するデータ構造

    m.addAttribute("title", "Inquiry Form");
    m.addAttribute("name", map.get("name"));
    m.addAttribute("email", map.get("email"));

    return "test";
  }
  
}
