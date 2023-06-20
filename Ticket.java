import java.util.*;
class Ticket {
    private String ticketId;
    private double price;

    public Ticket(String ticketId, double price) {
        this.ticketId = ticketId;
        this.price = price;
    }

    public String getTicketId() {
        return ticketId;
    }

    public double getPrice() {
        return price;
    }

    public String getTicketDetails() {
        return "Ticket ID: " + ticketId + ", Price: " + price;
    }
}
