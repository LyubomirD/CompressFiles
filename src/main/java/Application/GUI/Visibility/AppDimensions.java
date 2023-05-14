package Application.GUI.Visibility;

public class AppDimensions {
    private int width;
    private int height;

    public AppDimensions(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }

    public int setWidth(int width) {
        this.width = width;
        return width;
    }

    public int setHeight(int height) {
        this.height = height;
        return height;
    }
}
