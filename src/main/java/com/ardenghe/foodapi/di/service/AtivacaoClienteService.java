package com.ardenghe.foodapi.di.service;

import com.ardenghe.foodapi.di.model.Cliente;
import com.ardenghe.foodapi.di.notificacao.NotificadorEmail;

public class AtivacaoClienteService {

    private NotificadorEmail notificador;


    public AtivacaoClienteService(NotificadorEmail notificador) {
        this.notificador = notificador;

        System.out.println("AtivacaoClienteService" + this.notificador);
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();

        this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}
