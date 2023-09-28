package Main;

import java.awt.*;
import java.util.ArrayList;

public class Points {
    private ArrayList<Point> pointsOnCircle = new ArrayList<>();
    private int in;
    private int on;
    private int out;

    public Points(ArrayList<Point> pointsOnCircle, int in, int on, int out) {
        this.pointsOnCircle = pointsOnCircle;
        this.in = in;
        this.on = on;
        this.out = out;
    }

    public ArrayList<Point> getPointsOnCircle() {
        return pointsOnCircle;
    }

    public int getInner() {
        return in;
    }

    public int getOn() {
        return on;
    }

    public int getOuter() {
        return out;
    }
}
