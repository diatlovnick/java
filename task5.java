import java.util.HashMap;
import java.util.Map;

public class task5 {
    public static void main(String[] args) {
        //объявляем HashMap
        Map<String, String> books = new HashMap<String, String>() ;

        //добавляем значения
        books.put("Тургенев", "Отцы и дети") ;
        books.put("Толстой", "Война и мир") ;
        books.put("Горький", "На дне") ;
        books.put("Грибоедов", "Горе от ума") ;
        books.put("Достоевский", "Идиот") ;
        books.put("Желязны", "Хроники Амбера") ;
        books.put("Роулинг", "Гарри Поттер") ;
        books.put("Сапковски", "Ведьмак") ;
        books.put("Мартин", "Песнь льда и пламени") ;
        books.put("Толкиен", "Властилин колец") ;

        //перебираем HashMap, добавляем "!" к значению.
        for (Map.Entry<String,String> entry: books.entrySet()) {;
            entry.setValue(entry.getValue() + "!") ;
        }

        //объявляем переменные для новой книги, проверяем с помощью метода .contrainsKey наличие в мапе ключа,
        // если нет, добавляем новую книгу.
        String newAuthor = "Грибоедов";
        String newTitle = "Алиса в стране чудес" ;
        if (!books.containsKey(newAuthor)) {
            books.put(newAuthor, newTitle) ;

            //если такой автор есть, создаем строковый массив. по автору книги (по ключу)
            // находим название книги (значение) и разбиваем это название на 2 элемента по пробелу.
            // записываем в массив. второй элемент массива - нужная строка (без первого слова).
            // записываем в мап.
        } else {
            String[] arr = books.get(newAuthor).split(" ", 2) ;
            String newValue = arr[1];
            books.put(newAuthor, newValue) ;
        }

        // проверяем, что получилось
        for (Map.Entry<String,String> entry: books.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}
