package se.mohamedsharshar.smartsupportdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.mohamedsharshar.smartsupportdesk.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
