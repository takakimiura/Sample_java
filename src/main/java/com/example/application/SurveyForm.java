package com.example.application;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class SurveyForm {
  
  @Min(0) @Max(150)
  private int age;

  private int satisfaction;

  @Size(min = 1, max = 200, message = "1~200文字までで入力してください")
  private String comment;

  public SurveyForm() {
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getSatisfaction() {
    return satisfaction;
  }

  public void setSatisfaction(int satisfaction) {
    this.satisfaction = satisfaction;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  

}
