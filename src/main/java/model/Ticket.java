package model;

public class Ticket {
    private Long id;
    private User user;
    private String from;
    private String to;
    private double pricePaid;
    private String section;
    private String seat;

    public Ticket(Long id, User user, String from, String to, double pricePaid, String section, String seat) {
        this.id = id;
        this.user = user;
        this.from = from;
        this.to = to;
        this.pricePaid = pricePaid;
        this.section = section;
        this.seat = seat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public double getPricePaid() {
        return pricePaid;
    }

    public void setPricePaid(double pricePaid) {
        this.pricePaid = pricePaid;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
