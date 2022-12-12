public class Soft extends Furniture {
    protected String type;
    
  public Soft(String color, String material, String type) {
    super(color, material);
    this.type = type;
  }
  
  @Override
  public String info() {
      return "Мягкий " + type + " изготовленный из " + material + ", имеет " + color + " цвет";
  }
}