package lab2.task1;

public class Box {
    int height;
    int width;
    int depth;

    public int surfaceArea() {
        return 2 * (this.height * this.width + this.height * this.depth + this.width * this.depth);
    }

    public int volume() {
        return this.height * this.width * this.depth;
    }
}
