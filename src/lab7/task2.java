package lab7;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLBoundOperation;

import static lab7.Rectangle.getAreaOfRectangle;
import static lab7.Rectangle.getPerimeterOfRectangle;
import static lab7.Square.getAreaOfSquare;
import static lab7.Triangle.getAreaOfTriangle;
import static lab7.Triangle.getPerimeterOfTriangle;

public class task2 {
    static float rect1A() {
        Rectangle rect1 = new Rectangle();
        rect1.a = 4;
        rect1.b = 5;
        return rect1.getAreaOfRectangle();
    }

    static float rect2A() {
        Rectangle rect2 = new Rectangle();
        rect2.a = 3;
        rect2.b = 7;
        return rect2.getAreaOfRectangle();
    }

    static float tr1A() {
        Triangle tr1 = new Triangle();
        tr1.x = 5;
        tr1.y = 7;
        tr1.z = 8;
        return tr1.getAreaOfTriangle();
    }

    static float tr2A() {
        Triangle tr2 = new Triangle();
        tr2.x = 3;
        tr2.y = 4;
        tr2.z = 5;
        return tr2.getAreaOfTriangle();
    }

    static float sqr1A() {
        Square sqr1 = new Square();
        sqr1.n = 7;
        return sqr1.getAreaOfSquare();
    }

    static float sqr2A() {
        Square sqr2 = new Square();
        sqr2.n = 5;
        return sqr2.getAreaOfSquare();
    }
    static float rect1P() {
        Rectangle rect1 = new Rectangle();
        rect1.a = 4;
        rect1.b = 5;
        return rect1.getPerimeterOfRectangle();
    }

    static float rect2P() {
        Rectangle rect2 = new Rectangle();
        rect2.a = 3;
        rect2.b = 7;
        return rect2.getPerimeterOfRectangle();
    }

    static float tr1P() {
        Triangle tr1 = new Triangle();
        tr1.x = 5;
        tr1.y = 7;
        tr1.z = 8;
        return tr1.getPerimeterOfTriangle();
    }

    static float tr2P() {
        Triangle tr2 = new Triangle();
        tr2.x = 3;
        tr2.y = 4;
        tr2.z = 5;
        return tr2.getPerimeterOfTriangle();
    }

    static float sqr1P() {
        Square sqr1 = new Square();
        sqr1.n = 7;
        return sqr1.getPerimeterOfSquare();
    }

    static float sqr2P() {
        Square sqr2 = new Square();
        sqr2.n = 5;
        return sqr2.getPerimeterOfSquare();
    }

    static float circleA() {
        int r = 4;
        float pi = 3;
        return pi * r * r;
    }

    static float circleP() {
        int r = 4;
        float pi = 3;
        return 2 * pi * r;
    }

    public static void main(String[] args) {
        System.out.println(figureController.getMaxArea());
        System.out.println(figureController.getMaxPerimeter());
    }
}

