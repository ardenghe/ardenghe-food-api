package com.ardenghe.foodapi.di.service;

import com.ardenghe.foodapi.di.model.Cliente;
import com.ardenghe.foodapi.di.notificacao.NivelUrgencia;
import com.ardenghe.foodapi.di.notificacao.Notificador;
import com.ardenghe.foodapi.di.notificacao.TipoDoNotificador;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    @TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
    @Autowired
    private Notificador notificador;

    @PostConstruct
    public void init() {
        System.out.println("Iniciando notificador...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy notificador...");
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();
        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");

    }
}
