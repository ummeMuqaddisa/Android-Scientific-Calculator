# Android Scientific Calculator

## Demonstration Video

![Calculator Demo](demo.gif)

## About
A feature-rich, dynamic Scientific Calculator built for Android using Java. Designed with a sleek, iOS-inspired user interface, this calculator goes beyond basic arithmetic by offering a comprehensive suite of advanced mathematical functions. It features persistent memory operations using Android's `SharedPreferences` and robust equation evaluation through the `exp4j` library, ensuring accurate adherence to the order of operations and complex inputs.

## Features

This calculator provides 50 fully functional buttons that support a wide array of mathematical capabilities:

### Basic Arithmetic
* **Addition (+), Subtraction (−), Multiplication (×), Division (÷)**
* **Percentages (%)**
* **Parentheses ()** for explicit grouping and order of operations.

### Scientific & Advanced Functions
* **Trigonometry:** `sin()`, `cos()`, `tan()` — Note: Standard trigonometric functions are evaluated in degrees.
* **Hyperbolic Functions:** `sinh()`, `cosh()`, `tanh()`
* **Exponents & Powers:** `x²` (square), `x³` (cube), `x^y` (custom power), `e^x`, `10^x`
* **Roots:** `sqrt()` (square root), `cbrt()` (cube root), `yroot` (custom root)
* **Logarithms:** `log()` (base 10) and `ln()` (natural log)
* **Factorial:** `!` (computes the factorial of a number)
* **Constants:** `π` (Pi), `e` (Euler's number), and a random number generator.
* **Fractions:** `1/x` (inverse)

### Memory Operations
Memory is persistent and utilizes Android's `SharedPreferences` to persist values even after the app is closed.
* **MC (Memory Clear):** Erases the currently stored memory value.
* **M+ (Memory Add):** Adds the current screen value to the stored memory.
* **M- (Memory Subtract):** Subtracts the current screen value from the stored memory.
* **MR (Memory Recall):** Retrieves the stored memory value and appends it to the current equation.
* **ANS:** The calculator automatically saves the result of your last equation, acting as a dynamic answer recall capability.

### UI & Usability
* **Dynamic Auto-Scaling Text:** The screen features an iOS-styled dynamic display where text actively shrinks as the equation grows, ensuring long calculations remain visibly formatted.
* **Delete / Backspace:** Easily remove the last input without clearing the whole screen.
* **AC (All Clear):** Completely flushes the current equation and results screen.

## Technical Details

* **Language:** Java
* **UI Structure:** XML (`activity_main.xml`) utilizing weighted layouts to ensure uniform button distribution across all device sizes.
* **Math Evaluation:** Utilizes [`exp4j`](https://www.objecthunter.net/exp4j/) modified with custom functions to handle operations like factorial `!` natively, process basic trigonometric operations in DEGREES instead of radians, and translate display labels to proper parser syntaxes.
* **Data Persistence:** Uses `SharedPreferences` to manage persistent memory values across application lifecycles.
