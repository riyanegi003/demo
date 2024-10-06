Train Demo

To implement this project, I have breaked it down into different APIs with their respective routes and methods, focusing on Java and RESTful API principles using Spring Boot. We'll define models for User, Ticket, and Train, and create services to handle the logic for ticket purchasing, seat allocation, modification, and removal.

Here’s an overview of the steps:

Project Setup: Used Spring Boot for developing REST APIs.

API Implementation:

Created a new user, purchase a ticket, and allocate a seat.
View receipt details for a specific user.
View users and seat allocation by section.
Modify a user’s seat.
Remove a user from the train.
Let's start with the project structure.

Project Structure

Models: User, Ticket, Train, and Seat.
Services: Business logic to manage users, tickets, and train.
Controllers: APIs to handle requests.
Repository: In-memory storage of users, tickets, and seats for simplicity.

API Summary

POST /api/train/purchase: Purchase a ticket with a user’s information (first name, last name, email).
GET /api/train/receipt/{ticketId}: Get the receipt (ticket details) for a user.
GET /api/train/users/{section}: Get users by train section (either A or B).
DELETE /api/train/remove/{ticketId}: Remove a user from the train.
PUT /api/train/modify/{ticketId}/{newSection}: Modify a user's seat by changing their section.
