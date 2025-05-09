package com.ardenghe.foodapi.di;

import com.ardenghe.foodapi.di.model.Cliente;
import com.ardenghe.foodapi.di.notificacao.Notificador;
import com.ardenghe.foodapi.di.notificacao.NotificadorEmail;
import com.ardenghe.foodapi.di.notificacao.NotificadorSMS;
import com.ardenghe.foodapi.di.service.AtivacaoClienteService;

public class Main {
    public static void main(String[] args) {
        Cliente joao = new Cliente("João", "joao@joao.com", "16999999999");
        Cliente maria = new Cliente("maria", "maria@maria.com","1199999999");

        Notificador notificador = new NotificadorSMS();

        AtivacaoClienteService at = new AtivacaoClienteService(notificador);

        at.ativar(joao);
        at.ativar(maria);
    }
}
