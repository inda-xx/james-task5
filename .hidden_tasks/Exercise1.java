import java.util.List;
import java.util.ArrayList;

public class Exercise1 {
    /**
     * Arrays and ArrayLists in Java offer different approaches to storing and managing collections of data. 
     * Arrays are fixed-size collections that are part of the Java language. They require memory to be allocated before use, 
     * which makes them fast and memory-efficient for representing a known amount of data. Initialization is straightforward, 
     * for example: `int[] numbers = new int[10];`, and accessing elements is done using indices: `numbers[0] = 5;`.
     *
     * ArrayLists, part of the Java Collections Framework, provide a more flexible alternative. They grow dynamically, 
     * making them ideal for situations where the exact amount of data is unknown. An ArrayList must be imported: 
     * `import java.util.ArrayList;` and instantiated: `ArrayList<Integer> numbers = new ArrayList<>();`. 
     * Elements can be added using `numbers.add(5);` and accessed with `numbers.get(0);`.
     * 
     * The primary distinction is that arrays are faster and consume less memory, whereas ArrayLists offer dynamic sizing and 
     * more convenience methods (such as adding or removing elements). However, ArrayLists have a slight overhead as they wrap 
     * around arrays internally.
     */
}