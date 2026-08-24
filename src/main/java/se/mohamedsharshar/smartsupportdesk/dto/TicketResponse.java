package se.mohamedsharshar.smartsupportdesk.dto;

import se.mohamedsharshar.smartsupportdesk.entity.TicketStatus;

public class TicketResponse {

    private Long id;
    private String title;
    private String description;
    private TicketStatus status;

    public TicketResponse(Long id, String title, String description, TicketStatus status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public TicketStatus getStatus() {
        return status;
    }
}
