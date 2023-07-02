package Exercise30June;

public class Solution {

    public void drawSquare(int n) {
        String square = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 0 && i < n - 1) {
                    if (j == 0 || j == n - 1) {
                        square += "* ";
                    } else {
                        square += "  ";
                    }
                } else {
                    square += "* ";
                }
            }
            square += "\n";
        }
        System.out.println(square);
    }

    public String drawRectangle(int width, int height) {
        String rectangle = "";
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i > 0 && i < height - 1) {
                    if (j == 0 || j == width - 1) {
                        rectangle += "* ";
                    } else {
                        rectangle += "  ";
                    }
                } else {
                    rectangle += "* ";
                }
            }
            rectangle += "\n";
        }
        return rectangle;
    }

    public void drawTriangle(int n) {
        String triangle = "";
        int height = n - 1;
        int width = (n - 1) * 2;
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j <= width; j++) {
                if (i == 0) {
                    if (j == height) {
                        triangle += "*";
                    } else {
                        triangle += " ";
                    }
                } else if (i > 0 && i < height) {
                    if (j == height - i) {
                        triangle += "*";
                    } else if (j == height + i) {
                        triangle += "*";
                    } else {
                        triangle += " ";
                    }
                }
                else {
                    triangle += "*";
                }
            }
            triangle += "\n";

        }
        System.out.println(triangle);
    }
}


