import java.util.*;

public class Main {
    private static Integer temp;

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        // Создаем массив для целых чисел
        List<Integer> array = new ArrayList<Integer>();

        System.out.println("Вводите значения массива по одному числу\n(чтобы закончить ввод введите 10000)");
        int index = 1;
        // Для будущего понимания есть ли отр. числа
        boolean prov = false;
        // Сумма чисел до первого отр. числа
        int otrSumm = 0;
        // Чтобы знать индекс отр. числа
        int otrIndex = 0;
        while (true) {
            System.out.print("[" + index + "] значение: ");
            index += 1;
            try {
                
                temp = in.nextInt();
                // Если введённое знач. отр., то меняем на true
                if (temp < 0) {
                    prov = true;
                }
                if (temp == 10000) {
                    System.out.println("Ввод завершен!");
                    break;
                }
                // Вылавливаем исключение (ошибку) если ввести не целое число
            } catch (Exception e) {
                System.out.println("[-] Вы ввели не целое число!\n[-] Ввод завершается!");
                break;
                // Если всё ок, добавляем это число в массив
            } finally {
                array.add(temp);
                }
            
            
            if (array.size() > 16) {
            try {
                int t = array.size() - 16;
                int t1 = 16;
                for (int i = 0; i < t; i++) {
                    array.remove(t1);
                }
            } catch (MyExceptionClass e) {
                System.out.println(e.getMessage());
                } 
            }
        }


        // Закрываем поток ввода
        in.close();

        // Если попалось отр. число, то эта часть кода зарабоает.
        if (prov == true) {
            // Пробегаемся по массиву и ищем индекс первого отр. числа
            for (int i = 0; i < array.size(); i++) {
                if (array.get(i) < 0) {
                    otrIndex = i;
                    break;
                }
            }
            // Суммируем числа до первого отр. числа
            for (int i = 0; i < otrIndex; i++) {
                otrSumm += array.get(i);
            }
            System.out.println("Сумма чисел до первого отрицательного числа: " + otrSumm);
        } else {
            System.out.println("[-] В массиве нет отрицельных чисел");
        }
        System.out.println("Введённый массив: " + array);
    }
}
