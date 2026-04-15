# Project-Sudoku-Generator---Samuel-Sesquin---APCSA
Java source code, README file, Design document
# Sudoku Generator (Java Console Application)

Samuel Sesquin

This project is a Java console application that generates and prints a fully solved 9x9 Sudoku puzzle. The project follows Sudoku rules as mentioned below:
- Each row contains numbers 1 through 9 exactly once
- Each column contains numbers 1 through 9 exactly once
- Each 3x3 subgrid contains numbers 1 through 9 exactly once

How to run the progarm:
1. Open the repository in GitHub Codespaces
2. Open the terminal
3. Compile the program:
   javac SudokuGenerator.java
4. Run the program:
   java SudokuGenerator

How it is generated:
The program uses a pattern-based algorithm:
- It starts with numbers 1 through 9 stored in an ArrayList.
- The numbers are mixed up using Math.random to shuffle it.
- A mathematical formula is used to shift numbers across rows and columns:
  
  (col + (row * 3) + (row / 3)) % 9

This method makes it so that:
- Each row, column, and 3x3 grid abides by the Sudoku rules.
- No duplicates occur.
- The board is always a correct Sudoku solution.

Files included:
- SudokuGenerator.java in Main program file
- DesignDocument.pdf in Explanation of program design
- README.md in Project overview and instructions
