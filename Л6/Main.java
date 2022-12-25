import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception {
        Stack<Double> stackI = new Stack<>();
        Stack<Double> stackU = new Stack<>();
        
        stackI.push(4.93);
        stackI.push(4.935);
        
        stackU.push(100.0);
        stackU.push(100.2);
        System.out.println(stackI);
        System.out.println(stackU);

        int N = 2;
        double R = 0;
        double UU = 0;
        double II = 0;
        // Это числитель из формулы
        double UI = 0;
        // Это знаменатель из формулы
        double I2 = 0;
        for (int i = 0; i < N; i++) {
            UU = stackU.pop();
            II = stackI.pop();
            UI += UU * II;
            I2 += II * II;
        }
        // Это результат как по формуле
        R = UI / I2;
        System.out.println("Приближенное число R = " + R + " ом.");
    }
}
