package com.casosdedegues.demo.services;

import com.exemplo.sistemadengue.models.Notificacao;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NotificacaoService {

    private List<Notificacao> notificacoes = new ArrayList<>();

    public void salvarNotificacao(Notificacao notificacao) {
        notificacoes.add(notificacao);
        System.out.println("Notificação salva: " + notificacao.getAgravo());
    }

    public List<Notificacao> getTodasNotificacoes() {
        return notificacoes;
    }
}