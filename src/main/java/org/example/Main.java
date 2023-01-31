package org.example;

import java.util.logging.Logger;
import java.util.Scanner;


class Point{
    private static final  Logger LOGGER=Logger.getLogger("InfoLogging");
    double x;
    double y;
    Point(double p1,double p2){
        x=p1;
        y=p2;
    }
    String check(double x,double y)
    {
        return ( this.x==x && this.y==y)?"true":"false";

    }
    Point(Point p){
        x=p.x;
        y=p.y;
    }

}

public class Main {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double p1;
        double p2;
        String res;
        LOGGER.info("Enter the first x coordinate:");
        p1 = sc.nextDouble();
        LOGGER.info("Enter the first y coordinate:");
        p2 = sc.nextDouble();
        Point pi = new Point(p1, p2);
        Point pj = new Point(pi);
        LOGGER.info("Enter the Second x coordinate:");
        pj.x = sc.nextDouble();
        LOGGER.info("Enter the Second y coordinate:");
        pj.y = sc.nextDouble();
        res = pi.check(pj.x, pj.y);
        String s = "Result:" + res;
        LOGGER.info(s);
    }
}
