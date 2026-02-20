package com.java.jsp;
import java.util.*;

public class Practice {

	public static void main(String[] args) {
//		List<String> list=new ArrayList<>();
//		
//		list.add("prashanth");
//		list.add("aravindh");
//		list.add(2,"dhoni");
//		
//		System.out.println(list);
//		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		
//		for(String s:list) {
//			System.out.println(s);
//		}
//		
//		Iterator<String> it=list.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
//		List<String> list = new ArrayList<>(Arrays.asList("Java", "Python", "C++", "Python"));
//		list.set(1,"c");
////		Collections.sort(list);
//		System.out.println(list.lastIndexOf("Python"));
		
//		 Set<String> fruits = new HashSet<>();
//
//	        // 1. add(E e)
//	        fruits.add("Apple");
//	        fruits.add("Banana");
//	        fruits.add("Mango");
//	        fruits.add("Apple"); // Duplicate, will be ignored
//
//	        System.out.println("Fruits Set: " + fruits);
//
//	        // 2. contains(Object o)
//	        System.out.println("Contains Mango? " + fruits.contains("Mango"));
//
//	        // 3. size()
//	        System.out.println("Size of set: " + fruits.size());
//
//	        // 4. isEmpty()
//	        System.out.println("Is set empty? " + fruits.isEmpty());
//
//	        // 5. addAll(Collection c)
//	        Set<String> moreFruits = new HashSet<>();
//	        moreFruits.add("Orange");
//	        moreFruits.add("Grapes");
//	        fruits.addAll(moreFruits);
//	        System.out.println("After addAll: " + fruits);
//
//	        // 6. remove(Object o)
//	        fruits.remove("Banana");
//	        System.out.println("After removing Banana: " + fruits);
//
//	        // 7. removeAll(Collection c)
//	        fruits.removeAll(moreFruits);
//	        System.out.println("After removeAll(moreFruits): " + fruits);
//
//	        // 8. retainAll(Collection c)
//	        fruits.add("Orange");
//	        fruits.add("Grapes");
//	        fruits.retainAll(moreFruits);
//	        System.out.println("After retainAll(moreFruits): " + fruits);
//
//	        // 9. toArray()
//	        Object[] fruitArray = fruits.toArray();
//	        System.out.println("Array from set: " + Arrays.toString(fruitArray));
//
//	        // 10. clear()
//	        fruits.clear();
//	        System.out.println("After clear(): " + fruits);
//
//	        // 11. iterator()
//	        moreFruits.add("Pineapple");
//	        Iterator<String> iterator = moreFruits.iterator();
//	        System.out.print("Iterating over moreFruits: ");
//	        while (iterator.hasNext()) {
//	            System.out.print(iterator.next() + " ");
//	        }
		
		Map<Integer, String> map = new HashMap<>();

        // put()
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // size()
        System.out.println("Size: " + map.size());

        // isEmpty()
        System.out.println("Is Empty? " + map.isEmpty());

        // containsKey() & containsValue()
        System.out.println("Contains key 2? " + map.containsKey(2));
        System.out.println("Contains value 'Banana'? " + map.containsValue("Banana"));

        // get()
        System.out.println("Value for key 3: " + map.get(3));

        // getOrDefault()
        System.out.println("Value for key 5 (default): " + map.getOrDefault(5, "Not Found"));

        // putIfAbsent()
        map.putIfAbsent(4, "Date");
        map.putIfAbsent(2, "Blueberry"); // Won't replace existing value

        // remove(key)
        map.remove(3);

        // remove(key, value)
        map.remove(4, "Date");

        // replace(key, value)
        map.replace(2, "Blueberry");

        // replace(key, oldValue, newValue)
        map.replace(2, "Blueberry", "Blackberry");

        // keySet()
        System.out.println("Keys: " + map.keySet());

        // values()
        System.out.println("Values: " + map.values());

        // entrySet()
        System.out.println("Entries: " + map.entrySet());

        // forEach()
        map.forEach((k, v) -> System.out.println(k + " => " + v));

        // replaceAll()
        map.replaceAll((k, v) -> v.toUpperCase());

        // putAll()
        Map<Integer, String> anotherMap = new HashMap<>();
        anotherMap.put(5, "Elderberry");
        map.putAll(anotherMap);

        // clear()
        map.clear();
        System.out.println("After clear: " + map);
        
        Map<String,Integer> scores=new HashMap<>();
        
        scores.put("Alice", 85);
        scores.put("Bob", 92);

        String searchKey = "Alice";

        // 1️⃣ Using containsKey() + get()
        int score1;
        if (scores.containsKey(searchKey)) {
            score1 = scores.get(searchKey);
        } else {
            score1 = 0; // default value
        }
        System.out.println("Using containsKey(): " + score1);
        
        System.out.println("-----------------------------------");

        // 2️⃣ Using getOrDefault()
        int score2 = scores.getOrDefault(searchKey, 0);
        System.out.println("Using getOrDefault(): " + score2);
        
        for(Map.Entry<String,Integer> summa:scores.entrySet()) {
        	System.out.println(summa.getKey()+": "+summa.getValue());
        }
	}

}
