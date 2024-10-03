public class Exercise2 {
    /**
     * The `static` keyword in Java modifies methods and variables to belong to the class rather than instances of the class. 
     * This means that when a field or method is declared static, it is shared across all instances of the class.
     *
     * Static Variables Example:
     * Static variables are typical for counters or constants shared among all instances: 
     * `static int counter`. You access them using the class name: `ClassName.counter;`.
     *
     * Static Methods Example:
     * Static methods can be called without creating an instance of the class. They are commonly used for utilitarian methods 
     * that do not require instance data: `public static void displayMessage() {...}`.
     *
     * Static is beneficial for memory efficiency and simplifies calls to methods or variables that do not need the object context.
     */

    static class Counter {
        static int count = 0;

        public static void increment() {
            count++;
        }
    }

    public static void main(String[] args) {
        Counter.increment();
        System.out.println("Counter: " + Counter.count);
    }
}