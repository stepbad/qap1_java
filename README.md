# Java Programming Assignment - Advanced Programming Course

## Overview
This repository contains the Java programming assignments for the "Advanced Programming (Java)" course. The assignments are designed to assess the understanding and application of Java programming concepts covered in the recent course modules.

## Assignment Details
The assignments are divided into three main problems, each focusing on object-oriented programming concepts:
1. **Account Management System**
2. **Date and Time Representation**
3. **Time Manipulation**

Each problem requires the creation of Java classes with specific attributes and methods, as well as test classes to demonstrate functionality.

### Problem 1: Account Class
- **Objective**: Implement a class to simulate basic account management operations.
- **Features**:
  - Creating accounts with unique IDs and names.
  - Performing transactions such as credits, debits, and transfers between accounts.
  - Proper handling of common errors such as insufficient funds.

### Problem 2: Date Class
- **Objective**: Create a class that represents a date and allows for setting and retrieving its components.
- **Features**:
  - Setting the date using individual components (day, month, year) or all at once.
  - Retrieving individual date components.
  - Returning a string representation of the date in `DD/MM/YYYY` format.

### Problem 3: Time Class
- **Objective**: Develop a class capable of time manipulation.
- **Features**:
  - Setting and getting time components (hour, minute, second).
  - Adjusting the time by one second forward or backward with wrap-around at day boundaries.

## Repository Structure
- `Account.java`: Contains the `Account` class with methods for account operations.
- `TestAccount.java`: Test class for demonstrating `Account` class functionality.
- `Date.java`: Contains the `Date` class for handling dates.
- `TestDate.java`: Test class for demonstrating `Date` class functionality.
- `Time.java`: Contains the `Time` class for time manipulation.
- `TestTime.java`: Test class for demonstrating `Time` class functionality.
- "Assessment Reflection QAP1.pdf": required assessment for QAP1.

## Running the Tests
To run the tests, compile each of the test classes along with its corresponding main class using a Java compiler and execute the resulting bytecode. Example:
```bash
javac Account.java TestAccount.java
java TestAccount
