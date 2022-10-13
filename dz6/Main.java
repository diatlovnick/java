package java.dz6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // объявляем множества
        HashSet<Integer> hs = new HashSet<>() ;
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>() ;
        TreeSet<Integer> ts = new TreeSet<>() ;

        // присваиваем рандомные целочисленные в диапазоне 0-100
        Random num = new Random() ;
        for (int i = 0; i < 10; i++) {
            hs.add(num.nextInt(51)) ;
            lhs.add(num.nextInt(51)) ;
            ts.add(num.nextInt(51)) ;
        }

        // смотрим, какие получились значения
        System.out.println("Hashset hs:");
        for (int i: hs) {
            System.out.print(i + ", ") ;
        }
        System.out.println("LinkedHashset lhs:");
        for (int i: lhs) {
            System.out.print(i + ", ") ;
        }
        System.out.println("Treeset hs:");
        for (int i: ts) {
            System.out.print(i + ", ") ;
        }
        System.out.println("\n");

        //Вариант 1 - не совсем соответствует алгоритму задания, но зато лаконично: проходим по множеству lts
        // и каждое значение пытаемся удалить из множества hs
        /*
        for (int i: lhs) {
            hs.remove(i) ;
        }
        */

        // Вариант 2 создаем временное множество, записываем в него все повторяющиеся значения,
        // а затем удаляем все значения временного множества из hs
        HashSet<Integer> tmp = new HashSet<>() ;

        for (int i: hs) {
            if (lhs.contains(i)) tmp.add(i) ;
        }
        for (int i: tmp) {
            hs.remove(i) ;
            System.out.println("удален из hs: " + i);
        }

        // добавляем в ts все значения из lts - так как ключи уникальны,
        // добавятся только те, которых раньше не было
        ts.addAll(lhs) ;

        // выведем на экран результат
        System.out.println("Treeset hs:");
        for (int i: ts) {
            System.out.print(i + ", ") ;
        }
        System.out.println("\n" + "______________");

        //Объявить и инициализировать множество TreeSet ts1 с компаратором Integer
        // (-1 при значении %2==0 ;0 при ==;1 при значении %2!=0).
        Set<CountInt> ts1 = new TreeSet<>(CountInt::compareTo) ;

        //Заполнить ts1 15 случайными числами
        for (int i = 0; i < 14; i++) {;
            ts1.add(new CountInt(num.nextInt(-10,10))) ;
        }

        //и вывести на печать.
        for (CountInt i: ts1) {
            System.out.print(i.numInt + ", ") ;
        }
    }
}

