class Shapes {
        void area(){
            System.out.println("Area of Shapes");
        }
        void perimeter(){
            System.out.println("Perimeter of Shapes");
        }
}

class RectangleShape extends Shapes {
    void area(){
        System.out.println("Area of Rectangle");
    }
    void perimeter(){
        System.out.println("Perimeter of Rectangle");
    }
}

public class liskovResponsibility {
    public static void main(String[] args) {
        /*
        The principle was introduced by Barbara Liskov in 1987
        and according to this principle “Derived or child classes must be substitutable for
        their base or parent classes“.

        Dont not do inheritance for code reusability purpose , do inheritance only when it actually required.
        deriving Rectangle from square class is bad and voilates liskov responsibility , where as rectangle and square should
         be derived from shape class
         */
        RectangleShape rectangle = new RectangleShape();
        rectangle.area();
    }
}
