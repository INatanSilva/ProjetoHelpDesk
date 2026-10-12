package com.helpdesk.service;

import org.springframework.stereotype.Service;

@Service
public class TicketService {

    public String formatTicket(String title) {
        return "Ticket recebido: " + title;
    }
}
