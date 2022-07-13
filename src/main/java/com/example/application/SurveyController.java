package com.example.application;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/survey")
public class SurveyController {
  
  @GetMapping("/form")
  public String form(SurveyForm surveyForm,
  Model m,
  @ModelAttribute("complete") String complete
  ) {
    m.addAttribute("title", "Survey Form");

    return "/exform";
  }
}
