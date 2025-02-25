# Strategy Design Pattern & Template Design Pattern

## Strategy Design Pattern

The **Strategy Design** Pattern is a behavioral design pattern that enables selecting an algorithm's behavior at runtime. It defines a family of algorithms, encapsulates each one in a separate class, and makes them interchangeable. This promotes the **Open/Closed Principle** by allowing you to introduce new strategies without altering the existing code.
 
**Key Concepts:**

- **Context:** Maintains a reference to a strategy object and interacts with it only through the strategy interface.
- **Strategy Interface:** Defines a common interface for all concrete strategies.
- **Concrete Strategy:** Implements the specific behavior defined in the strategy interface.

**Example:**
```java
// Strategy Interface
interface PaymentStrategy {
    void pay(int amount);
}

// Concrete Strategies
class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class PayPalPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}

// Context
class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}

// Client
public class StrategyPatternExample {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Pay using Credit Card
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(100);

        // Pay using PayPal
        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(200);
    }
}
```
---
## Template Design Pattern
The **Template Design Pattern** is a behavioral design pattern that defines the skeleton of an algorithm in a base class but allows subclasses to override specific steps without changing the overall structure of the algorithm.

**Key Concepts:**
- **Template Method:** A method in the base class that defines the algorithm's structure and calls the primitive methods.
- **Primitive Methods:** Abstract methods that must be implemented by subclasses.
- **Concrete Class:** Implements the primitive methods.

**Example:**
```java
// Abstract Class
abstract class Game {
    // Template method
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }

    protected abstract void initialize();
    protected abstract void startPlay();
    protected abstract void endPlay();
}

// Concrete Class 1
class Football extends Game {
    @Override
    protected void initialize() {
        System.out.println("Football Game Initialized. Start playing.");
    }

    @Override
    protected void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    @Override
    protected void endPlay() {
        System.out.println("Football Game Finished!");
    }
}

// Concrete Class 2
class Cricket extends Game {
    @Override
    protected void initialize() {
        System.out.println("Cricket Game Initialized. Start playing.");
    }

    @Override
    protected void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    @Override
    protected void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}

// Client
public class TemplatePatternExample {
    public static void main(String[] args) {
        Game game = new Football();
        game.play();  // Playing Football

        System.out.println();

        game = new Cricket();
        game.play();  // Playing Cricket
    }
}
```
-------
### Key Differences
| Aspect            |     Strategy Design Pattern            |     Template Design Pattern              |
|-------------------|----------------------------------------|------------------------------------------|
| Purpose           | Encapsulates interchangeable behaviors (algorithms).| Provides a fixed algorithm skeleton, but allows customization of steps.|
| Flexibility       |You can add new strategies without modifying existing code.| Subclasses can only customize specific steps of the algorithm.|
| Type             | Behavioral Pattern | Behavioral Pattern |
| Implementation   | Uses composition (injects the strategy into a context). | Uses inheritance (subclasses override template methods). |
|                  |                     |              |
