package com.example.springeventdemo.service;

import com.example.springeventdemo.entity.EmailDTO;

/**
 * @author DengLei
 * @date 2023/11/07 10:59
 */
public interface SendEmailService {

  void sendEmail(EmailDTO emailDTO);
}
