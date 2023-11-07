package com.example.springeventdemo.controller;

import com.example.springeventdemo.entity.EmailDTO;
import com.example.springeventdemo.event.SendEmailEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DengLei
 * @date 2023/11/07 11:07
 */
@RestController
public class IndexController {

  @Autowired private ApplicationEventPublisher publisher;

  @GetMapping("/sendEmail")
  public String sendEmail() {

    EmailDTO emailDTO = new EmailDTO();
    emailDTO.setEmail("denglei@gamil.com");
    emailDTO.setSubject("主题");
    emailDTO.setContent("这是内容");
    publisher.publishEvent(new SendEmailEvent(emailDTO));
    return "success";
  }
}
