package com.ardenghe.foodapi.config;

import com.ardenghe.foodapi.di.notificacao.NotificadorEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificacaoConfig {

    @Bean
    public NotificadorEmail notificadorEmail() {
        NotificadorEmail notificadorEmail = new NotificadorEmail("smtp.ardenghemail.com.br");
        notificadorEmail.setCaixaAlta(true);
        return notificadorEmail;
    }


}
