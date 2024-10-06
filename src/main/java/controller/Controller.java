package controller;

import model.Ticket;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.TrainService;

import java.util.List;

@RestController
@RequestMapping("/api/train")
public class Controller {

    @Autowired
    private TrainService trainService;

    @PostMapping("/purchase")
    public ResponseEntity<Ticket> purchaseTicket(@RequestBody User user) {
        Ticket ticket = trainService.purchaseTicket(user, "London", "France");
        return ResponseEntity.ok(ticket);
    }

    @GetMapping("/receipt/{ticketId}")
    public ResponseEntity<Ticket> getReceipt(@PathVariable Long ticketId) {
        Ticket ticket = trainService.getReceipt(ticketId);
        return ResponseEntity.ok(ticket);
    }

    @GetMapping("/users/{section}")
    public ResponseEntity<List<Ticket>> getUsersBySection(@PathVariable String section) {
        List<Ticket> tickets = trainService.getUsersBySection(section);
        return ResponseEntity.ok(tickets);
    }

    @DeleteMapping("/remove/{ticketId}")
    public ResponseEntity<Void> removeUser(@PathVariable Long ticketId) {
        trainService.removeUser(ticketId);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/modify/{ticketId}/{newSection}")
    public ResponseEntity<Ticket> modifySeat(@PathVariable Long ticketId, @PathVariable String newSection) {
        Ticket updatedTicket = trainService.modifySeat(ticketId, newSection);
        return ResponseEntity.ok(updatedTicket);
    }
}

