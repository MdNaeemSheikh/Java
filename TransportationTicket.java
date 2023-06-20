 public class TransportationTicket extends Ticket {
    private String source;
    private String destination;

    public TransportationTicket(String ticketId, double price) {
        super(ticketId, price);
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String getTicketDetails() {
        return super.getTicketDetails() + ", Source: " + source + ", Destination: " + destination;
    }
}
