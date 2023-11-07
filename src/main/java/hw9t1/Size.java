package hw9t1;

import java.util.Objects;

public enum Size {
    S("Small", 20, 30),
    M("Medium", 30, 40),
    L("Large", 40, 50),
    XL("Extra Large", 50, 60);

    private final String sizeName;
    private final int width;
    private final int length;

    Size(String sizeName, int width, int length) {
        this.sizeName = sizeName;
        this.width = width;
        this.length = length;
    }

    public String getSizeName() {
        return sizeName;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return sizeName;
    }

}
