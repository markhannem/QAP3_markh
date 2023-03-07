public class Demo3 {
    public static void main(String[] args) {
        Point P = new Point();
        P.toString();
        System.out.println(P.toString());

        Point P1 = new Point(2.0f, 3.0f);
        P1.toString();
        System.out.println(P1.toString());

        MovablePoint MP = new MovablePoint();
        MP.toString();
        System.out.println(MP.toString());

        MovablePoint MP1 = new MovablePoint(2.0f, 3.0f, 1.0f, 1.0f);
        MP1.toString();
        System.out.println(MP1.toString());
    }
}
