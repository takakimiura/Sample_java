package com.example.application;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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

  @PostMapping("/form")
  public String formBack(SurveyForm surveyForm, Model m) {

    m.addAttribute("title", "Survey Form");

    return "/exform";
  }

  @PostMapping("/confirm")
  public String confirm(@Validated SurveyForm surveyForm,
  BindingResult result,
  Model m
  ) {

    if(result.hasErrors()) {
      m.addAttribute("title", "Survey Form");

      return "/exform";
    }

    m.addAttribute("title", "Confirm Page");

    return "/exconfirm";
  }
}
