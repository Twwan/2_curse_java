public class Bed extends Furniture {
    protected int length;
    
  public Bed(String color, String material, int length) {
    super(color, material);
    this.length = length;
  }
  
  @Override
  public String info() {
      return "Кровать длиной " + length + "см имеет " + color + " цвет, в качестве материала используется " + material;
  }
}