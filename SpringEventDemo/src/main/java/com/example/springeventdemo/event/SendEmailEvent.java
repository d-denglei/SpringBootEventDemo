package com.example.springeventdemo.event;

import com.example.springeventdemo.entity.EmailDTO;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * @author DengLei
 * @date 2023/11/07 11:09
 */
@Getter
public class SendEmailEvent extends ApplicationEvent {
  private static final long serialVersionUID = 6295863528964773978L;
    private EmailDTO emailDTO;

    public SendEmailEvent(EmailDTO emailDTO) {
        super(emailDTO);
        this.emailDTO = emailDTO;
    }
}
