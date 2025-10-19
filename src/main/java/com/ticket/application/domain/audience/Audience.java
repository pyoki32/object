package com.ticket.application.domain.audience;

import com.ticket.application.domain.bag.Bag;

public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Bag getBag() {
        return bag;
    }
}
