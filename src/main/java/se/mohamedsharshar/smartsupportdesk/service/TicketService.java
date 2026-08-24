package se.mohamedsharshar.smartsupportdesk.service;

import org.springframework.stereotype.Service;
import se.mohamedsharshar.smartsupportdesk.dto.TicketRequest;
import se.mohamedsharshar.smartsupportdesk.dto.TicketResponse;
import se.mohamedsharshar.smartsupportdesk.entity.Ticket;
import se.mohamedsharshar.smartsupportdesk.repository.TicketRepository;

@Service
public class TicketService {
    private final TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public TicketResponse createTicket(TicketRequest request){
        Ticket ticket = new Ticket(
                request.getTitle(),
                request.getDescription()
        );
        Ticket savedTicket = ticketRepository.save(ticket);
        return new TicketResponse(
                savedTicket.getId(),
                savedTicket.getTitle(),
                savedTicket.getDescription(),
                savedTicket.getStatus()
        );
    }
}
