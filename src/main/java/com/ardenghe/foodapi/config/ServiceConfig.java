package com.ardenghe.foodapi.config;

import com.ardenghe.foodapi.di.notificacao.NotificadorEmail;
import com.ardenghe.foodapi.di.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public AtivacaoClienteService ativacao(NotificadorEmail notificadorEmail) {
        return new AtivacaoClienteService(notificadorEmail);
    }

}
