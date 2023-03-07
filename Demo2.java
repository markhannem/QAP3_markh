public class Demo2 {
    public static void main(String[] args) {
        Shape S = new Shape("red", true);
        S.toString();
        System.out.println(S.toString());

        Circle C = new Circle(5.0);
        Circle C1 = new Circle(5.0, "blue", true);
        C.toString();
        System.out.println(C.toString());
        C1.toString();
        System.out.println(C1.toString());
        
        Rectangle R = new Rectangle(2.0, 3.0);
        Rectangle R1 = new Rectangle(2.0, 3.0, "green", false);
        R.toString();
        System.out.println(R.toString());
        R1.toString();
        System.out.println(R1.toString());

        Square Sq = new Square(4.0);
        Square Sq1 = new Square(4.0, "yellow", true);
        Sq.toString();
        System.out.println(Sq.toString());
        Sq1.toString();
        System.out.println(Sq1.toString());

    }
}
