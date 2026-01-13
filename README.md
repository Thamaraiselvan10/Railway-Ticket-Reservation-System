# 🚆 Railway Ticket Reservation System (Java)

A console-based Java application that simulates a real-world railway ticket reservation process, including Confirmed berths, RAC (Reservation Against Cancellation), and Waiting List (WL) management.

This project demonstrates object-oriented design, priority-based seat allocation, and cascading upgrades during ticket cancellation.

---

## 📌 Problem Overview

The system manages train ticket reservations by strictly following predefined rules for seat inventory, berth allocation priority, and cancellation handling.

Detailed specification is available here:
docs/problem-statement.md

---

## ✨ Features

- Book railway tickets with berth preference
- Automatic allocation to Confirmed, RAC, or Waiting List
- Priority-based berth allocation
- Cascading upgrade logic on ticket cancellation
- View available seats in all categories
- Display booked passenger details

---

## 🧠 Allocation Logic.

1. Confirmed berths are allocated based on predefined priority order
2. RAC tickets are allocated when confirmed seats are full
3. Waiting List is used when both Confirmed and RAC are full
4. On cancellation:
   - Confirmed ticket → RAC passenger is promoted
   - RAC ticket → Waiting List passenger is promoted

---

## 🖥️ Sample Execution

Complete console input and output flow:
docs/sample-output.md

---

## 🛠️ How to Run

Prerequisites:
- Java JDK 8 or above
- Command Prompt / Terminal

Steps:
javac RailwayReservation.java
java RailwayReservation

---

## 📂 Project Structure

railway-reservation-system/
│
├── src/
│   └── RailwayReservation.java
├── docs/
│   ├── problem-statement.md
│   └── sample-output.md
├── README.md
└── .gitignore

---

## 🎯 Learning Outcomes

- Practical application of Object-Oriented Programming
- Seat allocation using priority logic
- Queue-based promotion mechanism
- Real-world problem modeling in Java

---

## 👨‍💻 Author

Thamarai Selvan  
Computer Science Engineering Student  
Java | Data Structures | Problem Solving

---

## 📌 Notes

- Console-based application
- In-memory data handling
- Intended for academic and learning purposes
