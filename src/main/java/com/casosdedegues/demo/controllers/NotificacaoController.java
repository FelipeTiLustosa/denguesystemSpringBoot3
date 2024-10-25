package com.exemplo.sistemadengue.controllers;

import com.exemplo.sistemadengue.models.Notificacao;
import com.exemplo.sistemadengue.services.NotificacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class NotificacaoController {

    @Autowired
    private NotificacaoService notificacaoService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/notificar")
    public String notificarForm(Model model) {
        model.addAttribute("notificacao", new Notificacao());
        return "notificar";
    }

    @PostMapping("/notificar")
    public String notificarSubmit(@ModelAttribute Notificacao notificacao) {
        notificacaoService.salvarNotificacao(notificacao);
        return "redirect:/listar";
    }

    @GetMapping("/listar")
    public String listarNotificacoes(Model model) {
        model.addAttribute("notificacoes", notificacaoService.getTodasNotificacoes());
        return "listar";
    }
}
