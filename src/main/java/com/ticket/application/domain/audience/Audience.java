package com.ticket.application.domain.audience;

import com.ticket.application.domain.bag.Bag;
import com.ticket.application.domain.ticket.Ticket;

public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Long buy(Ticket ticket){
        return bag.hold(ticket);
    }
}
