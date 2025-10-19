package com.ticket.application.domain.theater;

import com.ticket.application.domain.audience.Audience;
import com.ticket.application.domain.seller.TicketSeller;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience){
        ticketSeller.sellTo(audience);
    }
}

