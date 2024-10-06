package model;

import java.util.ArrayList;
import java.util.List;

public class Train {

    private List<Seat> seats;

    public Train() {
        this.seats = initializeSeats();
    }

    private List<Seat> initializeSeats() {
        List<Seat> seats = new ArrayList<>();
        for (int i = 1; i <= 10; i++) { // 10 seats in each section for demo purposes
            seats.add(new Seat("A" + i, "A", false));
            seats.add(new Seat("B" + i, "B", false));
        }
        return seats;
    }

    public Seat allocateSeat(String section) {
        for (Seat seat : seats) {
            if (seat.getSection().equals(section) && !seat.isOccupied()) {
                seat.setOccupied(true);
                return seat;
            }
        }
        return null;
    }

}
