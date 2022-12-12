import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Введите размерность квадратной матрицы: ");
        int n = inp.nextInt();

        int[][] matr = new int[n][n];

        //Заполнение изначальной матрицы рандомными значениями
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                matr[i][j] = (int) (Math.random() * 10);
        }

        System.out.println("\nЗаданная квадратная матрица: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print("\t" + matr[i][j]);
            System.out.print("\n");
        }

        //Для заданной квадратной матрицы сформировать одномерный массив из ее диагональных элементов.
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = matr[i][i];
        }
        System.out.print("\nМассив из диагональных элементов: " + Arrays.toString(arr));

        //Найти след матрицы, суммируя элементы одномерного массива.
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.print("\n\nСлед матрицы (сумма элементов одномерного массива): " + sum);

        //Преобразовать исходную матрицу по правилу: четные строки разделить на полученное значение, нечетные оставить без изменения.
        System.out.println("\n\nПреобразованная матрица: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0)
                    matr[i][j] /= sum;
                System.out.print("\t" + matr[i][j]);
            }
            System.out.print("\n");
        }
    }
}