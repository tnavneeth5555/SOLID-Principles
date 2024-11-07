import java.util.ArrayList;

class Shape{

    public double area(ArrayList<Rectangle> shape){
        double areaval=0;
        for(Rectangle s : shape){
            areaval += s.area();
        }
        return areaval;
    }
}

class Rectangle extends Shape{

    double length=10.0;
    double width=10.0;

    public double area(){
        return length*width;
    }
}
public class OpenClosedResponsibility {
    public static void main(String[] args) {
        /*
        This principle states that “Software entities (classes, modules, functions, etc.) should be open for extension,
        but closed for modification” which means you should be able to extend a class behavior, without modifying it.

         In the above example area method in shape in clsed for modification and can be extended if any new shape is
         needed like new class Square can be added and it can implement its own logic.
         */
        Shape shape = new Shape();
        Rectangle rectangle = new Rectangle();
        ArrayList<Rectangle> shapesList = new ArrayList<>();
        shapesList.add(rectangle);
        System.out.println(shape.area(shapesList));

    }
}
