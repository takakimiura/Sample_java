package com.example.application;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class InquiryForm {
  
  @Size(min = 1, max = 20, message = "1~20文字までで入力してください")
  private String name;

  @NotEmpty
  @Email(message = "メールアドレスを入力してください")
  private String email;

  @NotEmpty
  private String contents;

  

  public InquiryForm() {
    
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getContents() {
    return contents;
  }
  public void setContents(String contents) {
    this.contents = contents;
  }

}
