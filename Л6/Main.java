public class Main {

    public static double mnk(double I[], double U[], int N) {
        double R = 0;
        // Это числитель из формулы
        double UI = 0;
        // Это знаменатель из формулы
        double I2 = 0;
        for (int i = 0; i < N; i++) {
            UI += U[i] * I[i];
            I2 += I[i] * I[i];
        }
        // Это результат как по формуле
        R = UI / I2;
        return R;
    }

    public static void main(String[] args) throws Exception {
        // Массив значений силы тока
        double I[] = { 4.93, 4.935, 4.941, 4.956, 4.964, 4.985, 4.993, 5.007, 5.018, 5.114 };
        // Массив значений напряжения
        double U[] = { 100, 100.2, 100.4, 99.95, 100.153, 99.81, 100.03, 100.25, 100.32, 100.27 };
        // Получаем приближенное значение сопротивления
        double R = mnk(I, U, 10);
        System.out.println("Приближенное число R = " + R + " ом.");
    }
}