package com.ardenghe.foodapi.di.notificacao;

import com.ardenghe.foodapi.di.model.Cliente;
import lombok.Setter;

public class NotificadorEmail implements Notificador {

    @Setter
    private boolean caixaAlta;

    private String hostServidorSmtp;

    public NotificadorEmail(String hostServidorSmtp) {
        this.hostServidorSmtp = hostServidorSmtp;

        System.out.println("NotificadorEmail");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        if (this.caixaAlta) {
            mensagem = mensagem.toUpperCase();
        }

        System.out.printf("Notificando: %s através do e-mail %s: %s SMTP %s \n",
                cliente.getNome(), cliente.getEmail(), mensagem, hostServidorSmtp);
    }

}
