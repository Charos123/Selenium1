package OfficeHours;

import java.util.*;

public class JavaMapOH {
    public static void main(String[] args) {
        /* deque - double sides
         we can add and retriev elements from dequeue from
         both sides (head, end)
         */
        Deque<Integer> numbers = new ArrayDeque<>();
        numbers.add(20);
        numbers.add(30);
        numbers.add(50);
        System.out.println(numbers);
        numbers.addLast(90);
        System.out.println(numbers);
        numbers.add(33);
        System.out.println(numbers);
        Integer num = numbers.pollFirst();//return and deletenfirst element
        System.out.println(num);
        System.out.println(numbers);
        System.out.println(numbers.getLast() + " peek " + numbers.peekLast());
        //peek()-returns the value (similar to get())
        // poll()- returns the value and remove it from Queue
        System.out.println("dequeue after peek: " + numbers);

        /*
        what collections you are using in your project?
        describe all difference collections (List, Queue,Set)
        explain the difference




         */

        /*
        Map Interface : does not accept any duplicate keys
        -HashMap- key/ value, can accept null
        -HashTable- synchronized/ no null values
        -LinkedHashMap extends the HashMap,  slower than Hashmap linked
        -TreeMap - sorted, no null values

         */

        HashMap<String, String> user1=new HashMap<>();
        user1.put("First Name",null);
        user1.put("Last name","Smith");
        user1.put("Account Number","A564389");
        user1.put("Dob","02.20.1980");

        System.out.println(user1);

        LinkedHashMap<String,String>user2=new LinkedHashMap<>();
        user2.put("First name", "John");
        user2.put("Last Name",null);
        user2.put("Last Name", "White");
        user2.put("Last Name","Green");
        user2.put("Account Number","A564389");
        user2.put("Dob","02.20.1980");

        System.out.println(user2);

        List<Map<String,String>>users=new ArrayList<>();
        //LinkedHashMap extends HashMap
        users.add(user1);
        users.add(user2);

        HashMap<String,String>user3= new HashMap<>(user1);
        user3.put("Account Number","A564389");
        user3.put("DOB", "02.20.1980");

        users.add(user3);


    }
}