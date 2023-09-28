package Main;

import java.awt.*;
import java.util.ArrayList;

public class Points {
    private ArrayList<Point> pointsOnCircle;
    private ArrayList<Point> allPoints;
    private final int in;
    private final int on;
    private final int out;

    public Points(ArrayList<Point> pointsOnCircle, int in, int on, int out, ArrayList<Point> allPoints) {
        this.pointsOnCircle = pointsOnCircle;
        this.in = in;
        this.on = on;
        this.out = out;
        this.allPoints = allPoints;
    }

    public ArrayList<Point> getPointsOnCircle() {
        return pointsOnCircle;
    }

    public ArrayList<Point> getAllPoints() {
        return allPoints;
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
