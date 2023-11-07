package com.example.springeventdemo.entity;

import lombok.Data;

/**
 * @author DengLei
 * @date 2023/11/07 11:08
 */
@Data
public class EmailDTO {
  private String email;
  private String subject;
  private String content;
}
