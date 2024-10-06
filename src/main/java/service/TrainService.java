package service;

import model.Seat;
import model.Ticket;
import model.Train;
import model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class TrainService {
    private Train train;
    private Map<Long, Ticket> tickets;
    private Long ticketIdCounter = 1L;

    public TrainService() {
        this.train = new Train();
        this.tickets = new HashMap<>();
    }

    public Ticket purchaseTicket(User user, String from, String to) {
        Seat seat = train.allocateSeat("A"); // Default section "A" allocation
        if (seat == null) {
            seat = train.allocateSeat("B"); // If "A" is full, allocate in "B"
        }
        if (seat == null) {
            throw new RuntimeException("No seats available");
        }

        Ticket ticket = new Ticket(ticketIdCounter++, user, from, to, 20.0, seat.getSection(), seat.getSeatNumber());
        tickets.put(ticket.getId(), ticket);
        return ticket;
    }

    public Ticket getReceipt(Long ticketId) {
        return tickets.get(ticketId);
    }

    public List<Ticket> getUsersBySection(String section) {
        return tickets.values().stream()
                .filter(ticket -> ticket.getSection().equals(section))
                .collect(Collectors.toList());
    }

    public void removeUser(Long ticketId) {
        tickets.remove(ticketId);
    }

    public Ticket modifySeat(Long ticketId, String newSection) {
        Ticket ticket = tickets.get(ticketId);
        Seat newSeat = train.allocateSeat(newSection);
        if (newSeat == null) {
            throw new RuntimeException("No seats available in section " + newSection);
        }
        ticket.setSection(newSection);
        ticket.setSeat(newSeat.getSeatNumber());
        return ticket;
    }
}

