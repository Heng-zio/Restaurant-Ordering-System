<p align="center">
  <img src="logo.png" alt="Jomnum Tech Logo" width="220"/>
</p>

<h1 align="center">🍔 Restaurant Ordering System</h1>

<p align="center">
A simple Java console application that simulates a restaurant ordering system.
Users can order food, calculate the bill automatically, and print a receipt including VAT and Grand Total.
</p>

<p align="center">

![Java](https://img.shields.io/badge/Java-17-orange?logo=java)
![License](https://img.shields.io/badge/License-Educational-blue)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen)

</p>

---

# 📖 Project Description

This project was developed as part of a **Java Programming Assignment** at the **Royal University of Phnom Penh (RUPP)**.

The goal of this project is to practice Java programming fundamentals by building a restaurant ordering system that allows users to:

- Display a food menu
- Select food items
- Enter quantities
- Calculate totals automatically
- Calculate VAT (10%)
- Print a receipt
- Continue ordering until exiting the program

---

# 🍽️ Menu

| Item | Price |
|------|------:|
| 🍔 Burger | $5 |
| 🍕 Pizza | $8 |
| 🍗 Fried Chicken | $6 |
| 🥤 Soft Drink | $2 |

---

# ✨ Features

- Display restaurant menu
- Select menu items
- Enter item quantity
- Calculate item total
- Calculate subtotal
- Calculate 10% VAT
- Calculate grand total
- Print formatted receipt
- Repeat ordering until the user exits

---

# 🛠️ Methods

### `displayMenu()`

Displays the restaurant menu.

### `calculateItemTotal()`

Calculates the total price of each selected item.

### `calculateVAT()`

Calculates 10% VAT based on the subtotal.

### `printReceipt()`

Prints a detailed receipt including:

- Ordered items
- Quantity
- Item total
- Subtotal
- VAT
- Grand Total

---

# 🧮 Calculation

```
Subtotal = Sum of all ordered items

VAT = Subtotal × 10%

Grand Total = Subtotal + VAT
```

Example:

```
Subtotal    : $20.00
VAT (10%)   : $2.00
-----------------------
Grand Total : $22.00
```

---

# 📂 Project Structure

```
RestaurantOrderingSystem/
│
├── RestaurantOrderingSystem.java
├── README.md
└── logo.png
```

---

# ▶️ How to Run

### Compile

```bash
javac RestaurantOrderingSystem.java
```

### Run

```bash
java RestaurantOrderingSystem
```

---

# 💻 Sample Output

```text
========== RESTAURANT MENU ==========
1. Burger          $5
2. Pizza           $8
3. Fried Chicken   $6
4. Soft Drink      $2

Choose an item: 2
Quantity: 3

Subtotal    : $24.00
VAT (10%)   : $2.40
Grand Total : $26.40
```

---

# 🎯 Learning Objectives

This project demonstrates the use of:

- Java Methods
- Switch Statements
- Loops (`do-while`)
- Variables and Constants
- User Input (`Scanner`)
- Basic Arithmetic Calculations
- Console Output Formatting

---

# 👨‍🏫 Instructor

**Ing. Davann**

Java Programming Course

Royal University of Phnom Penh (RUPP)

---

# 👨‍💻 Author

**Mi Ly Heng**

Information Technology Engineering

Royal University of Phnom Penh (RUPP)

GitHub: **Heng-zio**

---

# 📜 License

This project was created for **educational purposes only**.

---

<p align="center">
<b>JOMNUM TECH</b><br>
Moving Forward Together in the Age of Technology
</p>
