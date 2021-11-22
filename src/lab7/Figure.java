package lab7;

public class Figure {
}

class Rectangle extends Figure {
    public static int a;
    public static int b;
    static float getAreaOfRectangle () {
        int k;
        return a * b;
    }
    static float getPerimeterOfRectangle () {
        return 2 * (a + b);
    }
}

class Square extends Figure {
    public static int n;
    static float getAreaOfSquare () {
        return n * n;
    }
    static float getPerimeterOfSquare () {
        return 4 * n;
    }
}

class Triangle extends Figure {
    public static int x;
    public static int y;
    public static int z;
    static float getAreaOfTriangle () {
        return 1 / 2 * x * y;
    }
    static float getPerimeterOfTriangle () {
        return x + y + z;
    }
}