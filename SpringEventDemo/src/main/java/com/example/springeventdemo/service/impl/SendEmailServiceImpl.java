package com.example.springeventdemo.service.impl;

import com.example.springeventdemo.entity.EmailDTO;
import com.example.springeventdemo.service.SendEmailService;
import org.springframework.stereotype.Service;

/**
 * @author DengLei
 * @date 2023/11/07 10:59
 */
@Service
public class SendEmailServiceImpl implements SendEmailService {

  @Override
  public void sendEmail(EmailDTO emailDto) {
    try {
      // 模拟耗时3秒
      Thread.sleep(3 * 1000);
    } catch (Exception e) {
      System.out.println("Email发送异常");
    }

    System.out.println("Email发送成功 " + emailDto);
  }
}
