package com.ardenghe.foodapi.di.notificacao;

import com.ardenghe.foodapi.di.model.Cliente;

public class NotificadorSMS implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.println("Notificando: " + cliente.getNome() + " por SMS do telefone "
                + cliente.getTelefone() + " - " + mensagem);
    }
}
