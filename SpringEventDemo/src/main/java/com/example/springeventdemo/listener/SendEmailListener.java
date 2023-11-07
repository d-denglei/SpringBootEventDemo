package com.example.springeventdemo.listener;

import com.example.springeventdemo.entity.EmailDTO;
import com.example.springeventdemo.event.SendEmailEvent;
import com.example.springeventdemo.service.SendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author DengLei
 * @date 2023/11/07 11:11
 */
@Component
// public class SendEmailListener implements ApplicationListener<SendEmailEvent> {
public class SendEmailListener {

  @Autowired private SendEmailService sendEmailService;

  // 可以用@EventListener 也可以通过实现接口
  @EventListener
  public void onApplicationEvent(SendEmailEvent sendEmailEvent) {
    EmailDTO emailDTO = sendEmailEvent.getEmailDTO();
    System.out.println("111");
    sendEmailService.sendEmail(emailDTO);
    System.out.println("222");
  }
}
