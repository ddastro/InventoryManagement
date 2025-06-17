
# Inventory Management System

A basic inventory system for warehouses using Java and HashMap for efficient CRUD operations.

## 💡 Why Data Structures Matter

Data structures help manage inventory efficiently:
- HashMap allows O(1) average time complexity for add, update, delete, and lookup operations.

## 🧱 Product Class
Attributes:
- productId
- productName
- quantity
- price

## 📂 Project Structure
```
src/
  Product.java
  InventoryManager.java
  InventoryTest.java
```

## 💻 How to Run

### Compile:
```bash
javac src/*.java
```

### Execute:
```bash
java -cp src InventoryTest
```

## ⏱️ Time Complexity (Using HashMap)
- Add: O(1)
- Update: O(1)
- Delete: O(1)
- Display: O(n)

## 🔧 Optimizations
- Use TreeMap for sorted productId access (O(log n))
- Use database for persistent large-scale inventory

## 🙌 Author

Your Name Here – *Inventory Management System Contributor*
