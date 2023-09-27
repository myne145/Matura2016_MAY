package Main;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import static Main.Algorithms.*;
public class Main {

    private static void zad4_1() throws IOException {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<String> coords = readFileArrString(new File("punkty.txt"));
        for(String s : coords) {
            points.add(new Point(Integer.parseInt(s.split(" ")[0]), Integer.parseInt(s.split(" ")[1])));
        }

        int radius = 200;
        int in = 0;
        int on = 0;
        int out = 0;
        ArrayList<Point> pointsOn = new ArrayList<>();
        for(Point point : points) {
            double distance = Math.sqrt((Math.pow(point.x - 200, 2)) + (Math.pow(point.y - 200, 2)));
//            System.out.println(formula);
            if(distance < radius) {
                in++;
            } else if(distance == radius) {
                on++;
                pointsOn.add(point);
            } else {
                out++;
            }
        }
        System.out.println("W okręgu\t" + in + "\nNa okręgu\t" + on + "\nPo za okręgiem\t" + out);
        System.out.println("Współrzędne punktów na okręgu:");
        for(Point p : pointsOn)
            System.out.print("(" + p.x + ", " + p.y + "), ");
    }
    public static void main(String[] args) throws IOException {
        zad4_1();
    }
}