package lesson16.hw;

import java.util.*;

/*
 * *Создайте коллекцию Set с типом элементов String. Добавьте в неё  11 строк:
 * арбуз, банан, вишня, груша, дыня, ежевика, женьшень, земляника, ирис, картофель, арбуз.
 * После этого выведем содержимое коллекции на экран, параллельно наблюдая за порядком добавленных

 *Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
 * */
public class Main {
    public static void main(String[] args) {

        Set<String> fruitSet = new LinkedHashSet<>();
        fruitSet.add("арбуз");
        fruitSet.add("банан");
        fruitSet.add("вишня");
        fruitSet.add("груша");
        fruitSet.add("дыня");
        fruitSet.add("ежевика");
        fruitSet.add("женьшень");
        fruitSet.add("земляника");
        fruitSet.add("ирис");
        fruitSet.add("картофель");
        fruitSet.add("арбуз");

        System.out.println(fruitSet);

        Set<String> fruitSet2 = new HashSet<>(fruitSet);
        System.out.println(fruitSet2);

        Set<String> fruitSet3 = new TreeSet<>(fruitSet);
        System.out.println(fruitSet3);

        List<String> newList = new ArrayList<>(fruitSet);
        newList.add("ирис");
        newList.add("вишня");
        System.out.println(newList);

        System.out.println(removeDuplicate(newList));
    }

    public static Collection<String> removeDuplicate(Collection<String> collection) {
        return new HashSet<>(collection);
    }
}
