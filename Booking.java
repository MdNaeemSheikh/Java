class Booking {
    private String bookingId;
    private User user;
    private Ticket ticket;
    private Payment payment;

    public Booking(String bookingId, User user, Ticket ticket, Payment payment) {
        this.bookingId = bookingId;
        this.user = user;
        this.ticket = ticket;
        this.payment = payment;
    }

    public String getBookingId() {
        return bookingId;
    }

    public User getUser() {
        return user;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public Payment getPayment() {
        return payment;
    }
}
