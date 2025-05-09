package com.ardenghe.foodapi.di.notificacao;

import com.ardenghe.foodapi.di.model.Cliente;

public interface Notificador {
    void notificar(Cliente cliente, String mensagem);
}
