# 🩺 Westminster Skin Consultation Management System

A Java-based desktop application developed for managing skin consultations at a clinic. This project was created as part of the Object-Oriented Programming coursework (5COSC019C) and includes both **console-based features** and a **Graphical User Interface (GUI)** using Java Swing.


---

## 📌 Project Overview

This application allows clinic staff to:

- Register and manage doctors
- Book consultations for patients
- View and sort doctor/patient information
- Save and retrieve data across sessions
- Interact via a clean GUI interface

The system follows object-oriented design principles using UML diagrams, classes, and interfaces.

---

## 🚀 Features

### ✅ Console Features
- ➕ Add a doctor (up to 10)
- ❌ Delete a doctor by medical license number
- 📃 List doctors alphabetically by surname
- 💾 Save/load doctor data to/from file

### 🖥️ GUI Features
- 📋 Visualize doctor list (alphabetically sorted)
- 📆 Select a doctor and book a consultation
- 👤 Enter patient information
- 🕒 Choose consultation date and time  
- 💰 Enter and store consultation cost (£25/hour, first-time £15) *(not fully implemented)*
- 📝 Add notes (text or images) with encryption *(not fully implemented)*

---

## 📁 Project Structure

```bash
├── src/
│   ├── model/
│   │   ├── Person.java
│   │   ├── Doctor.java
│   │   ├── Patient.java
│   │   └── Consultation.java
│   ├── manager/
│   │   └── WestminsterSkinConsultationManager.java
│   ├── console/
│   │   └── ConsoleApp.java
│   └── gui/
│       └── GUIApp.java
└── README.md
```

## 🧠 Design
UML Use Case Diagram – Describes system interactions

UML Class Diagram – Outlines class structure and relationships
(Both submitted as separate files in coursework submission)

## 🧪 Testing & Validation
✅ Test plan created (separate file)

❌ Automated unit testing – Not implemented

⚠️ Error handling and input validation – Partially implemented

## 🛠️ Technologies Used
Java (OOP)

Java Swing (GUI)

File I/O (data persistence)

Collections (ArrayList, etc.)

Encryption (planned for notes)

## 🧾 How to Run
Clone the Repository:

bash
Copy
Edit
git clone https://github.com/yourusername/Westminster-Skin-Consultation.git
cd Westminster-Skin-Consultation
Open in Java IDE (e.g., IntelliJ IDEA, Eclipse)

Run the main class:

For console version: ConsoleApp.java

For GUI version: GUIApp.java

## 👨‍🎓 Author
Chanuga Insilu Jayarathne
📧 University ID: 
🎓 University of Westminster
📚 Module: Object-Oriented Programming (5COSC019C)

## 📜 License
This project was developed for academic purposes and is not intended for commercial use.


