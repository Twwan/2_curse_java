public class Main {
  public static void main(String[] args) throws Exception {
    Furniture furniture = new Furniture("белый", "дерево");
    Furniture table = new Table("коричневый", "дерево", "Круглый");
    Furniture soft = new Soft("бордовый", "кожа", "диван");
    Furniture cupboard = new Cupboard("коралловый", "дерево", 195);
    Furniture bed = new Bed("серый", "мрамор", 200);
    Furniture chair = new Chair("золотой", "золото орков", "ресторане");
    Furniture door = new Door("чёрный", "металл", "Входная");
    
    System.out.println(furniture.info());
    System.out.println(table.info());
    System.out.println(soft.info());
    System.out.println(cupboard.info());
    System.out.println(bed.info());
    System.out.println(chair.info());
    System.out.println(door.info());
    
  }
}