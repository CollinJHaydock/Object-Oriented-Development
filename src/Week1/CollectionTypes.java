package Week1;

import java.util.*;

public class CollectionTypes {
    public static void main(String[] args) {

        System.out.println("-- List --");
        List list = new ArrayList();
        list.add("Druid");
        list.add("Hunter");
        list.add("Paladin");
        list.add("Priest");
        list.add("Mage");
        list.add("Rogue");
        list.add("Shaman");
        list.add("Warlock");
        list.add("Warrior");

        for (Object str : list) {
            System.out.println((String)str);
        }

        System.out.println("-- Set --");
        Set set = new TreeSet();
        set.add("Druid");
        set.add("Hunter");
        set.add("Paladin");
        set.add("Priest");
        set.add("Mage");
        set.add("Rogue");
        set.add("Shaman");
        set.add("Warlock");
        set.add("Warrior");
        set.add("Warrior");


        for (Object str : list) {
            System.out.println((String)str);
        }
        System.out.println("-- Queue --");
        Queue queue = new PriorityQueue();
        queue.add("Druid");
        queue.add("Hunter");
        queue.add("Paladin");
        queue.add("Priest");
        queue.add("Mage");
        queue.add("Rogue");
        queue.add("Shaman");
        queue.add("Warlock");
        queue.add("Warrior");
        queue.add("Warrior");


        Iterator iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(queue.poll());
        }
        System.out.println("-- Map --");
        Map map = new HashMap();
        map.put(1, "Druid");
        map.put(2, "Hunter");
        map.put(3, "Paladin");
        map.put(4, "Priest");
        map.put(5, "Mage");
        map.put(6, "Rogue");
        map.put(7, "Shaman");
        map.put(8, "Warlock");
        map.put(9, "Warrior");
        map.put(10, "Warrior");

        for (int i = 1; i < 10; i++) {
            String result = (String)map.get(i);
            System.out.println(result);
        }

        System.out.println("-- List using Generics --");
        List<Raiders> myList = new LinkedList<Raiders>();
        myList.add(new Raiders("Sporkfinger", "Warrior", "Fury, Protection"));
        myList.add(new Raiders("Boysoul", "Paladin", "Protection"));
        myList.add(new Raiders("Mddsteve", "Priest", "Holy"));
        myList.add(new Raiders("Neqi", "Shaman", "Enhancement"));
        myList.add(new Raiders("Tauhie", "Shaman", "Restoration"));
        myList.add(new Raiders("Shadii", "Druid", "Boomkin"));
        myList.add(new Raiders("Hordie", "Mage", "Arcane"));
        myList.add(new Raiders("Stickybandit", "Rogue", "Combat"));
        myList.add(new Raiders("Leonaldi", "Warlock", "Destruction"));
        myList.add(new Raiders("Cadmos", "Druid", "Feral"));

        for (Raiders raider : myList) {
            System.out.println(raider);
        }
    }



}
