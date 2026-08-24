package se.mohamedsharshar.smartsupportdesk.service;

import org.springframework.stereotype.Service;
import se.mohamedsharshar.smartsupportdesk.repository.TicketRepository;

@Service
public class TicketService {
    private final TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }
}
