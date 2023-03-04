import java.util.*;

public class java02 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[J");
        LinkedList<String> listName = new LinkedList<>(Arrays.asList("Иван Иванов", "Светлана Петрова", "Кристина Белова",
                "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов",
                "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова",
                "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"));

        System.out.println(getMapName(getFirstName(listName)));
        HashMap<String, Integer> map = getMapName(getFirstName(listName));
        TreeMap<String, Integer> sortedMap = new TreeMap<>(new ValueComparator(map)) {
        };
        sortedMap.putAll(map);
        System.out.println("\nСортированнае повторяющиеся:");
        for (HashMap.Entry<String, Integer> entry : sortedMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }


    static LinkedList<String> getFirstName(LinkedList<String> list) {
        LinkedList<String> newList = new LinkedList<>();
        for (String name : list) {
            String[] nameArray = name.split(" ");
            newList.add(nameArray[0]);
        }

        return newList;
    }

    static HashMap<String, Integer> getMapName(LinkedList<String> firstNameList) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String name : firstNameList) {
            if (!map.containsKey(name)) {
                map.put(name, 1);
            } else map.put(name, map.get(name) + 1);
        }
        return map;
    }

    static class ValueComparator implements Comparator<String> {
        HashMap<String, Integer> map;

        public ValueComparator(HashMap<String, Integer> map) {
            this.map = map;
        }

        // Функции сравнения...
        public int compare(String el1, String el2) {
            if (map.get(el1) >= map.get(el2)) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}