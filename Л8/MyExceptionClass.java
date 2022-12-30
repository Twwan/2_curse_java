public class MyExceptionClass extends Exception {
    private String number;
    public MyExceptionClass() {
        System.out.println("Массив сокращен до 16 элементов!\nВсе элементы после индека 15 были удалены!");
    }
}