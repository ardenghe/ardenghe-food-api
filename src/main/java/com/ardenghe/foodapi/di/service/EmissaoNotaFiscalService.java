package com.ardenghe.foodapi.di.service;

import com.ardenghe.foodapi.di.model.Cliente;
import com.ardenghe.foodapi.di.model.Produto;
import com.ardenghe.foodapi.di.notificacao.NotificadorEmail;

public class EmissaoNotaFiscalService {

    private NotificadorEmail notificadorEmail;

    public EmissaoNotaFiscalService(NotificadorEmail notificadorEmail) {
        this.notificadorEmail = notificadorEmail;
    }

    public void emitir(Cliente cliente, Produto produto){
        //TODO emite a nota fiscal aqui...


        this.notificadorEmail.notificar(cliente, "Nota fiscal do produto: "
                + produto.getNome() + "foi emitida com sucesso!");
    }

}
