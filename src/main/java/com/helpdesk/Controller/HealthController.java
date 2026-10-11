package com.helpdesk.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HealthController {

    @GetMapping("/health")
    public String health() {
        return "HelpDesk API está funcionando!";
    }

    @GetMapping("/info")
    public String info() {
        return "Sistema de suporte técnico HelpDesk";
    }

    @GetMapping("/tickets")
    public String searchTicket(@RequestParam String title) {
        return "Ticket recebido: " + title;
    }
}
