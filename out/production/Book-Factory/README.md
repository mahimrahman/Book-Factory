# Book-Factory

A simple Java project to practice the fundamental concepts of Object-Oriented Programming (OOP). This project simulates a book factory where books can be created, categorized, and managed using core OOP principles.

## Table of Contents
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Concepts Practiced](#concepts-practiced)
- [Setup and Usage](#setup-and-usage)
- [Future Enhancements](#future-enhancements)
- [Contributing](#contributing)
- [License](#license)

---

## Features
- Create and manage books with attributes such as title, author, genre, and price.
- Categorize books by genre.
- Simulate factory operations such as adding books to an inventory.
- Display information about books in the inventory.

## Technologies Used
- **Java**: The core programming language used for this project.
- **Maven**: (Optional) For managing dependencies and building the project.

## Project Structure
```
Book-Factory/
├── src/
│   ├── main/
│   │   ├── Book.java          # Book class representing a single book
│   │   ├── Inventory.java     # Manages the collection of books
│   │   ├── Factory.java       # Simulates factory operations
│   │   └── Main.java          # Entry point of the application
│   └── test/
│       └── FactoryTest.java   # Unit tests for the factory operations
├── README.md                  # Project documentation
└── pom.xml                    # Maven configuration file (optional)
```

## Concepts Practiced
This project incorporates the following OOP principles:

- **Classes and Objects**: Create classes to represent books and other entities.
- **Encapsulation**: Use access modifiers to control access to fields.
- **Inheritance**: Extend base classes to create specialized behaviors (e.g., subclasses for specific book types).
- **Polymorphism**: Implement method overriding to customize behaviors.
- **Abstraction**: Define abstract classes or interfaces for flexibility and scalability.

## Setup and Usage

1. **Clone the Repository**
   ```bash
   git clone https://github.com/your-username/Book-Factory.git
   cd Book-Factory
   ```

2. **Compile the Project**
   If using Maven:
   ```bash
   mvn compile
   ```
   If using a simple Java compiler:
   ```bash
   javac src/main/*.java -d out
   ```

3. **Run the Application**
   ```bash
   java -cp out main.Main
   ```

4. **Run Tests**
   If using Maven:
   ```bash
   mvn test
   ```
   If using a simple Java command:
   ```bash
   javac -cp src/test:src/main src/test/FactoryTest.java -d out
   java -cp out test.FactoryTest
   ```

## Future Enhancements
- Add support for eBooks and audiobooks.
- Implement file I/O for saving and loading inventory data.
- Add a graphical user interface (GUI) for better interaction.
- Integrate a database for persistent storage.

## Contributing
Contributions are welcome! If you have ideas to enhance the project or find any issues, feel free to open an issue or create a pull request.

### Steps to Contribute
1. Fork the repository.
2. Create a new branch for your feature/fix.
3. Commit your changes.
4. Push the branch to your forked repository.
5. Submit a pull request with a description of your changes.

## License
This project is licensed under the MIT License. See the LICENSE file for details.
