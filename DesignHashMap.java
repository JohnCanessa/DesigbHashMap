import java.util.Arrays;

/**
 * LeetCode 706. Design HashMap
 * https://leetcode.com/problems/design-hashmap/
 */


 /**
  * Designs and implements a HashMap without using 
  * any built-in hash table libraries.
  *
  * Runtime: 32 ms, faster than 27.20% of Java online submissions.
  * Memory Usage: 45.9 MB, less than 37.26% of Java online submissions
  */
class MyHashMap {

    // **** ****
    final int INITIAL_CAPACITY = 1000000 + 1;

    // **** class variables ****
    private int[] values;


    // **** hash map function ****
    // private int hashFc(int key) {
    //     return key % INITIAL_CAPACITY;
    // }


    // **** constructor ****
    public MyHashMap() {
        this.values = new int[INITIAL_CAPACITY];
        Arrays.fill(this.values, -1);
    }


    // **** value will always be non-negative ****
    public void put(int key, int value) {
        this.values[key] = value;
    }


    // **** returns the value to which the specified key is mapped, 
    //      or -1 if this map contains no mapping for the key ****
    public int get(int key) {
        return this.values[key];
    }


    // **** remove the mapping of the specified value key 
    //      if this map contains a mapping for the key ****
    public void remove(int key) {
        this.values[key]  = -1;
    }


    // **** for testing purpose only ****
    @Override
    public String toString() {

        // **** initialization ****
        StringBuilder sb    = new StringBuilder();

        // **** traverse the array of keys and values ****
        for (int i = 0; i < this.values.length; i++) {

            // **** have a key:value pair ****
            if (values[i] != -1)
                sb.append(i + "=" + this.values[i] + " ");
        }

        // **** return string ****
        return sb.toString();
    }
}


/**
 * Used to keep track of the key value pairs.
 * !!!! For next implementation !!!!
 */
class MapNode {

    // **** members ****
    public int key;
    public int value;

    // **** constructor ****
    public MapNode(int key, int value) {
        this.key    = key;
        this.value  = value;
    }
}


/**
 * Test and use my hash map.
 */
public class DesignHashMap {


    /**
     * Test scaffolding
     */
    public static void main(String[] args) {

        // **** create my hash map ****
        MyHashMap hm = new MyHashMap();

        // **** put key:value pair ****
        hm.put(1, 1);

        // **** put key:value pair ****
        hm.put(2, 2);

        // ???? ????
        System.out.println("main <<< hm: " + hm.toString());

        // **** get value for specified key ****
        System.out.println("main <<< hm.get(1): " + hm.get(1));

        // **** get value for specified key ****
        System.out.println("main <<< hm.get(3): " + hm.get(3));

        // **** put key:value pair ****
        hm.put(2, 1);

        // ???? ????
        System.out.println("main <<< hm: " + hm.toString());

        // **** get value for specified key ****
        System.out.println("main <<< hm.get(2): " + hm.get(2));

        // *** remove key value pair for specified key ****
        hm.remove(2);

        // ???? ????
        System.out.println("main <<< hm: " + hm.toString());

        // **** get value for specified key ****
        System.out.println("main <<< hm.get(2): " + hm.get(2));


        /*
        // ???? ????
        System.out.println();

        // **** put key ****
        hm.put(12345, 67890);

        // ???? ????
        System.out.println("main <<< hm: " + hm.toString());

        // **** get value for specified key ****
        System.out.println("main <<< hm.get(12345): " + hm.get(12345));

        // **** put key ****
        hm.put(1000000, 1000000);

        // ???? ????
        System.out.println("main <<< hm: " + hm.toString());

        // **** get value for specified key ****
        System.out.println("main <<< hm.get(1000000): " + hm.get(1000000));

        // **** put key ****
        hm.put(0, 0);

        // ???? ????
        System.out.println("main <<< hm: " + hm.toString());

        // **** get value for specified key ****
        System.out.println("main <<< hm.get(0): " + hm.get(0));

        // **** loop checking some additional keys ****
        for (int i = 65536 - 10; i < 65536 + 10; i++) {

            // **** put key:value ****
            hm.put(i, i);

            // ???? ????
            System.out.println("main <<< hm: " + hm.toString());
        }
        */

    }
}