package Main;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import static Main.Algorithms.*;
public class Main {

    private static Points getPoints(int range) throws IOException {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<String> coords = readFileArrString(new File("punkty.txt"));
        for(int i = 0; i < range; i++) {
            points.add(new Point(Integer.parseInt(coords.get(i).split(" ")[0]), Integer.parseInt(coords.get(i).split(" ")[1])));
        }

        int radius = 200;
        int in = 0;
        int on = 0;
        int out = 0;
        ArrayList<Point> pointsOn = new ArrayList<>();
        for(Point point : points) {
            double distance = Math.sqrt((Math.pow(point.x - 200, 2)) + (Math.pow(point.y - 200, 2)));
            if(distance < radius) {
                in++;
            } else if(distance == radius) {
                on++;
                pointsOn.add(point);
            } else {
                out++;
            }
        }
        return new Points(pointsOn, in, on, out, points);
    }

    private static void zad4_1() throws IOException {
        Points points = getPoints(10000);

        System.out.println("W okręgu\t" + points.getInner() + "\nNa okręgu\t" + points.getOn() + "\nPo za okręgiem\t" + points.getOuter());
        System.out.println("Współrzędne punktów na okręgu:");
        for(Point p : points.getPointsOnCircle())
            System.out.print("(" + p.x + ", " + p.y + "), ");
    }

    private static double getPIRound(int range) throws IOException {
        Points points = getPoints(range);
        return (((double) points.getInner() + (double) points.getOn()) / (double) range) / 0.25;
    }

    private static void zad4_2() throws IOException {
        System.out.println(getPIRound(1000));
        System.out.println(getPIRound(5000));
        System.out.println(getPIRound(10000));
    }

    private static void zad4_3() throws IOException {
        Points points = getPoints(1700);
        for(int i = 0; i < points.getAllPoints().size(); i++) {
            double piRound = getPIRound(i + 1);
            double epsilonPi = Math.abs(Math.PI - piRound);
            System.out.println(i+1 + "\t" + epsilonPi);
        }
    }

    public static void main(String[] args) throws IOException {
        zad4_3();
    }
}