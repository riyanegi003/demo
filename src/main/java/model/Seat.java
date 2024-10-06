package model;

public class Seat {
    private String seatNumber;
    private String section;
    private boolean isOccupied;

    public Seat(String seatNumber, String section, boolean isOccupied) {
        this.seatNumber = seatNumber;
        this.section = section;
        this.isOccupied = isOccupied;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
}
