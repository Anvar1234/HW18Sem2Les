package homework.tasks;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void bubbleSortAndLog(int len, int max) {
        int[] array = new int[len];
        Random r = new Random();

        //генерация массива псевдослучайных чисел. Лучше было вынести в отдельный метод,
        //для дальнейшего отдельного пользования.
        for (int i = 0; i < len; i++) {
            array[i] = r.nextInt(max + 1);
        }
        System.out.println("Первоначальный массив: ");
        System.out.println(Arrays.toString(array));
        System.out.println("Процесс сортировки: ");

        //сортировка пузырьком
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            //Вывод массива после прохода на консоль для наглядности
            System.out.println(Arrays.toString(array));
            //Запись файла с дозаписью новой инфы.
            try (FileWriter fw = new FileWriter("fileBubbleSort.txt", true)) {
                fw.write(Arrays.toString(array));
                fw.append('\n');
                fw.flush();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
