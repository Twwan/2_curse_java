public class Furniture {
    protected String material;
    protected String color;
    
    public Furniture(String color, String material) {
        this.color = color;
        this.material = material;
    }
    
    public String info() {
        return "Предмет мебели имеет " + color + " цвет, в качестве материала используется " + material;   
    }
}