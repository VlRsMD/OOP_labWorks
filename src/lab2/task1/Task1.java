package lab2.task1;

public class Task1 {
    public static void main(String[] args) {
        int i = 1;
        Box b1 = new Box();
        b1.height = i;
        b1.width = i;
        b1.depth = i;

        Box b2 = new Box();
        b2.height = 4;
        b2.width = 4;
        b2.depth = 4;

        Box b3 = new Box();
        b3.height = 5;
        b3.width = 4;
        b3.depth = 7;

        // Advanced Level Task
        int ar= b3.surfaceArea();
        int vol = b3.volume();
    }
}
