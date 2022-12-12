public class Chair extends Furniture {
    protected String place;
    
  public Chair(String color, String material, String place) {
    super(color, material);
    this.place = place;
  }
  
  @Override
  public String info() {
      return "Стул, использующийся в " + place + ", имеет " + color + " цвет, в качестве материала используется " + material;
  }
}