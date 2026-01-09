# 🚆 Railway Ticket Reservation System

## Problem Statement

Design and implement a **console-based, object-oriented Railway Ticket Reservation System** that manages train ticket bookings by strictly following predefined seat inventory, allocation priority, and cancellation rules.

The system should simulate real-world railway reservation behavior, including **Confirmed berths**, **RAC (Reservation Against Cancellation)**, and **Waiting List (WL)** handling.

---

## Core Functionalities

The system must support the following operations:

1. **Book Ticket**  
   - Register a new passenger  
   - Allocate a seat based on availability and priority rules  

2. **Cancel Ticket**  
   - Cancel a booked ticket using the Passenger ID  
   - Trigger cascading seat upgrades  

3. **Print Availability**  
   - Display the number of available seats in all categories  

4. **Print Passenger Details**  
   - Display details of all booked passengers, including:  
     - Passenger ID  
     - Name  
     - Age  
     - Seat number or booking status  

---

## Seating and Inventory Rules

The train has a **fixed number of seats**, divided into three categories:

### 1. Confirmed Berths
- Berths are categorized by type
- Seats must be allocated in a **fixed priority order**
- Berth types include:
  - Lower
  - Middle
  - Upper
  - Side Lower
  - Side Upper

### 2. RAC (Reservation Against Cancellation)
- Activated when all Confirmed berths are filled
- Limited number of RAC seats
- RAC passengers are eligible for promotion on cancellation

### 3. Waiting List (WL)
- Used when both Confirmed and RAC seats are full
- Passengers are queued based on booking order

---

## Allocation Logic

When a passenger books a ticket, allocation must follow this priority:

1. **Confirmed Allocation**
   - Allocate the first available berth based on the defined priority order  

2. **RAC Allocation**
   - If no Confirmed seats are available, assign the passenger to RAC  

3. **Waiting List**
   - If Confirmed and RAC are full, add the passenger to the Waiting List  

---

## Cancellation and Cascading Upgrade Logic

When a ticket is cancelled using its **Passenger ID**, the system must perform **immediate cascading upgrades**:

1. If a **Confirmed ticket** is cancelled:
   - Promote the **highest-priority passenger from RAC** to Confirmed

2. If a passenger is promoted from RAC:
   - Promote the **first passenger from the Waiting List** to RAC

This ensures optimal seat utilization and fairness.

---

## Constraints and Assumptions

- The application is **console-based**
- Uses **object-oriented design principles**
- Seat inventory is fixed at program start
- Passenger IDs are unique and system-generated
- Data is maintained in-memory during execution

---

## Objective

The goal of this project is to demonstrate:
- Object-Oriented Programming (OOP) design
- Queue and list management
- Priority-based allocation
- Real-world problem modeling in Java
