public class Door extends Furniture {
    protected String type;
    
  public Door(String color, String material, String type) {
    super(color, material);
    this.type = type;
  }
  
  @Override
  public String info() {
      return type + " дверь имеет " + color + " цвет, в качестве материала используется " + material;
  }
}