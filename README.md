# 🍔 Restaurant Ordering System

A simple Java console application that simulates a restaurant ordering system. Users can select menu items, enter quantities, and receive a receipt with the subtotal, VAT, and grand total.

## 📖 Project Description

This project was developed as part of a Java programming assignment to practice fundamental programming concepts such as:

- Variables and constants
- Methods
- Switch statements
- Loops
- User input
- Mathematical calculations

The application allows customers to order food from a menu and automatically calculates the final bill.

---

## 🍽️ Menu

| Item | Price |
|------|------:|
| Burger | $5 |
| Pizza | $8 |
| Fried Chicken | $6 |
| Soft Drink | $2 |

---

## ✨ Features

- Display restaurant menu
- Select food items
- Enter quantity for each item
- Calculate item total
- Calculate subtotal
- Calculate 10% VAT
- Calculate grand total
- Print a detailed receipt
- Repeat ordering until the user chooses to exit

---

## 🛠️ Methods

The project includes the following methods:

### `displayMenu()`
Displays the list of available food items and prices.

### `calculateItemTotal()`
Calculates the total price for each selected menu item.

### `calculateVAT()`
Calculates 10% VAT based on the subtotal.

### `printReceipt()`
Displays the customer's order summary including:
- Ordered items
- Quantity
- Item total
- Subtotal
- VAT (10%)
- Grand Total

---

## 🧮 Calculation

```
Subtotal = Sum of all ordered items

VAT = Subtotal × 10%

Grand Total = Subtotal + VAT
```

Example:

```
Subtotal:    $20.00
VAT (10%):   $2.00
-------------------
Grand Total: $22.00
```

---

## 📂 Project Structure

```
RestaurantOrderingSystem/
│
├── RestaurantOrderingSystem.java
└── README.md
```

---

## ▶️ How to Run

### Compile

```bash
javac RestaurantOrderingSystem.java
```

### Run

```bash
java RestaurantOrderingSystem
```

---

## 💻 Sample Output

```
========== RESTAURANT MENU ==========
1. Burger          $5
2. Pizza           $8
3. Fried Chicken   $6
4. Soft Drink      $2

Choose an item: 2
Quantity: 3

Subtotal : $24.00
VAT (10%): $2.40
Grand Total: $26.40
```

---

## 🎯 Learning Objectives

This project demonstrates:

- Java methods
- Switch-case statements
- Loops (`do-while`)
- Variables and constants
- User input using `Scanner`
- Basic arithmetic calculations
- Console output formatting

---

## 👨‍💻 Author

**Mi Ly Heng**

Royal University of Phnom Penh (RUPP)

Information Technology Engineering

---

## 📜 License

This project is created for educational purposes.
>>>>>>> acc848edf28192c49c69201679052fd9953e2fa7
