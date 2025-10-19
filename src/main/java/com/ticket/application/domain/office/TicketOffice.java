package com.ticket.application.domain.office;

import com.ticket.application.domain.audience.Audience;
import com.ticket.application.domain.ticket.Ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket... ticket) {
        this.amount = amount;
        this.tickets.addAll(List.of(ticket));
    }

    public void sellTicketTo(Audience audience) {
        plusAmount(audience.buy(getTicket()));
    }

    private Ticket getTicket() {
        return tickets.remove(0);
    }

    private void plusAmount(Long amount) {
        this.amount += amount;
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }
}
