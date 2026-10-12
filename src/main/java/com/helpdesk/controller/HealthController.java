package com.helpdesk.controller;

import com.helpdesk.service.TicketService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class HealthController {

    private final TicketService ticketService;

    //sem lombok, precisaria criar este construtor!
    /*public HealthController (TicketService ticketService) {
        this.ticketService = ticketService;
    }*/

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
        return ticketService.formatTicket(title);
    }
}
