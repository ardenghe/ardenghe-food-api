package com.ardenghe.foodapi.di.notificacao;

import com.ardenghe.foodapi.di.model.Cliente;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NoticadorEmailMock implements Notificador {

    public NoticadorEmailMock() {
        System.out.println("NoticadorEmail Mock");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("MOCK: Notificação seria enviada para %s através do e-mail %s: %s\n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
