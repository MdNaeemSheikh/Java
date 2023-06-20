class BusTicket extends TransportationTicket {
    private String busOperator;

    public BusTicket(String ticketId, double price) {
        super(ticketId, price);
    }

    public String getBusOperator() {
        return busOperator;
    }

    public void setBusOperator(String busOperator) {
        this.busOperator = busOperator;
    }

    @Override
    public String getTicketDetails() {
        return super.getTicketDetails() + ", Bus Operator: " + busOperator;
    }
}