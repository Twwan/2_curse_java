public class Cupboard extends Furniture {
    protected int height;
    
  public Cupboard(String color, String material, int height) {
    super(color, material);
    this.height = height;
  }
  
  @Override
  public String info() {
      return "Шкаф высотой " + height + "см имеет " + color + " цвет, в качестве материала используется " + material;
  }
}