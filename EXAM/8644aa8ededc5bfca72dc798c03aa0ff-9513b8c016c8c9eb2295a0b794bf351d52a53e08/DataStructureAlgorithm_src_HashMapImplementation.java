import java.util.*;
import java.util.Map.Entry;
public class HashMapImplementation
{
    public static void main(String[] args)
    {
        Map<String, Integer> numbers = new HashMap<>();

        /* put(K,V) method */
        // numbers.put(key,values);
        numbers.put("one",1);
        numbers.put("two",2);
        numbers.put("five",5);
//        numbers.put("one",10); // updating value will never generate error

        /* putIfAbsent() method */
        numbers.putIfAbsent("ten",10);
//        numbers.putIfAbsent("one",10); // will not return anything because already present
        /* get() method */
        System.out.println(numbers.get("two")); //2
        System.out.println(numbers.get("three")); // null

        /* containsKey(k) , contains(V) methods */
        System.out.println(numbers.containsKey("one")); //true
        System.out.println(numbers.containsKey("four")); //false
        System.out.println(numbers.containsValue(1)); //true
        System.out.println(numbers.containsValue(8)); //false

        /* remove() method */
        numbers.remove("two");

        /* keySet() values() method */
        System.out.println(numbers.keySet()); //[one, ten, five]
        System.out.println(numbers.values()); //[1, 10, 5]

        /* entrySet() */
        System.out.println(numbers.entrySet()); //[one=1, ten=10, five=5]
        /*-------------------------*/
        System.out.println(numbers); //{one=1, ten=10, five=5}

        /* iterating entries */
        Set<Entry<String,Integer>> entries = numbers.entrySet();
        for (Entry<String, Integer> entry: entries)
        {
            entry.setValue(entry.getValue()*100);
        }
        System.out.println(numbers);
//        {one=100, ten=1000, five=500}
    }
}
