import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class dz1 {

    public static void main(String[] args) {
    /*  1. Выбросить случайное целое число в диапазоне от -1000 до 1000 и сохранить в i
        2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        5. Сохранить оба массива в файлы с именами m1 и m2 соответственно.
        Пункты реализовать в методе main
        *Пункты реализовать в разных методах
    */
        //1
        double randomNumber = Math.floor(Math.random() * (2001) - 1000);
        int random = (int) randomNumber;
        System.out.println(random);

        //2
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        in.close();
        int n = 1 << 30;
        while (num < n) n >>= 1;
        System.out.println(n);

        //3
        

        ArrayList<Integer> al = new ArrayList<Integer>(); 
        for (int i = 0; i < Short.MAX_VALUE; i++) {
            if (i % num == 0){
                al.add(i);
            }
        }
        //int[] arr = new int[al.size()];
        System.out.println(al);

        File file = new File("file.txt");
                if (!file.exists()) {
                    try {
                        file.createNewFile();
                        FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());
                        fileWriter.append("hello world");
                        fileWriter.flush();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }


    }
}