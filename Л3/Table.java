public class Table extends Furniture {
    protected String shape;
    
  public Table(String color, String material, String shape) {
    super(color, material);
    this.shape = shape;
  }
  
  @Override
  public String info() {
      return shape + " стол, изготовленный из " + material + ", имеет " + color + " цвет";
  }
}