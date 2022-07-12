package com.example.application;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample")
public class SampleController {

  @GetMapping("/test")
  public String test(Model m) {
    m.addAttribute("title", "Inquiry Form");

    return "test";
  }
  
}
