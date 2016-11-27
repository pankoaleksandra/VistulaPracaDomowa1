package pracadomowa1;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int field() {
        return width * length;
    }

    public int perimeter() {
        return 2 * width + 2 * length;
    }
}
