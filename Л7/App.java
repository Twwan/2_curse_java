import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    // Фукнция вывода меню
    private static void Menu() {
        System.out.println("\n1. Show the collection");
        System.out.println("2. Add new report");
        System.out.println("3. Save to the file");
        System.out.println("4. Load from the file");
        System.out.println("5. Exit");
        System.out.print("Choose option: ");

    }

    public static void main(String[] args) throws Exception {
        // Создаем сканеры для int и String
        Scanner intInput = new Scanner(System.in);
        Scanner strInput = new Scanner(System.in);
        // Создаем коллекцию
        List<Book> bookList = new ArrayList<>();
        // Задаём название файла для сохрания/загрузки
        String filename = "123.txt";
        Menu();
        while (true) {
            File file = new File(filename);
            int choose = intInput.nextInt();
            if (choose == 5) {
                // Выход
                System.exit(0);
            } else if (choose == 1) {
                // Показать коллекцию
                System.out.println("All objects from collection:\n");
                System.out.println(bookList);
                Thread.sleep(7000);
            } else if (choose == 2) {
                // Создать новую запись
                System.out.println("Creating new object...");
                System.out.print("Enter NAME OF STATION: ");
                String NameOfStation = strInput.nextLine();
                System.out.print("Enter ADRESS: ");
                String Adress = strInput.nextLine();
                System.out.print("Enter MARK OF CAR: ");
                String NameOfAuto = strInput.nextLine();
                System.out.print("Enter TYPE OF REPAIR WORK: ");
                String TypeOfRepairWork = strInput.nextLine();
                System.out.print("Enter DATE OF COMING: ");
                String DateOfComing = strInput.nextLine();
                System.out.print("Enter DAY OF INCOMING: ");
                String DateOfIncoming = strInput.nextLine();
                System.out.print("Enter RESULT OF WORK: ");
                String ResultOfWork = strInput.nextLine();
                System.out.print("Enter WORKER NAME: ");
                String WorkerName = strInput.nextLine();
                System.out.print("Enter COST: ");
                String Cost = strInput.nextLine();
                // Создание объекта класса Book
                Book newBook = new Book(NameOfStation, Adress, NameOfAuto, TypeOfRepairWork, DateOfComing,
                        DateOfIncoming, ResultOfWork, WorkerName, Cost);
                System.out.println("Info about this report: " + newBook.toString());
                // Добавление этого объекта в коллекцию
                bookList.add(newBook);
                System.out.println("Saving new object...");
                Thread.sleep(2000);
            } else if (choose == 3) {
                // Сохранение в файл
                System.out.println("Saving...");
                FileWriter writer = new FileWriter(file);
                writer.write(bookList.toString());
                writer.close();
                Thread.sleep(1000);
            } else if (choose == 4) {
                // Загрузка объекта из файла в коллекцию
                if (file.length() == 0) {
                    System.out.println("The file is empty!!!");
                    Thread.sleep(2000);
                } else {
                    System.out.println("Reading the file...");
                    // Создаем буффер, шаблон для выделения данных между '' и матчер, для
                    // вытаскивания данных из файла между символами шаблона
                    BufferedReader reader = new BufferedReader(
                            new InputStreamReader(new FileInputStream(file)));
                    Pattern pattern = Pattern.compile("['](.*?)[']");
                    Matcher matcher = pattern.matcher(reader.readLine());
                    // Создаем коллекцию на время
                    List<String> lst = new ArrayList<>();
                    // Вытаскиваем из файла все значения между ''
                    while (matcher.find()) {
                        lst.add(matcher.group(1).toString());
                    }
                    // Пока временная коллекция не закончится, добавлять объекты в основую коллекцию
                    // с параметрами из файла.
                    // Удаление предыдущих параметров, для множества объектов в файле
                    while (lst.size() != 0) {
                        bookList.add(new Book(lst.get(0), lst.get(1), lst.get(2), lst.get(3), lst.get(4), lst.get(5),
                                lst.get(6), lst.get(7), lst.get(8)));
                        lst.remove(0);
                        lst.remove(0);
                        lst.remove(0);
                        lst.remove(0);
                        lst.remove(0);
                        lst.remove(0);
                        lst.remove(0);
                        lst.remove(0);
                        lst.remove(0);
                    }
                    reader.close();
                    Thread.sleep(1000);
                }
            }
            Menu();
        }
    }
}
