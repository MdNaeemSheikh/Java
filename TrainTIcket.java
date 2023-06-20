class TrainTicket extends TransportationTicket {
    private String trainNumber;

    public TrainTicket(String ticketId, double price) {
        super(ticketId, price);
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    @Override
    public String getTicketDetails() {
        return super.getTicketDetails() + ", Train Number: " + trainNumber;
    }
}