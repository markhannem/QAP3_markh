public class Square extends Rectangle{
    
    public Square() {
        super(); // Call superclass Rectangle()
    }

    public Square(double side) {
        super(side, side); // Call superclass Rectangle(double, double)
    }
    
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled); // Call superclass Rectangle(double, double, String, boolean)
    }

    public double getSide() {
        return this.width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    public void setLength(double side) {
        this.width = side;
        this.length = side;
    }

    public String toString() {
        return "A Square with side = " + this.width + ", which is a subclass of " + super.toString();
    }

}
