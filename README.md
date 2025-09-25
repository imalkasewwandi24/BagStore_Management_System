# 👜 BagStore Management System
A Java-based Inventory & Staff Management System developed to handle the operations of a small bag store. This project was created as part of coursework in Object-Oriented Programming, focusing on modular design, file handling, and real-world application of inventory management concepts.

---

## 🎯 Project Objectives
- Automate the bag store's inventory and cashier management system.  
- Allow staff to add, update, search, and delete bag and category records.  
- Maintain cashier details for store operations.  
- Persist data between sessions using text files.  
- Apply fundamental OOP concepts including classes, encapsulation, file handling, and structured menus.  

---

## 🛠️ Features

### 🔐 User Management
- Manage cashier (employee) details.  
- Add, view, and update staff records.  

### 👜 Bag & Category Management
- Maintain categories of bags (Backpacks, Handbags, Laptop Bags, etc.).  
- Add, update, search, and delete bags.  
- Display bag details: ID, name, category, quantity, price.  

### 📂 File Handling
Persist data in external files:
- **Bag.txt** → Stores bag inventory.  
- **catagorise.txt** → Stores bag categories.  
- **cashier_details.txt** → Stores cashier details.  

### 📊 Inventory Operations
- Track available bag stock.  
- Update quantities when stock changes.  
- Search and filter bags by category or ID.  

---

## 💻 Technologies Used
- **Language:** Java  
- **IDE:** NetBeans / IntelliJ IDEA / Eclipse (any Java-supported IDE)  

**Programming Concepts:**
- Object-Oriented Programming (OOP)  
- Encapsulation & Abstraction  
- File I/O (Text-based persistence)  
- Control Structures (loops, conditionals, switch menus)  

---

## 🚀 Getting Started

### 🔧 Prerequisites
- Install Java JDK 8 or higher.  
- Install an IDE (IntelliJ IDEA, Eclipse, NetBeans) or use terminal.  

### ⚙️ Installation
1. Clone the repository:
```bash
git clone https://github.com/imalkasewwandi24/BagStore_Management_System.git
```

2. Open the project in your IDE or terminal.

3. Compile the source code:
```bash
javac src/*.java
```

4. Run the application:
```bash
java src/Main
```

---

## 🧪 Testing
- Verify data is saved correctly in files after operations.
- Test invalid input handling (e.g., non-existing IDs).
- Check data consistency between sessions.
